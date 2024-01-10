package org.TUNA.day13.file.calculator;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class CalcClient {
	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 8888;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		InputStream is = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			// 계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 24 + 42
			// 계산 결과 66
			Socket socket = new Socket(address, port);
			System.out.println("서버와의 연결을 기다리고 있습니다..."); // 클라의 소켓이 만들어짐
			//os = new FileOutPutStream("");  내가 직접 객체 생성해서 쓰는 것이 아니라
			os = socket.getOutputStream(); // 소켓의 출력스트림을 사용해야함.(시험에도 나옴 1/18일)
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 42) >> ");
			String sendMsg = sc.nextLine();
			
			// ====== 입력받은 값 바이트로 보내기 ======
			dos.writeUTF(sendMsg);
			dos.flush();
//			byte [] data = sendMsg.getBytes();
//			os.write(null);
//			os.flush();
			// =========================================
			
			
			// ============= 서버로 보내기 =============
			String recvMsg = dis.readUTF();
			System.out.print("계산결과 : "+ recvMsg);
//			int readByteCount;
//			data = new byte[1024];
//			readByteCount = is.read(data);
//			String recvMsg = new String(data, 0, readByteCount);
//			System.out.println("계산결과 : " + recvMsg);
			// =========================================
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
