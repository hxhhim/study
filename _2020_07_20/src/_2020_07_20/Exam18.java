package _2020_07_20;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exam18 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream in = new FileInputStream("Exam089_10.dat");
		BufferedInputStream in2 = new BufferedInputStream(in);
		ObjectInputStream in3 = new ObjectInputStream(in2);
		
		/*
		 * ��°���� ���� ��հ��� ���۵� ���̴�.
		 * ����� ��ü�� ���� ������, ���۵� ���� ���� ���ɼ��� �ּ�ȭ��Ű�� ���� �ʿ��ϴ�.
		 * =>���� �ν��Ͻ��� ���� ���� ������ ����ؼ� ������ ����
		 * 	 ����ȭ��󿡼� �����ϴ� ���� ����.
		 * =>�д� �ʿ��� �ٽ� ����ϴ� ���� ������ �ŷڼ��� ���̴� ����̴�.
		 */
		
		Score2 s = (Score2)in3.readObject();//����ȭ�� �����ʹ� ĳ�����ʿ�
		s.compute();
		in3.close();
		in2.close();
		in.close();
		System.out.println(s);
		
	

	}

}
