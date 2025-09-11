package accessmodifiers;
class DM{
	char a='c';
}
public class DefaultModifier {

	public static void main(String[] args) {
		DM d=new DM();
		System.out.println(d.a); // default variable accessible outside the within the package
	}

}
