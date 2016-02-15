/**
 * Count how many words in a string. Numbers are regarded as a word. Do not use
 * 'split' function. e.g. "I like soccer" --> 3. "I have 15 dollars" --> 4
 */
public class CountWords {

	public int countWords(String str) {
		if (str.equals("")) {
			System.out.println("String is empty");
			return 0;

		} else {
			int count = 1;
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
					count++;
				}
			}
			return count;
		}
	}

	public static void main(String[] args) {
		String inputString = "This is the year 2016";
		CountWords counter = new CountWords();
		int result = 0;
		result = counter.countWords(inputString);
		System.out.println("The number of words are : " + result);

	}

}