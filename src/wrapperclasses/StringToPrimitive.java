package wrapperclasses;

public class StringToPrimitive {

	public static void main(String[] args) {
		String s="1232";
		String s2="true";
		String s3="872348.23487";
		int a=Integer.parseInt(s);
		boolean b= Boolean.parseBoolean(s2);
		double d= Double.parseDouble(s3);
		double sum=a+d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(sum);
	}

}
