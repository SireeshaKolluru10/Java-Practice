package accessmodifiers;
class PM{
	//private int a=10;
	int b=8732;
}
public class PrivateModifier {
	private int c=23;
	public static void main(String[] args) {
		PM p=new PM();
		PrivateModifier pm=new PrivateModifier();
		System.out.println(p.b);
		//System.out.println(p.a);  can't access private variable outside the class
		System.out.println(pm.c); // private variable within the class
	}

}
