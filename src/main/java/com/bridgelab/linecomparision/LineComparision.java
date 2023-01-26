package com.bridgelab.linecomparision;

import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program"); 
        Line line1 = getLine();
        double lengthofLine = getLength(line1);
        System.out.println("length of line 1 is: " + lengthofLine);
        System.out.println("Enter the value for second line");
        Line line2 = getLine();
        double lengthofLine2 = getLength(line2);
        System.out.println("length of line 1 is " +lengthofLine2);
        System.out.println(line1);
        System.out.println(line2);
        if(line1.equals(line2)) 
        	System.out.println("both lines are equal");
        else
            System.out.println("both lines are not equal");
	} 
     public static Line getLine() {
    	 double x1,y1,x2,y2;
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter value for x1");
         x1 = scan.nextDouble();
         System.out.println("Enter value for y1");
         y1 = scan.nextDouble();
         System.out.println("Enter value for x2");
         x2 = scan.nextDouble();
         System.out.println("Enter value for y2");
         y2 = scan.nextDouble();
         Line line = new Line(x1,y1,x2,y2);
         return line;
     }
        public static  double getLength(Line line) { 
        	double lengthofLine = Math.sqrt(Math.pow(line.x2 - line.x1, 2) + Math.pow(line.y2 -line.y1, 2));
         return lengthofLine;
 	}
}
