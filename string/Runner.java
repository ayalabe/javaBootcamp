package bootcamp.oop.string;

import java.util.Scanner;

public class Runner {
	public static Scanner scanner = new Scanner(System.in);
	public static boolean isPalindrome(String str) {
	    return str.equals(strRevers(str));
	}
	
	public static String strRevers(String str) {
		
		String reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = strLength - 1 ; i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    return reverseStr;
	      
		
	}
	
	public static boolean str1IsReversToStr2(String str1, String str2) {
		return str2.equals(strRevers(str1));
		
	}
	
	public static String removeWordFromString(String str, String word) {
		
		// Split the string using split() method
        String msg[] = str.split(" ");
        String newStr = "";
 
        // Iterating the string using for each loop
        for (String words : msg) {
 
            // If desired word is found
            if (!words.equals(word)) {
 
                // Concat the word not equal to the given
                // word
                newStr += words + " ";
            }
        }
 
        return newStr;
		
	}
	
	public static String capitalizeBeginninOfEachWordInString(String str, char c) {
		int i = str.indexOf(c);
		while(i!=str.length()) {
			
		}
		return str;
	}
	
	public static String inputStringFromUser(String msg) {
		System.out.println(msg);
		return scanner.nextLine();
		
	}

	public static void main(String[] args) {
		
		String menuText = "Please enter the number of your selection from the following options:\r\n";
		menuText += "1. Enter 2 sentences and I値l tell you if one is the other written backwards.\r\n";
		menuText += "2. Enter a word and I値l tell you if it is a palindrome.\r\n";
		menuText += "3. Enter a sentence and a word and I値l remove that word from anywhere in the sentence for you.\r\n";
		menuText += "4. Enter a sentence and I値l capitalize the beginning of each word in it.\r\n";
		menuText += "5. Enter a sentence and 2 words and I値l replace that first word with the second from everywhere in the sentence for you.\r\n";
		menuText += "6. Enter a sentence and a letter and I値l print all the words that start with that letter.\r\n";
		menuText += "7. Exit\r\n";
		System.out.println(menuText);
		int numSelect;
		String str1, str2, word;
		do {
			numSelect = scanner.nextInt();
			switch(numSelect) {
			case 1:
				System.out.println("Enter 2 sentences and I値l tell you if one is the other written backwards");
				str1 = scanner.nextLine();
				str2 = scanner.nextLine();
				System.out.println(str1IsReversToStr2(str1,str2));
			break;
			case 2:
				str1 = inputStringFromUser("Enter a word and I値l tell you if it is a palindrome.");
				System.out.println(isPalindrome(str1));   
			break;
			case 3:
				str1 = inputStringFromUser("Enter a sentence and a word and I値l remove that word from anywhere in the sentence for you");
				word = inputStringFromUser("");
				str2 = removeWordFromString(str1,word);
				System.out.println(str2);
			break;
			case 4:
			break;
			case 5:
			break;
			case 6:
			break;
			case 7:
				System.out.println("by");
				return;
			// default case
			default:
			System.out.println("Enter a number beatwin 1 - 7");
			}
			
		}while(true);
		
		// closing the scanner object
//		scanner.close();
	}

}
