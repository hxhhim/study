package _2020_07_20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileOutputStream out = new FileOutputStream("Exam11.dat");
		
		byte[] bytes= {10,20,30,40,50,60,70,80,90,100};
		
		for(int i = 0; i<bytes.length;i++) {
			out.write(bytes[i]);
			sc.nextLine();
		}
		out.close();
		System.out.println("저장하였습니다.");
		
		File f = new File("Exam11.dat");
		FileInputStream in = new FileInputStream(f);
		
		int b;
		b= in.read();
		System.out.println(Integer.toHexString(b));
		for(int i=0; i<9; i++) {
		System.out.println(Integer.toHexString(in.read()));
		}
		in.close();
		System.out.println("읽었습니다.");
	}

}
