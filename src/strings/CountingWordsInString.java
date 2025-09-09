package strings;

public class CountingWordsInString {

	public static void main(String[] args) {
		String s="India is my country";
		String[] s1=s.split(" ");
		int count=s1.length;
		System.out.println("The total number of words in the string are :"+ count);
	}

}
