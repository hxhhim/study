package _2020_07_20;

import java.io.Serializable;

public class Score2 implements Serializable{
	String name;
	int kor;
	int eng;
	int math;
	
	//���� �ν��Ͻ� ������ ���� ������ ����ؼ� �� ����� �����ϴ� ������ 
	//����ȭ��󿡼� ����(���Ϸ� ������� ���ƶ�!)�ؾ� �Ѵ�.
	//�д� �ʿ��� �ٽ� ����ϴ� ���� ������ �ŷڼ��̳� ���ȿ� �����ϴ�.
	//=>���?transient�� �����Ѵ�.
	
	transient int sum;
	transient float aver;
	public void compute() {
		this.sum = this.kor + this.math+this.eng;
		this.aver = this.sum/3f;
	}
	@Override
	public String toString() {
		return "Score [name= "+name+",kor="+ kor +", eng="+ eng +", math="+ math +", sum="+ sum +",aver="+ aver +"]";
	}
	
}
