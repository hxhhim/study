package _2020_07_20;

import java.io.Serializable;

public class Score implements Serializable{
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;
	public void compute() {
		this.sum = this.kor + this.math+this.eng;
		this.aver = this.sum/3f;
	}
	@Override
	public String toString() {
		return "Score [name= "+name+",kor="+ kor +", eng="+ eng +", math="+ math +", sum="+ sum +",aver="+ aver +"]";
	}
	
}
