package rest.consumer.api;

public interface RestConsumer {

	public String get(String endpoint, Credentials credentials, String body);

	public String post(String endpoint, Credentials credentials, String body);
	
	public String patch(String endpoint, Credentials credentials, String body);

}
