package _2020_07_20;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
				
		FileInputStream in = new FileInputStream("Exam11.dat");
		//두대상을 연결하고 데이터를 전송 할수 있는 무언가가 필요한데 이것을 스트림
		//스트림이란 데이터를 운반하는데 사용된 연결통로이다.
		//데이터 입출력 처리의 중간자 역활
		byte[] bytes = new byte[1024];
		
		int i = 0;
		int b;
		while(true) {
			b= in.read();//왜 int로 받는지??
						 //read()의 반환값의 범위가 0~255와 -1이기때문에 byte로 받을수가 없다
						 //byte범위 -128~127 
			if(b==-1) {
				break;
			}
			bytes[i++]=(byte)b;
			sc.nextLine();
		}
		in.close();
		System.out.println("읽었습니다.");
		for(int x=0;x<i;x++) {
			System.out.printf("%d ",bytes[x]);
		}
		System.out.println();
	}

}
