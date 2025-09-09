package strings;

import java.util.Scanner;

public class CountingOccuranceOfCharacter {

	public static void main(String[] args) {
		String s= "bitterguard is very bitter";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character to be counted");
		char cr=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)==cr) {
				count++;
			}
			
		}
		System.out.println(cr+" is occured "+count+" times");
		sc.close();
		}
	
		}


