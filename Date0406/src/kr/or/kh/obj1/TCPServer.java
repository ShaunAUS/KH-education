package kr.or.kh.obj1;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


//서버
public class TCPServer extends Thread {
	private InputStream is;
	private OutputStream os;
	private ServerSocket serverSocket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Socket socket;
	
	
	@Override
	public void run() {
		
			try {
				serverSocket= new ServerSocket(5000);
				System.out.println("요청대기:");
				socket = serverSocket.accept();
				System.out.println("접속한 클라이언트"+socket.getInetAddress());
				is = socket.getInputStream();
				os = socket.getOutputStream();
				ois = new ObjectInputStream(is);
				oos = new ObjectOutputStream(os);
				String msg = (String)ois.readObject();
				System.out.println("클라이언트에서 보낸 메시지:"+msg);
				String retMsg = "서버로부터 되돌아온 메세지"+msg;
				socket.close();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		
	}
	
	public static void main(String[] args) {
		new TCPServer().start();
	}

}
