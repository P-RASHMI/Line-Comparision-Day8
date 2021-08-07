package com.bdlz.day8uc3;

import com.bdlz.day8uc3.dto.UserInputs;
import com.bdlz.day8uc3.impl.ArithmeticOp;
import com.bdlz.day8uc3.inpututilities.InputUtilities;
import com.bdlz.day8uc3.interfaceservice.ILength;

public class Distancethree {

	public static UserInputs inputs = new UserInputs();
    public static ILength obj = new ArithmeticOp();
    
    public static void Coordinates() {
        System.out.print("Enter Your First Point Co-Ordinate x1 : ");
        inputs.setX1(InputUtilities.intInput());
        System.out.print("Enter Your First Point Co-Ordinate y1 : ");
        inputs.setY1(InputUtilities.intInput());
        System.out.print("Enter Your Second Point Co-Ordinate x2 : ");
        inputs.setX2(InputUtilities.intInput());
        System.out.print("Enter Your Second Point Co-Ordinate y2 : ");
        inputs.setY2(InputUtilities.intInput());

    }

    public static void main(String[] args) {
        System.out.println("Enter Line Co-ordinates ");
        Coordinates();
        float firstLineLength=(float)obj.lenLineOne();
        System.out.println("Length of First Line : " + firstLineLength);
        System.out.println("\nEnter Second Line Co-ordinates \n------------------------------");
        Coordinates();
        float secondLineLength=(float)obj.lenLineTwo();
        System.out.println("Length of Second Line : " + secondLineLength);
        Compare(firstLineLength,secondLineLength);
    }
    
    public static void Compare(float a,float b){
    	if (a>b){
            System.out.println("\nFirst Line is greater than Second Line");
        }
    	else if (a<b) {
            System.out.println("\nSecond Line is greater than First Line");
        }
        else {
            System.out.println("\nBoth First and Second Lines are EQUAL");
        } 
    }
}
