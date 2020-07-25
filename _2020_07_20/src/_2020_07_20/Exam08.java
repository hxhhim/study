package _2020_07_20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������ ���� ��Ʈ�� Ŭ����:BufferedOutputStream/BufferedInputStream
 * =>���� ������ �����͸� �а� ���� ����.
 * =>�߰����� �����͸� �����ϴ� ���� �Ѵ�.
 * =>���� ����� �����Ѵ�.
 */
public class Exam08 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("jvms8.pdf");
		BufferedInputStream in2 = new BufferedInputStream(in);
		
		FileOutputStream out = new FileOutputStream("jvms8_3.pdf");
		BufferedOutputStream out2 = new BufferedOutputStream(out);
		
		long startMillis = System.currentTimeMillis();
		int b;
		while((b= in2.read()) !=-1) {
			out2.write(b);
		}
		long endMillis = System.currentTimeMillis();
		//BufferedOutputStream�� close()�� 
		//���ۿ� ���� �ִ� �����͸� ���Ϸ� �������� ����� �����ϱ� ������
		//�ݵ�� ȣ���ؾ� �Ѵ�.
		out2.close();
		out.close();
		in2.close();
		in.close();
		System.out.println(endMillis-startMillis);
		
	
	
		

	}

}
