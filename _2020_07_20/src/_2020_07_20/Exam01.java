package _2020_07_20;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
				
		FileInputStream in = new FileInputStream("Exam11.dat");
		//�δ���� �����ϰ� �����͸� ���� �Ҽ� �ִ� ���𰡰� �ʿ��ѵ� �̰��� ��Ʈ��
		//��Ʈ���̶� �����͸� ����ϴµ� ���� ��������̴�.
		//������ ����� ó���� �߰��� ��Ȱ
		byte[] bytes = new byte[1024];
		
		int i = 0;
		int b;
		while(true) {
			b= in.read();//�� int�� �޴���??
						 //read()�� ��ȯ���� ������ 0~255�� -1�̱⶧���� byte�� �������� ����
						 //byte���� -128~127 
			if(b==-1) {
				break;
			}
			bytes[i++]=(byte)b;
			sc.nextLine();
		}
		in.close();
		System.out.println("�о����ϴ�.");
		for(int x=0;x<i;x++) {
			System.out.printf("%d ",bytes[x]);
		}
		System.out.println();
	}

}
