package javabootcamp.basic.exam;

public class Runner {
	
	//Q1
	/*
	 * JDK in Java is an abbreviation for Java Development Kit. 
	 * It is a bundle of software development tools and supporting libraries combined with the Java Runtime Environment (JRE) and Java Virtual Machine (JVM).
	 * Java Run-time Environment is a software platform where all the Java Source codes are executed. JRE is responsible for integrating the software plugins, 
	 * jar files, and support libraries necessary for the source code to run.
	 * Java Virtual Machine is a software tool responsible for creating a run-time environment for the Java source code to run. The very powerful feature of Java, 
	 * "Write once and run anywhere," is made possible by JVM. 
	 */
	//Q2
	/*
	 * First, the source ‘.java’ file is passed through the compiler, which then encodes the source code into a machine-independent encoding, 
	 * known as Bytecode. The content of each class contained in the source file is stored in a separate ‘.class’ file. 
	 * The class files created by the compiler are not dependent on the machine or the operating system, which allows them to be run on any system. To run, the main class file (the class containing the main method) 
	 * is passed to the JVM that runs the code
	 */

	
	//Q3
	public static boolean numIsPalindrome(int num) {
		int r,sum=0,temp;    
		  temp=num;    
		  while(num>0){    
		   r=num%10;  //getting remainder  
		   sum=(sum*10)+r;
		   num=num/10;    
		  }    
		  if(temp==sum)    
			  return true;
		  return false;
		}  
		
	//Q4
	
	public static int sumArr(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static int[] returnNewArrIsConcatToArr(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length+arr2.length + 2];
		int[] firstArr = arr1;
		int[] lastArr = arr2;
		int sumArrLastArr = sumArr(lastArr);
		int sumArrFirstArr = sumArr(firstArr);
		if(sumArrLastArr < sumArrFirstArr) {
			firstArr = arr2;
			lastArr = arr1;
		}
		int i = 0;
		for (; i < firstArr.length; i++) {
			newArr[i] = firstArr[i];
		}
		for (int j = 0; j < lastArr.length; i++,j++) {
			newArr[i] = lastArr[j];
		}
		newArr[i] = sumArrLastArr+sumArrFirstArr;
		newArr[newArr.length-1] = Math.abs(sumArrLastArr -sumArrFirstArr);
		return newArr;
		
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		//Q3
		System.out.println(numIsPalindrome(12321));
		//Q4
		int[] arr1 = {7,8,-4};
		int[] arr2 = {-5,7,3,2};
		int[] concatArr = returnNewArrIsConcatToArr(arr2,arr1);
		printArr(concatArr);
		
	}

}
