package _2020_07_20;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exam14 {

	public static void main(String[] args) throws IOException {
		Board board = new Board("�����Դϴ�","�����Դϴ�","1111");
		board.no =1;
		
		Board2 board2 = new Board2("�����Դϴ�","�����Դϴ�","1111");
		board2.no =1;
		
		FileOutputStream out = new FileOutputStream("Exam089_8.dat");
		BufferedOutputStream out2 = new BufferedOutputStream(out);//Decorator
		ObjectOutputStream out3 = new ObjectOutputStream(out2);//���ڷ�����/Decorator 
		
//		out3.writeObject(board);//Serializable �ʿ�
		out3.writeObject(board2);
		
		out3.close();
		out2.close();
		out.close();
		System.out.println("�����Ͽ����ϴ�.");
		

	}

}
