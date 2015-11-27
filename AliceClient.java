import java.net.*;
import java.io.*;
import java.util.*;

public class AliceClient {

	public static void main(String[] args) {
		
		if(args.length != 1){
			System.exit(0);
		}
		
		
		String userInput = "temp string";
		String userGoodbye = "bye";		
		try {
			//create a connection to server
			Socket echoSocket = new Socket("localhost", 9000);
			
			//open a stream for writing characters to server
			PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
			
			//create a reader to read characters back from server
			BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
			
			//create a reader to read from console on the client side
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			
			
			//read from command line
			while(userInput != userGoodbye){
				userInput = stdIn.readLine();
				
				//looking for the user to say any form of bye
				if (userInput.toLowerCase().indexOf(userGoodbye) != -1 ) {
					echoSocket.close();
					break;
					}

				//send user input to server (communicate with server)
				out.println(userInput);
				//read input from server and print
				System.out.println(in.readLine());
			}
			echoSocket.close();
				
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}//end main


}
