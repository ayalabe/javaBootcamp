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
//		int digit, product = 0, multi = 1;
//		System.out.println("Enter a number:");
//		do {
//			digit = scanner.nextInt();
//			if(digit>0) {
//				product = multi*digit;
//				multi = product;
//			}
//		}while(digit>0);
//		  
//		 System.out.println("Product is "+product); 
//		  scanner.close();
		  
		  
		  //Q3
//		  System.out.println("Enter the number of iterations:");
//		  int iterations = scanner.nextInt();
//		  int i = 0;
//		  int count1 = 0,count_1 = 0, count0 = 0;
//		  while(i<iterations) {
//			  System.out.println("Enter a number:");
//			  int num = scanner.nextInt();
//			  i++;
//			  switch(num) {
//				case 1:
//					count1++;
//					break;
//				case -1:
//					count_1++;
//					break;
//				case 0:
//					count0++;
//					break;
//			  }
//		  }
//		  System.out.println("1 is: "+count1+" -1 is: "+count_1+" 0 is: "+count0);
		  
		  //chapter 3
		  //Q3
//		int priceCeck = 0;
//		  System.out.println("f the bride or groom are defined as close friends Press 1\r\n"
//		  		+ "If the bride or groom are family members, press 2\r\n"
//		  		+ "In any other case press 3");
//		  int type_Closeness = scanner.nextInt();
//		  System.out.println("How long the acquaintance?");
//		  int acquaintance = scanner.nextInt();
//		  System.out.println("How long is the trip to the wedding?");
//		  double travelTime = scanner.nextInt();
//		  if(acquaintance>3 && type_Closeness!=2) {
//			  priceCeck+=50;
//		  }
//		  if(travelTime>1 && type_Closeness!=2) {
//			  priceCeck-=50;
//		  }
//		  
//		  switch(type_Closeness) {
//			case 1:
//				priceCeck += 500;
//				break;
//			case 2:
//				priceCeck += 1000;
//				break;
//			case 3:
//				priceCeck += 250;
//				break;
//		  }
//		  
//		  System.out.println("The amount of the check: "+priceCeck);
		
		//Q7
//		System.out.println("test score:");
//		double testScore = scanner.nextInt();
//		System.out.println("Average homework:");
//		double averageHomework = scanner.nextInt();
//		System.out.println("Number of exercises submitted:");
//		int exercisesSubmitted = scanner.nextInt();
//		double finalScore = 0;
//		double ageTemp;
//		
//		finalScore = testScore;
//		 switch(exercisesSubmitted) {
//			case 4:
//				finalScore = 0;
//				break;
//			case 5:
//			case 6:
//				if(testScore>=55) {
//					finalScore = 0.2*averageHomework +0.8*testScore;
//				}
//				break;
//			case 7:
//			case 8:
//				if(testScore<55) {
//					if(averageHomework>=80) 
//						ageTemp = 0.25*averageHomework +0.75*testScore;
//					else 
//						ageTemp = 0.2*averageHomework +0.8*testScore;
//					if(ageTemp>=averageHomework) 
//						finalScore = ageTemp;
//				}
//				break;
//			default:
//				ageTemp = 0.3*averageHomework +0.7*testScore;
//				if(ageTemp>=averageHomework) 
//					finalScore = ageTemp;
//				break;
//		  }
//		
//		System.out.println("Your final grade is: "+finalScore);
		
		//chapter 4
		//Q2
		
//		System.out.println("Enter a number: ");
//		int num = scanner.nextInt();
//		int newNum = 0;
//		int i = 1;
//		while(num!=0) {
//			newNum+=num%10*i;
//			num /= 100;
//			i*=10;
//		}
//		System.out.println("new num is: "+newNum );
		
		  //Q4 - chech id 
//		System.out.println("Enter yure ID: ");
//		int id = scanner.nextInt();
//		int doublOrOdd;
//		int chec = id%10;
//		int dig, multi = 0, temp;
//		float sum = 0;
//		id /= 10;
//		for(int i = 1; i<=8; i++) {
//			dig = id%10;
//			id /=10;
//			if(i%2==0) {
//				doublOrOdd = 2;
//
//			}
//			else
//				doublOrOdd = 1;
//				
//			switch(doublOrOdd) {
//			case 1:
//				multi = dig*2;
//				break;
//			case 2:
//				multi = dig;
//				break;
//			}
//			sum+= multi/10 +multi%10;
//			
//			
//		}
//		temp = (int)Math.ceil(sum/10)*10;
//		if(temp-sum == chec) {
//			System.out.println("ID normal");
//		}
//		else
//			System.out.println("ID not normal");
		
	 
		//Q6 - His digits are like the original number, and to their right The digits are in reverse order.
		
//		System.out.println("Enter a namber");
//		int num = scanner.nextInt();
//		int polindromNum = num;
//		
//		while(num!=0) {
//			polindromNum*=10;
//			polindromNum += num%10;
//			num /= 10;
//			
//		}
//		
//		System.out.println(polindromNum);
		
		//Q8
//		int count = 0;
//		for (double i = 10; i < 100; i++) {
//	          for (double j = 11; j < 100; j++) {
//	        	  if(i/j < 1) {
//	        		  if((i/10)!=0 && (j%10)!=0) {
//		        		  if((i/10)/(j%10) == i/j) {
//		        			  System.out.println(i+"/"+j+" == "+i/j);
//		        			  count++;
//		        		  }
//	        		  }
//	        			  
//	        	  }
//	        	  if(count == 48)
//	        		  break;
//	        	  
//	          }
//		}
		
		
		

		
		
		
		
		
		
	}
	}
	
	

