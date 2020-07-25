package _2020_07_20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataOutputStream
 * =>자바 원시 타입데이터를 바이트배열로 바꿔 출력하는 일을 한다.
 * DateInputStream
 * => 바이트 배열을 읽어 자바원시 타입 데이터로 복원시키는 일을 한다.
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
		System.out.println("실행하였습니다.");
		
		

	}

}
