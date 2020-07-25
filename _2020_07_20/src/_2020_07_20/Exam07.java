package _2020_07_20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam07 {

	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader("test03.dat");
		
		int b;
		//1) read():int => 영어는 1바이트, 그 밖의 문자는 2바이트 또는 3바이트를 읽는다.
		// 	 =>유니코드로 변환하여 리턴한다.
		b = in.read();
		System.out.println(Integer.toHexString(b));
		System.out.println(Integer.toHexString(in.read()));
		System.out.println(Integer.toHexString(in.read()));
		System.out.println(Integer.toHexString(in.read()));
		
		//입/출력 도구는 사용 후 반드시 close() 하도록 해라.
		in.close();
		System.out.println("읽었습니다.");
		
	}

}
