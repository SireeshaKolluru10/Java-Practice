package strings;

public class EqualsAndEqualsMethod {

	public static void main(String[] args) {
		String s1="hi";
		String s2=new String("hi");
		String s3=s2;
		String s4=new String("hi");
		System.out.println(s1==s2);// compares objects
		System.out.println(s1==s4);
		System.out.println(s3==s2);// here both the objects are same(true)
		System.out.println(s1.equals(s2));// compares values of the object
	}

}
