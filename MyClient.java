package Lab3;
import java.io.*;
import java.net.*;

public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Socket s=new Socket("localhost",6666);
			DataOutputStream out=new DataOutputStream(s.getOutputStream());
			out.writeUTF("Connected Server");
			out.flush();
			out.close();
			s.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
