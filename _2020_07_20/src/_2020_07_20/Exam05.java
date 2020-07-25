package _2020_07_20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam05 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("jvms8.pdf");
		FileOutputStream out = new FileOutputStream("jvms8_2.pdf");

		long startMillis = System.currentTimeMillis();
		
		byte[] bytes = new byte[8192];
		
		int len = 0;
		
		while((len = in.read(bytes)) != -1){
			out.write(bytes,0,len);
			
		}
		long endMillis = System.currentTimeMillis();
		out.close();
		in.close();
		System.out.println(endMillis- startMillis);
	}

}
