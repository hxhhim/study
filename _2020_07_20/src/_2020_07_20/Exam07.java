package _2020_07_20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam07 {

	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader("test03.dat");
		
		int b;
		//1) read():int => ����� 1����Ʈ, �� ���� ���ڴ� 2����Ʈ �Ǵ� 3����Ʈ�� �д´�.
		// 	 =>�����ڵ�� ��ȯ�Ͽ� �����Ѵ�.
		b = in.read();
		System.out.println(Integer.toHexString(b));
		System.out.println(Integer.toHexString(in.read()));
		System.out.println(Integer.toHexString(in.read()));
		System.out.println(Integer.toHexString(in.read()));
		
		//��/��� ������ ��� �� �ݵ�� close() �ϵ��� �ض�.
		in.close();
		System.out.println("�о����ϴ�.");
		
	}

}
