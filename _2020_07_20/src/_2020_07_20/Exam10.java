package _2020_07_20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam10 {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("Exam089_4.dat");
		DataOutputStream out2 = new DataOutputStream(out);
		
		int value = 0X2a883c65;
		
		//FileOutputStream�� ���� ������� ����,
		//DataOutputStream�� ����ؼ� int ���� ����ϸ�
		//�ڵ��� �ξ� ��������.
		out2.writeInt(value);
		out.close();
				
		System.out.println("�����Ͽ����ϴ�.");
		FileInputStream in = new FileInputStream("Exam089_4.dat");
		DataInputStream in2 = new DataInputStream(in);
		
		int val =in2.readInt();
		in.close();
		System.out.printf("0x%x\n",val);

	}

}
