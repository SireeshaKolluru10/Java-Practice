package strings;

import java.util.Scanner;

public class StringIsPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println(s+" is palindrome");
		}else
			System.out.println(s+" is not palindrome");
		sc.close();
	}

}
