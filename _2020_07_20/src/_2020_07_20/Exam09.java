package _2020_07_20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataOutputStream
 * =>�ڹ� ���� Ÿ�Ե����͸� ����Ʈ�迭�� �ٲ� ����ϴ� ���� �Ѵ�.
 * DateInputStream
 * => ����Ʈ �迭�� �о� �ڹٿ��� Ÿ�� �����ͷ� ������Ű�� ���� �Ѵ�.
 */
public class Exam09 {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("EXam0892_2.dat");
		
		
		int value = 0X2a883c65;
		out.write(value>> 24);
		out.write(value>> 16);
		out.write(value>> 8);
		out.write(value);
		out.close();
		FileInputStream in = new FileInputStream("EXam0892_2.dat");
		int ret;
		ret = in.read() << 24;
		System.out.printf("ret: 0x%x\n",ret);
		ret += in.read() << 16;
		System.out.printf("ret: 0x%x\n",ret);
		ret += in.read() << 18;
		System.out.printf("ret: 0x%x\n",ret);
		ret += in.read();
		System.out.printf("ret: 0x%x\n",ret);
		System.out.printf("ret : 0x%x\n",ret);
		System.out.println("�����Ͽ����ϴ�.");
		
		

	}

}
