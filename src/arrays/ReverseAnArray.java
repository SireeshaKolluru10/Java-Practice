package arrays;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		int rev[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			 rev[a.length-1-i]=a[i];
			System.out.print(rev[i]+" ");
		}
		System.out.println(Arrays.toString(rev));
	}

}
