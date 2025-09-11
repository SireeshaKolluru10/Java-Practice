package accessmodifiers;

import basicprograms.ArithmeticOperators;

class ProM{
	short a=100;
	protected int b=89487;
}
public class ProtectedModifier extends ArithmeticOperators{

	public static void main(String[] args) {
		ProM pr=new ProM();
		ProtectedModifier pm=new ProtectedModifier();
		System.out.println(pr.a+" "+pr.b);
		System.out.println(pm.p);// only accessible from outside the package when 
		// the class is inherited
	}

}
