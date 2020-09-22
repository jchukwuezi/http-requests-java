import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
	
	private static HttpURLConnection connection;
	
	public static void main(String[] args) {
		//Method 1: java.net.HttpURLConnection
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/albums");
			
		  //open connection to api end-point
				try {
					connection = (HttpURLConnection) url.openConnection();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			    }
				
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
