package arrays;

import java.util.Arrays;

public class LargestNumberUsingSorting {

	public static void main(String[] args) {
		int a[]= {26,87,24,90,44,80};
		 Arrays.sort(a);
		 int large=a[a.length-1];
		 System.out.println(large+ " is the largest number");
	}

}
