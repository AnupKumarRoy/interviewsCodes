package day4;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if ((text1.length())!=(text1.length())) {
			System.out.println("Both the String are not equal,so String are not Anagram");
		}
		else {
			char[] string1 = text1.toCharArray();
			char[] string2 = text2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			if ((Arrays.equals(string1, string2))==true) {
				System.out.println("It is a Anagram");
			}
			else {
				System.out.println("It is not a Anagram");
			}
			
		}
		
		
	}

}
