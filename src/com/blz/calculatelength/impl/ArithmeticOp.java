package com.blz.calculatelength.impl;

import com.blz.calculatelength.dto.UserInputs;
import com.blz.calculatelength.interfaceservice.ILength;
import com.blz.calculatelength.scannerinputs.UserScan;

public class ArithmeticOp implements ILength {
   UserInputs obj = new UserInputs();
  
   public void Inputcor(){
		
		System.out.print("enter x1 point");
		obj.setX1(UserScan.IntInput()); 
		System.out.print("enter y1 point");
		obj.setY1(UserScan.IntInput()); 
		System.out.print("enter x2 point");
		obj.setX2(UserScan.IntInput()); 
		System.out.print("enter y2 point");
		obj.setY2(UserScan.IntInput()); 
		System.out.println("length of the line is :");
		}
	public double Length1() {
		// TODO Auto-generated method stub
		Inputcor();
		double d1 =  Math.sqrt((obj.getX2() - obj.getX1()) * (obj.getX2() - obj.getX1()) + (obj.getY2() - obj.getY1()) * (obj.getY2() - obj.getY1()));
		return d1;
	}

//	@Override
//	public double Length2() {
	//	Inputcor();
		// TODO Auto-generated method stub
//		double d2 = (long) Math.sqrt((obj.getX2() - obj.getX1()) * (obj.getX2() - obj.getX1()) + (obj.getY2() - obj.getY1()) * (obj.getY2() - obj.getY1()));
//		return d2;
//	}

}
