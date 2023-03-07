package Lab3;
import java.io.*;
import java.net.*;
public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept();
			DataInputStream in=new DataInputStream(s.getInputStream());
			String str=(String)in.readUTF();
			System.out.println("Message :"+str);
			ss.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
