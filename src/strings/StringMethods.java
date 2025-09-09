package strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s="Welcome back";
		String s1=" to the";
		String s2=" WORLD";
		String s3="xyz098@gmail#com";
		System.out.println(s.length());//length of string
		System.out.println(s.charAt(11)); // to get specific character
		System.out.println(s.concat(s1)); // to combine  strings
		System.out.println(s.concat(s1).concat(s2)); //to combine multiple strings
		System.out.println(s.contains("welcome"));
		System.out.println(s2.toLowerCase().contains("world"));
		System.out.println(s.replace('c', 'l'));
		System.out.println(s.equals("welcome back"));
		System.out.println(s.equalsIgnoreCase("welcome back"));
		System.out.println(s.substring(8,12));
		String s4[]=s3.split("@");
		System.out.println(Arrays.toString(s4));
		String s5=s4[1];
		System.out.println(s4[1]);
		System.out.println(s5);
		String s6[]=s5.split("#");
		System.out.println(Arrays.toString(s6));
	}

}
