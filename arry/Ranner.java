package javabootcamp.basic.arry;

import java.util.Iterator;
import java.util.Scanner; 

public class Ranner {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		int[][] arr = {
//				{1, -2, 3},
//				{-4, -5, 6, 9},
//				{7}
//		};
//		for(int i = 0; i<arr.length; i++) {
//			for(int j = 0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		for(int[] row:arr) {
//			for(int element:row) {
//				System.out.print(element+" ");
//			}
//			System.out.println();
//		}
		//DEEP COPY ARRAY
//		int[] arr = {1,2,3,4};
//		int[] arrCopy = new int[arr.length];
//		for(int i = 0; i<arr.length; i++) {
//			arrCopy[i] = arr[i]*arr[i];
//		}
//		System.out.println("Orginal array: ");
//		for(int element:arr) {
//			System.out.print(element+" ");
//		}
//		System.out.println();
//		System.out.println("arrCopy: ");
//		for(int element:arrCopy) {
//			System.out.print(element+" ");
//		}
		
		//chapter 5
		//Q1 - Check if the arrays are a polindrm
		
////		int[] arr1 = new int[5];
////		int[] arr2 = new int[5];
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = {5,4,3,2,1};
//		
//		int j = arr1.length - 1;
//		
//		boolean flag = true;
//		
////		for(int i = 0; i<arr1.length; i++) {
////			System.out.println("Pleas enter a namber:");
////			arr1[i] = scanner.nextInt();
////		}
////		for(int i = 0; i<arr2.length; i++) {
////			System.out.println("Pleas enter a namber:");
////			arr2[i] = scanner.nextInt();
////		}
//		
//		for(int i = 0; i<arr1.length; i++) {
//			if(arr1[i] != arr2[j]) {
//				flag = false;
//				break;
//			}
//			j--;
//		}
//		if(flag)
//			System.out.println("The collections are reversed");
//		else
//			System.out.println("The collections are is not reversed");
		//Q3
//		int[] arr = new int[10];
//		System.out.println("Pleas enter a tow namber:");
//		arr[0] = scanner.nextInt();
//		arr[1] = scanner.nextInt();
//		
//		for(int i = 2; i<arr.length; i++) {
//			arr[i] = arr[i-1] + arr[i-2];
//		}
//		
//		for(int element:arr) {
//			System.out.print(element+" ");
//		}
		
		//Q5
		
//	//	int[] arr1 = new int[5];
//	//	int[] arr2 = new int[5];
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = {5,1,2,3,4};
//		
//		int j = arr1.length - 1;
//		
//		boolean flag = true;
//		
//	//	for(int i = 0; i<arr1.length; i++) {
//	//		System.out.println("Pleas enter a namber:");
//	//		arr1[i] = scanner.nextInt();
//	//	}
//	//	for(int i = 0; i<arr2.length; i++) {
//	//		System.out.println("Pleas enter a namber:");
//	//		arr2[i] = scanner.nextInt();
//	//	}
//		
//		for(int i = 0; i<arr1.length-1; i++) {
//			if(arr1[i] != arr2[i+1]) {
//				flag = false;
//				break;
//			}
//			}
//		if(arr1[arr1.length-1] == arr2[0] && flag == true)
//			System.out.println("true");
//		else 
//			System.out.println("false");
		
		//Q7
		
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = {2,4,7,8,9};
//		int[] newArr = new int[5];
//		int index = 0;
//		boolean flag = false;
//		
//		for(int i = 0; i<arr1.length; i++) {
//			flag = false;
//			for(int j = 0; j<arr2.length; j++) {
//				if(arr1[i] == arr2[j]) {
//					flag = true;
//					break;
//				}
//			}
//			if(flag) {
//				newArr[index] = arr1[i];
//				index++;
//			}
//				
//		}
//		
//		for(int element:newArr) {
//			System.out.print(element+" ");
//		}
//		System.out.println(index);
		
		//Q9
//		int[] arr1 = {14,61,227};
//		int[] arr2 = {23,4,92};
//		int count1 = 0, count2 = 0;
//		boolean flag = true;
//		
//		for(int i = 0; i<arr1.length; i++) {
//			for(int j = 0; j<arr2.length; j++) {
//				while(arr1[i]!=0) {
//					count1 += arr1[i]%10;
//					arr1[i] /= 10;
//					count2 += arr2[i]%10;
//					arr2[i] /= 10;
//				}
//				if(count1 != count2) {
//					flag = false;
//					break;
//				}
//			}
//			
//		}
//		if(flag)
//			System.out.println("The collections are compatible");
//		else 
//			System.out.println("The collections are not compatible");
	
		//Q11
//		int[][] matrix = new int[10][10];
//		int row, col, index = 0, max = 0;
//	
//		do {
//		System.out.println("Enter a row and col:");
//		row = scanner.nextInt();
//		col = scanner.nextInt();
//		
//		}while((row<0 && row>10) || (col<0 && col>10));
//		
//		
//		int[] tempArr = {8,5,2,77,44,65,98,54,100,2,5,33,6,55,77,54,1,22,-8,5};
////		int[] tempArr = new int[row*col];
////		for(int i = 0; i< tempArr.length; i++) {
////			System.out.println("Enter a "+row*col+" nambers");
////			tempArr[i] = scanner.nextInt();;
////		}
//		
//		for(int i = 0; i< row; i++) {
//			for(int j = 0; j< col; j++) {
//				matrix[i][j] = tempArr[index];
//				index++;
//			}
//		}
//		//Go over the frame of the matrix and find the maximum
//		for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (i == 0) {
//                    if(matrix[i][j]>max)
//                    	max = matrix[i][j];
//                }
//                else if (i == row - 1) {
//                	if(matrix[i][j]>max)
//                    	max = matrix[i][j];
//                }
//                else if (j == 0) {
//                	if(matrix[i][j]>max)
//                    	max = matrix[i][j];
//                }
//                else if (j == col - 1) {
//                	if(matrix[i][j]>max)
//                    	max = matrix[i][j];
//                }
//            }
//        }
//		
//		for(int[] rows: matrix) {
//			for(int element: rows) {
//				if(element!=0)
//					System.out.print(element+"\t ");
//			}
//			System.out.println();
//		}
//		System.out.println("max is: "+max);
		
		//Q15 - Folded first
		
		int[][] matrix = {{9,2,3,4} ,{2,9,6,3},{3,6,9,2},{4,3,2,9}};
		boolean flag = true;
		
		for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[i].length; j++) {
        	  if(i == j)
        		  continue;
        	  else { 
        		  if(matrix[i][j]!= matrix[j][i]) {
        			  flag = false;
        			  break;
        		  }
        	  }
          	}
		}
		if(flag)
			System.out.println("Folded first");
		else
			System.out.println("Not Folded first");
		
		for(int[] rows: matrix) {
			for(int element: rows) {
				if(element!=0)
					System.out.print(element+"\t ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}    
		
		
	
		
		
	}
	
	

