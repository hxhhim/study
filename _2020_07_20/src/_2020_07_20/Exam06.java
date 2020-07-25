package _2020_07_20;

import java.io.FileWriter;
import java.io.IOException;

public class Exam06 {

	public static void main(String[] args) throws Exception {
		FileWriter out  = new FileWriter("test03.dat");
		
		//1)writer(int)
		//=>파라미터 값이 유니코드라고 가정한다.
		//	FileOutputStream과 다르게 4바이트 파라미터 값중에서 끝네 2바이트를 출력한다.
		//	단, 그냥 출력하지 않고 다음 공식에 따라 출력한다.
		//=>유니코드를 OS기본 문자집합으로 변환하여 출력한다.
		//	예)A=> 0X0041(유니코드)=>0X41(출력값)
		//	예)가=> 0xAC00(유니코드)=>0XEAB080(utf-8),0XB0A1(MS949)
		
		//					   값			window OS(ms949) MacOS(UTF-8)
		out.write(100); //0X00000064=>   	0x64 ,			0x64
		out.write(256); // 0X00000100=>  	0X3f, 			0XC480
		out.write(100); // 0X00000064=> 	 0x64 ,			0x64
		out.write(180243);//0X0002co13=> 	0X97D3, 		0XEC9093
		
		out.close();
		System.out.println("저장하였습니다.");
		
	}

}
