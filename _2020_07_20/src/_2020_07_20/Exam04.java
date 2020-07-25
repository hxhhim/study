package _2020_07_20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam04 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("jvms8.pdf");
		FileOutputStream out = new FileOutputStream("jvms8_2.pdf");
		
		long startMillis = System.currentTimeMillis();
		int b;
		while((b=in.read()) !=-1) {
			out.write(b);
			
		}
		long endMillis = System.currentTimeMillis();
		out.close();
		in.close();
		System.out.println(endMillis - startMillis);
	}

}
