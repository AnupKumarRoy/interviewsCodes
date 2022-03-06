package Week2Day3;

public class ReverseEvenWord {

	public static void main(String[] args) {
	String input = "I am the Beast and Goat";
	String word[] = input.split(" ");
	//System.out.print(word);
	for (int i = 0; i < word.length; i++) {
		//System.out.print(word[i]);
		if (i%2==1) {
			for (int j = word[i].length()-1; j >=0; j--) {
				
				System.out.print(word[i].charAt(j));
				
			}
			System.out.print(" ");
		}else {
			System.out.print(word[i]+" ");
		}
		
	}
	
		
	}

}
