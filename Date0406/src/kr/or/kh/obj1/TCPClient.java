package kr.or.kh.obj1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	private InputStream 	is;
	private OutputStream	os;
	private Socket 			socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	public BufferedReader input;
	private String rMsg;
	public void start() {
		try {
			socket= new Socket("1.220.236.76",5000);

				sendMessage(socket);
				receiveMessage(socket);
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	private void receiveMessage(Socket socket) {
		try {
			is = socket.getInputStream();
			ois =new ObjectInputStream(is);
			rMsg=(String)ois.readObject();
			System.out.println(rMsg);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
 	}
	private void sendMessage(Socket socket) {
		try {
			os= socket.getOutputStream();
			oos = new ObjectOutputStream(os);
			input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("보낼 메세지:");
			String sMsg= input.readLine();
			oos.writeObject(sMsg);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
			TCPClient tcpclient = new TCPClient();
			tcpclient.start();
	}
}
