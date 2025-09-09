package arrays;

import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]=new int[a.length];
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int s:b) {
			System.out.println(s);
		}
	}

}
