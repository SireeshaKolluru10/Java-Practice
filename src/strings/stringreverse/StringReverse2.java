package strings.stringreverse;

import java.util.Arrays;

public class StringReverse2 {

	public static void main(String[] args) {
		String a="welcome";
		String r="";
		char[] s=a.toCharArray();
		System.out.println(Arrays.toString(s));
		for(int i=s.length-1;i>=0;i--) {
			r=r+s[i];
		}
		System.out.println(r);
	}

}
