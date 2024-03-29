import java.util.Scanner;
public class StringMethodChallenges {

	static int counter = 0;
	static String userString = "";
	static Scanner userInput;
	public static void main(String[] args) {
		useYourInsideVoice();
		verticalLetters();
		countTheVowels();
		palindromeTester();
		pigLatin();
		
	}
	public static void useYourInsideVoice() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Say anything in all caps.");
		
		String userString = userInput.nextLine();
		
		userString = userString.toLowerCase();
		userString = userString.substring(0, 1).toUpperCase() + userString.substring(1, userString.length());
		
		System.out.println(userString);
	}
	public static void verticalLetters() {
		for (int i = 0; i < userString.length(); i++) {
			System.out.println(userString.substring(i, i+1));
		}
	}
	public static void countTheVowels() {
		System.out.println("Input a sentence and this program will count the vowels.");
		userString = userInput.nextLine().toLowerCase();
		int counter = 0;
		
		for (int i = 0; i < userString.length(); i++) {
			switch (userString.substring(i,i+1)) {
			case "a": case "e": case "i": case "o": case "u":
				counter ++;
				break;
			}
		}
		System.out.printf("There are %d vowels in your sentence.\n", counter);
	}
	public static void palindromeTester() {
		System.out.println("Type something and this program will tell you if it is a palindrome.");
		userString = userInput.nextLine();
		//System.out.println(userString.toLowerCase().replaceAll("\\s", "").length());
		StringBuffer reversedString = new StringBuffer(userString.toLowerCase().replaceAll("[^a-z]", "")).reverse();
		counter = 0;
		//System.out.println("test");
		
		for (int i = 0; i < userString.toLowerCase().replaceAll("[^a-z]", "").length(); i++) {
			if (userString.toLowerCase().replaceAll("[^a-z]", "").substring(i, i+1).equals(reversedString.substring(i, i+1))) {
				counter ++;
			}
		}
		if (counter == userString.toLowerCase().replaceAll("[^a-z]", "").length()) {
			System.out.printf("Your string, %s, is a palindrome!", userString);
		}
		else {
			System.out.printf("Your string, %s, is not a palindrome.", userString);
		}
	}
	public static void pigLatin() {
		System.out.println("\n\nInput a string and we will return your string in Pig Latin.");
		userString = userInput.nextLine();
		
		String userStringArray[] = userString.split(" ");
//		for (int i = 0; i < userStringArray.length; i++) {
//			System.out.println(userStringArray[i]);
//		}
		System.out.println(userStringArray.length);

		for (int i = 0; i < userStringArray.length; i++) {
			switch (userStringArray[0].substring(0,1)) {
			case "a": case "e": case "i": case "o": case "u":
				System.out.println(userStringArray[i].substring(1,userStringArray[i].length()) + "way ");
				break;
			default: 
				System.out.println(userStringArray[i].substring(1,userStringArray[i].length()) 
						+ userStringArray[i].substring(0,1) + "ay ");
			}
		}
	}

}
