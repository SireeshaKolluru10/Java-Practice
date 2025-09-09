package strings;

public class StringIsImmutable {

	public static void main(String[] args) {
		String s= "hello";
		System.out.println(s.concat("world"));
		System.out.println(s); // string is not changing (immutable)
	}
	

}
