package javabootcamp.basic.loops;

import java.util.Iterator;
import java.util.Scanner; 

public class Ranner {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Q1
//		System.out.println("Enter a number:");
//		int num = scanner.nextInt();
//		 int i,m=0,flag=0;         
//		  m=num/2;      
//		  if(num==0||num==1){  
//		   System.out.println(num+" is not prime number");      
//		  }else{  
//		   for(i=2;i<=m;i++){      
//		    if(num%i==0){      
//		     System.out.println(num+" is not prime number");      
//		     flag=1;      
//		     break;      
//		    }      
//		   }      
//		   if(flag==0)  { System.out.println(num+" is prime number"); }  
//		  }//end of else
		  
		  //Q2
//		  System.out.println("Enter a number:");
//		  int num = scanner.nextInt();
//		  int i = 1;
//		  int res = 0;
//		  
//		  while(num>=0) {
//			  res*= 10;
//			  res+=num;
//			  System.out.println("Enter a number:");
//			  num = scanner.nextInt();
//		  }
//		  
//		  System.out.println("Namber res is:"+res);
		  
		  
		  //*****************
//		  int num = 0;
//		  int i = 1;
//		  int res = 0;
//		  
//		  do{
//			  res*= 10;
//			  res+=num;
//			  System.out.println("Enter a number:");
//			  num = scanner.nextInt();
//		  }while(num>=0);
//		  
//		  System.out.println("Namber res is:"+res);
		  
		  //Q2
		int digit, product = 0, multi = 1;
		System.out.println("Enter a number:");
		do {
			digit = scanner.nextInt();
			if(digit>0) {
				product = multi*digit;
				multi = product;
			}
		}while(digit>0);
		  
		 System.out.println("Product is "+product); 
		  scanner.close();
		  
		}    
		
		
		
	}
	
	

