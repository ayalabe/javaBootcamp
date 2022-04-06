package javabootcamp.basic.methods;

import java.util.Iterator;
import java.util.Random;

import java.util.Scanner; 

public class Ranner {
	
	
	// in class:
//	public static void prints() {
//		System.out.println("my name is Ayala, and age is 22");
//	}
//
//	public static void averageGrad(double g1,double g2,double g3) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println((g1 + g2 +g3)/3); 
//	}
//	
//	public static int getMax(int num1, int num2, int num3) {
//		int max = num1;
//		if(num2>max)
//			max = num2;
//		if(num3>max)
//			max = num3;
//		return max;
//		
//	}
	//************
	
	// parts 6
	
	//Q1 - following number
	
	public static int followNumber(int num) {
		int newNum = 0;
		int ten = 1;
		int temp = 0;
		while(num!=0) {
			temp = (num%10);
			if(temp == 9)
				temp = 0;
			else
				temp+=1;
			newNum += temp*ten;
			ten*=10;
			num /= 10;
		}
		return newNum;
	}
	
	//Q2 - Minimum number of digits
	
	public static int minNumberDigits(int num1, int num2) {
		int newNum = 0;
		int dig = 0, ten = 1;
		while(num1!=0 || num2!=0) {
			if(num1 ==0 && num2!=0 || num2 ==0 && num1!=0)  //when the one number is short from other number
				return -1;
			dig = Math.min(num1%10, num2%10);
			newNum += dig*ten;
			ten*=10;
			num1 /= 10;
			num2/= 10;
		}
		return newNum;
	}
	
	//Q3 - Elaborate number
	
	public static boolean elaborateNumber(int num) {
		int sum = 0;
		for(int i = 1; i<num; i++) {
			if(num%i == 0)
				sum += i;
		}
		if(sum == num)
			return true;
		return false;
	}
	
	//Q4
	public static int sumDigits(int num) {
		int sum = 0;
		while(num!=0) {
			num /= 10;
			sum++;
		}
		return sum;
	}
	
	public static int sumDigitIsTen(int[] arr, int arrLength) {
		int count = 0;
		for(int i = 0; i<arrLength; i++) {
			if(sumDigits(arr[i]) == 10)
				count++;
		}
		return count;
	}
	
	private static void ptintTavRhombus(int num, char c) {
		String spac = "_";
		int startSpac = num;
		int andSpac = num;
		for(int i = 0; i<num*2-1; i++) {
			for(int j = 0; j<num*2; j++) {
				
				if(j >= startSpac && j< andSpac && i!=0 && i!=num*2-2) {
					System.out.print(spac);
				}
				else
					System.out.print(c);
			}
			System.out.println();
			if(i>=num-1) {
				startSpac++;
				andSpac--;
			}
			else {
				startSpac--;
				andSpac++;
			}
			
		}
		
	}
	
	//Q6
	public static int sumLin(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static boolean sodooko(int[][] mat) {
		int sumRoe;
		int sumCol;
		for (int i = 0; i < mat.length; i++) {
			sumRoe = sumLin(mat[i]);
			sumCol = 0;
			System.out.println("sumRoe: "+sumRoe);
			for (int j = 0; j < mat[i].length; j++) {
				sumCol += mat[j][i];
			}
			System.out.println("sumCol: "+sumCol);
			if(sumRoe!=sumCol)
				return false;
		}
		return true;
		
	}
	
	//Q7 - Mirror matrix
	
	public static boolean mirrorMatrix(int[][] mat) {
		int andIndex;
		for (int i = 0; i < mat.length; i++) {
			andIndex = mat[0].length-1;
			for (int j = 0; j < mat[i].length/2; j++) {
				System.out.println("mat[i][startIndex]: "+mat[i][j]+" mat[i][andIndex]: "+mat[i][andIndex]);
				if(mat[i][j] != mat[i][andIndex]) 
					return false;
				andIndex--;
				
			}	
		}
		return true;
	}
	
	//****************//
	public static int[] initArrRandom(int length) {
		Random rand = new Random();
		int[] newArr = new int[length];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = rand.nextInt(-100,100);
		}
		return newArr;
	}
	
	public static void sumToArray(int[] arr1, int[] arr2) {
		int[] newArr = arr1;
		int[] temp = arr2;
		if(arr2.length>=arr1.length) {
			newArr = arr2;
			temp = arr1;
		}
		for (int i = 0; i < temp.length; i++) {
			newArr[i] += temp[i];
		}
		 
	}
	
//	public static void copyArr(int[] arr1, int[] arr2) {
//		
//		
//	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Q1
//		System.out.println(followNumber(6789));
		//Q2
//		System.out.println(minNumberDigits(194,456));
		//Q3
//		System.out.println(elaborateNumber(28));
		//Q4
//		System.out.println(sumDigits(12));
//		int[] arr = {1234567890, 123, 1234567890,1};
//		System.out.println(sumDigitIsTen(arr,4));
		//Q5
//		ptintTavRhombus(8,'#');
		
		//Q6
//		int[][] mat = {{2,1,5},{6,7,3},{3,8,0}};
//		System.out.println(sodooko(mat));
		//Q7
//		int[][] mat = {{2,1,5,1,2},{6,7,3,7,6},{0,8,0,8,1}};
//		System.out.println(mirrorMatrix(mat));
		//Q8
		
		
		
		//****************//
//		double x = 10*Math.sin(Math.PI/4);
//		System.out.println(x);
//		System.out.println(Math.toRadians(120));
//		System.out.println(Math.exp(2.5));
		
		int[] arr1 = {3,2,1};
		int[] arr2 = {1,2,2,1};
		sumToArray(arr1,arr2);
		
		
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		}    
		
		
	
		
		
	}
	
	

