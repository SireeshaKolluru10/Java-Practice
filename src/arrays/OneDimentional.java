package arrays;

public class OneDimentional {

	public static void main(String[] args) {
		int a[]=new int[4];
		a[0]=88;
		a[1]=89;
		a[2]=90;
		a[3]=91;
		System.out.println(a[0]);
		System.out.println("Length of the array is :"+a.length);
		for(int s:a) {
			System.out.println(s);
		}
	}

}
