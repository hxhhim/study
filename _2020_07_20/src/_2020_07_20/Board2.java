package _2020_07_20;

import java.io.Serializable;

public class Board2 implements Serializable{
	int no;
	String title;
	String contents;
	String writer;
	String createdDate;
	int viewCount;
	String password;
	
	public Board2() {
		this.no =1;
		this.title = "�����Դϴ�.";
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.createdDate = str;
		this.password = "1111";
		
	}
	public Board2(String title, String contents, String password) {
		this();
		this.title = title;
		this.contents = contents;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Board[no="+no+",title="+title+", contents="+contents+", writer="+writer+". createdDate="
				+createdDate +", viewCount="+viewCount+", password="+password+"]";
	}
}	
/*
 * ���� �����͸� �����ϴ� �����ڸ� "�� ��ü(VO: Value Object)"�� �θ���.
 * =>�ٸ� ���� "(����Ͻ�) ������ ��ü(Domain Object)"�� �θ���.
 * =>�� �ٸ� ���δ� "������ ���ۿ����� ����ϴ� ��ü(DTO:Data Transfer Object)"�� �θ���.
 * =>������� : VO==DTO==�����ΰ�ü
 */
