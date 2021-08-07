package com.blz.calculatelength;

import com.blz.calculatelength.impl.ArithmeticOp;
import com.blz.calculatelength.interfaceservice.ILength;

public class CalculateLenth {
	public static ILength obj = new ArithmeticOp();
	public static void main(String[] args) {
		System.out.println(obj.Length1());
	//	System.out.println(obj.Length2());
		
	}
	// int x1,x2,y1,y2;
}

