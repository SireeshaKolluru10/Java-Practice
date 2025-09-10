package inheritance;
class Sport{
	int max_age=50;
void player() {
	System.out.println("many players play sports");
}
}
class Cricket extends Sport{
	int max_age=40;
	void player() {
		System.out.println(super.max_age);
		System.out.println("many players play cricket");
		super.player();
		 // super keyword refers the immediate parent class
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		Cricket c=new Cricket();
		c.player();
	}

}
