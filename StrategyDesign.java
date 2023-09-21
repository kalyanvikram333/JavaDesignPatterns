package com.ds.finals;

import java.util.Calendar;

interface Calculator{
	public float calculation(int a, int b);
}

class Addition implements Calculator{
	public float calculation(int a, int b) {
		return a+b;
	}
}
class Subtraction implements Calculator{
	public float calculation(int a, int b) {
		return a-b;
		
	}
}
class Multiplication implements Calculator{
	public float calculation(int a, int b) {
		return a*b;
	}
}

class Query{
	private Calculator cal;
	public Query(Calculator cal1) {
		cal=cal1;
	}
	public float executeQuery(int a, int b) {
		return cal.calculation(a, b);
	}
}


public class StrategyDesign {

	public static void main(String[] args) {
		Query q=new Query(new Addition());
		System.out.println(q.executeQuery(1, 2));
		q=new Query(new Subtraction());
		System.out.println(q.executeQuery(2, 1));
		q=new Query(new Multiplication());
		System.out.println(q.executeQuery(3, 4));

	}

}
