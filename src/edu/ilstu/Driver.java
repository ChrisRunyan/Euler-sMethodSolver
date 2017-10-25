package edu.ilstu;

public class Driver{
	public static void main(String[] args){
		//**Enter step size here:
		float h=(float) 0.2;
		//**
		
		//**Enter known solution of problem here:
		float x=0;
		float y=0;
		//**
		
		//**Enter final value of x we are solving for here:
		float finalValue=(float) 0.4;
		//**
		
		float slope=0;
		float deltaY=0;
		float numIterations=finalValue/h;
		
		for(int i=0; i<numIterations; i++){
			x+=h;
			y+=deltaY;
			
			//**Enter equation in terms of dy/dx:
			slope=(3*x)-(2*x*y);
			//**
			
			deltaY=slope*h;
		}
		System.out.print("y("+finalValue+") = "+y);
	}
}
