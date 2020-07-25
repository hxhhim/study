package _2020_07_20;

import java.io.FileWriter;
import java.io.IOException;

public class Exam06 {

	public static void main(String[] args) throws Exception {
		FileWriter out  = new FileWriter("test03.dat");
		
		//1)writer(int)
		//=>�Ķ���� ���� �����ڵ��� �����Ѵ�.
		//	FileOutputStream�� �ٸ��� 4����Ʈ �Ķ���� ���߿��� ���� 2����Ʈ�� ����Ѵ�.
		//	��, �׳� ������� �ʰ� ���� ���Ŀ� ���� ����Ѵ�.
		//=>�����ڵ带 OS�⺻ ������������ ��ȯ�Ͽ� ����Ѵ�.
		//	��)A=> 0X0041(�����ڵ�)=>0X41(��°�)
		//	��)��=> 0xAC00(�����ڵ�)=>0XEAB080(utf-8),0XB0A1(MS949)
		
		//					   ��			window OS(ms949) MacOS(UTF-8)
		out.write(100); //0X00000064=>   	0x64 ,			0x64
		out.write(256); // 0X00000100=>  	0X3f, 			0XC480
		out.write(100); // 0X00000064=> 	 0x64 ,			0x64
		out.write(180243);//0X0002co13=> 	0X97D3, 		0XEC9093
		
		out.close();
		System.out.println("�����Ͽ����ϴ�.");
		
	}

}
