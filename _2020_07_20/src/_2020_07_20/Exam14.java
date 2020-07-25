package _2020_07_20;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exam14 {

	public static void main(String[] args) throws IOException {
		Board board = new Board("제목입니다","내용입니다","1111");
		board.no =1;
		
		Board2 board2 = new Board2("제목입니다","내용입니다","1111");
		board2.no =1;
		
		FileOutputStream out = new FileOutputStream("Exam089_8.dat");
		BufferedOutputStream out2 = new BufferedOutputStream(out);//Decorator
		ObjectOutputStream out3 = new ObjectOutputStream(out2);//데코레이터/Decorator 
		
//		out3.writeObject(board);//Serializable 필요
		out3.writeObject(board2);
		
		out3.close();
		out2.close();
		out.close();
		System.out.println("실행하였습니다.");
		

	}

}
