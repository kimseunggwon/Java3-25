package P18.lecture.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class A03SocketClient {
     public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("172.30.1.58",5001));
			System.out.println("[연결 성공]");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
