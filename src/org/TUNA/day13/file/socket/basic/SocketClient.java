package org.TUNA.day13.file.socket.basic;

import java.io.*;
import java.net.*;

public class SocketClient {
	public static void main(String[] args) {
		String address = "127.0.0.1"; // 통신하고 싶은 IP
		int port = 8888;
		try {
			Socket socket = new Socket(address, port);
			System.out.println("서버와 연결되었습니다."); //서버 먼저 실행 -> 클라이언트 실행
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
