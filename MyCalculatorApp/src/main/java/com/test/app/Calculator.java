package com.test.app;

public class Calculator {
	
	
	private float a,b;
	
	public Calculator(float a,float b) {
		this.a = a;
		this.b = b;
	}
	
	
	public float add(){
		return a+b;
	}
	
	public float subtract(){
		return a-b;
	}

	public float multiply(){
		return a*b;
	}
	
	public float devide(){
		if(b==0){
			System.out.println(("Devide by zero exception"));
			return -1;
		}
		return a/b;
	}
}
