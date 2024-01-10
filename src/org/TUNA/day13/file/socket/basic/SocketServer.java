package org.TUNA.day13.file.socket.basic;

import java.io.IOException;
import java.net.*;

public class SocketServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다.."); // 서버 먼저 실행 -> 클리이언트 실행
			Socket socket = serverSocket.accept();
			System.out.println("연결이 완료되었습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
