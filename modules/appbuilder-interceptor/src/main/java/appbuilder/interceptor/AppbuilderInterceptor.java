package appbuilder.interceptor;

import static appbuilder.interceptor.constants.AppBuilderInterceptorConstants.FORM_NAME;
import static appbuilder.interceptor.constants.AppBuilderInterceptorConstants.OPTIONS_PROPERTY;
import static appbuilder.interceptor.constants.AppBuilderInterceptorConstants.T_SHIRT_LABEL;

import com.liferay.dynamic.data.lists.model.DDLRecord;
import com.liferay.dynamic.data.mapping.model.DDMFormField;
import com.liferay.dynamic.data.mapping.model.DDMFormFieldOptions;
import com.liferay.dynamic.data.mapping.storage.DDMFormFieldValue;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.util.Locale;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import commerce.integration.api.service.CommerceInvoker;

/**
 * @author marcialcalvo
 */
@Component(immediate = true, service = ModelListener.class)
public class AppbuilderInterceptor extends BaseModelListener<DDLRecord> {

	private static Log _log = LogFactoryUtil.getLog(AppbuilderInterceptor.class);

	@Reference
	private CommerceInvoker commerceInvoker;

	@Override
	public void onBeforeUpdate(DDLRecord model) throws ModelListenerException {

		try {
			if (isExpectedForm(model) && hasStatusApproved(model)) {

				_log.info("Entry approved");

				String tShirtSize = getSelectedTShirt(model);

				commerceInvoker.addSku(tShirtSize);
			}

		} catch (PortalException e) {
			_log.error(e);
		}

		super.onBeforeUpdate(model);

	}

	protected String getSelectedTShirt(DDLRecord model) throws PortalException {
		String tShirtSize = "";

		for (DDLRecord ddlRecord : model.getRecordSet().getRecords()) {
			for (DDMFormFieldValue ddmFormFieldValue : ddlRecord.getDDMFormValues().getDDMFormFieldValues()) {
				DDMFormField ddmFormField = ddmFormFieldValue.getDDMFormField();
				if (T_SHIRT_LABEL.equals(ddmFormField.getLabel().getString(Locale.ENGLISH))) {
					DDMFormFieldOptions ddmFormFieldOptions = (DDMFormFieldOptions) ddmFormField
							.getProperty(OPTIONS_PROPERTY);
					String fieldValue = ddmFormFieldValue.getValue().getString(Locale.ENGLISH);

					tShirtSize = ddmFormFieldOptions.getOptions().get(fieldValue).getString(Locale.ENGLISH);
					break;
				}
			}
		}

		_log.info("Talla camiseta solicitada --> " + tShirtSize);

		return tShirtSize;
	}

	protected boolean isExpectedForm(DDLRecord model) throws PortalException {
		boolean response = false;
		if (FORM_NAME.equals(model.getRecordSet().getName(Locale.ENGLISH))) {
			response = true;
		}
		return response;
	}

	protected boolean hasStatusApproved(DDLRecord model) throws PortalException {
		boolean response = false;
		if (WorkflowConstants.STATUS_APPROVED == model.getStatus()) {
			response = true;
		}
		return response;

	}

}