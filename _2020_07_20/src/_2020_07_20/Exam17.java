package _2020_07_20;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exam17 {

	public static void main(String[] args) throws IOException {
		Score2 s = new Score2();
		s.name = "홍길동";
		s.kor = 100;
		s.math = 50;
		s.eng = 50;
		s.compute();
		FileOutputStream out = new FileOutputStream("Exam089_10.dat");
		BufferedOutputStream out2 = new BufferedOutputStream(out);
		ObjectOutputStream out3 = new ObjectOutputStream(out2);
		
		s.aver = 90.5f;
		out3.writeObject(s);
		
		out3.close();
		out2.close();
		out.close();
		System.out.println("실행하였습니다.");

	}

}
