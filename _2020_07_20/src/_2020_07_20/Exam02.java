package _2020_07_20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam02 {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("Exam087_7.dat");
		
		byte[] bytes = {10,20,30,40,50,60,70,80,90,100};
	  //out.write(bytes,0,10);//write(�迭,�����ε���,����� ����)
		out.write(bytes);
		out.close();
		System.out.println("�����Ͽ����ϴ�.");
	}

}
