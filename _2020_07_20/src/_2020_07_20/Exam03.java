package _2020_07_20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exam03 {
	
	public static int Read(FileInputStream in, byte[]bytes) throws IOException {
		int b;
		int i=0;
		while((b=in.read()) !=-1) {
			bytes[i++] = (byte)b;
		}
			
		return i;
	}

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("EXam087_7.dat");
		
		byte[] bytes = new byte[1024];
	//	int len = in.read(bytes);
		int len = Read(in,bytes);
		
		//��������� 2���϶� 2���� �о �о�ð� ���������� �ݺ�
		//read�� ������ �о����� �������־�� ����
		
		in.close();
		System.out.println("�о����ϴ�.");
		for(int x=0; x<len;x++) {
		System.out.printf("%d ",bytes[x]);
		}
		System.out.println();
		

	}

}
