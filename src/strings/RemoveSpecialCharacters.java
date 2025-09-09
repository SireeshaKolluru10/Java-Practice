package strings;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String s="hel$l&o @wor^l$d";
		String s1="";
		for(int i=0;i<=s.length()-1;i++) {
			if((s.charAt(i)>='a' && s.charAt(i)<='z')||
					(s.charAt(i)>='A' && s.charAt(i)<='Z')) 
			{
				s1+=s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
