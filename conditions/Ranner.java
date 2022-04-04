package javabootcamp.basic.conditions;

import java.util.Scanner;

public class Ranner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Q1
		System.out.println("Enter a radius of circle:");
		float radius = scanner.nextFloat();
		float circumference = (float) (2*Math.PI*radius);
		float area = (float) (Math.PI * Math.pow(radius, 2));
		System.out.println("The circumference of circle:" + circumference);
		System.out.println("The area of circle:" + area);
		//Q3
		System.out.println("Enter the price of the sofa:");
		float price_sofa = scanner.nextFloat();
		System.out.println("Enter the weight of the sofa:");
		float weight = scanner.nextFloat();
		System.out.println("Enter the distance you live:");
		float distance = scanner.nextFloat();
		System.out.println("Enter the floor where you live:");
		int floor = scanner.nextInt();
		
		float final_expenditure = (float) (5*distance + floor*weight +0.1*price_sofa + price_sofa);
		System.out.println("The final expense price for the purchase: "+final_expenditure);
		// closing the scanner object
				scanner.close();
	
	}

}
