package constructors;

public class Constructor {
	int a;
	double b;
	//default-- to initialize the variables
Constructor(){
	a=10;
	b=20.3;
}
//parameterized
Constructor(int x,int y){
	a=x;
	b=y;
}
	void add() {
		System.out.println(a+b);
	}
}
