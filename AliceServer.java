import java.net.*;
import java.io.*;

public class AliceServer {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a server on port 9000
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9000);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while(true){
		try(
			
				
			//when there is a connection from server(wait till then)
			Socket clientSocket = serverSocket.accept();
				
			//open writer to write to client
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
				
			//create reader to read from client
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				
			
		)//end try
		
		{
			String inputLine;
			
			
				
					
					//while there is input from client, send it back to client
					while ((inputLine = in.readLine()) != null) {
						out.println(inputLine);
					}
					
					
				
			
		}catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
	

}
