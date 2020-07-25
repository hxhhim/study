package _2020_07_20;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exam18 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream in = new FileInputStream("Exam089_10.dat");
		BufferedInputStream in2 = new BufferedInputStream(in);
		ObjectInputStream in3 = new ObjectInputStream(in2);
		
		/*
		 * 출력결과를 보면 평균값은 조작된 값이다.
		 * 저장된 객체의 값을 읽을때, 조작된 값을 읽을 가능성을 최소화시키는 것이 필요하다.
		 * =>기존 인스턴스의 변수 값을 가지고 계산해서 나오는 값은
		 * 	 직렬화대상에서 제외하는 것이 좋다.
		 * =>읽는 쪽에서 다시 계산하는 것이 데이터 신뢰성을 높이는 방법이다.
		 */
		
		Score2 s = (Score2)in3.readObject();//직렬화된 데이터는 캐스팅필요
		s.compute();
		in3.close();
		in2.close();
		in.close();
		System.out.println(s);
		
	

	}

}
