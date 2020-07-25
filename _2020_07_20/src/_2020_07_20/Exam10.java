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
		
		//FileOutputStream을 직접 사용하지 말고,
		//DataOutputStream을 사용해서 int 값을 출력하면
		//코딩이 훨씬 쉬워진다.
		out2.writeInt(value);
		out.close();
				
		System.out.println("실행하였습니다.");
		FileInputStream in = new FileInputStream("Exam089_4.dat");
		DataInputStream in2 = new DataInputStream(in);
		
		int val =in2.readInt();
		in.close();
		System.out.printf("0x%x\n",val);

	}

}
