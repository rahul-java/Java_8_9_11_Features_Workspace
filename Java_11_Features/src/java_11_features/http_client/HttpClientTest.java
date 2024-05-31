package java_11_features.http_client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientTest {

	public static void main(String[] args) {
		
		HttpClient httpClient = HttpClient.newBuilder()
		.version(Version.HTTP_2)
		.connectTimeout(Duration.ofSeconds(10))
		.build();
		
		try {
			HttpRequest httpRequest = HttpRequest.newBuilder()
			.uri(URI.create("http://www.google.com"))
			.GET()
			.build();
			
			HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
			
			System.out.println("Status Code : "+httpResponse.statusCode());
			System.out.println("Headers : "+httpResponse.headers().allValues("content-type"));
			System.out.println("Body : "+httpResponse.body());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
