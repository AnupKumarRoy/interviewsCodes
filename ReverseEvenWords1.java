package weekday3;

public class ReverseEvenWords1 {

	public static void main(String[] args) {
		String input = "I am a ANUP KUMAR ROY";
		String[] word = input.split(" ");
		for (int i = 0; i < word.length; i++) {
			if (i%2==1) {
				StringBuilder string = new StringBuilder(word[i]);
				StringBuilder reverse = string.reverse();
				System.out.print(reverse);
				System.out.print(" ");
			}
			else {
				System.out.print(word[i]+" ");
			}
		}
			}

		}
