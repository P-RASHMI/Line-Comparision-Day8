package com.blz.day8uc2.impl;

import com.blz.day8uc2.dto.UserInputs;
import com.blz.day8uc2.interfaceservice.ILength;

public class ArithmeticOp implements ILength {
	 UserInputs obj = new UserInputs();
	  public double lenLineOne() {
	        double lenFirstLine = Math.sqrt((Math.pow((obj.getX2() - obj.getX1()), 2)) + (Math.pow((obj.getY2() - obj.getY1()), (2))));
	        return lenFirstLine;
	    }
	    public double lenLineTwo() {
	        double lenSecondLine = Math.sqrt((Math.pow((obj.getX2() - obj.getX1()), 2)) + (Math.pow((obj.getY2() - obj.getY1()), (2))));
	        return lenSecondLine;
	    }
	    public void compare(){

	    }

}
