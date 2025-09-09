package arrays;

//import java.util.Arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		char a[][]= {{'a','b'},{'c','d'},{'e','f'}};
		System.out.println(a[0][1]);
		System.out.println("row length of the array:"+a.length);
		System.out.println("columns size of the array :"+a[0].length);
		for(char s[]:a) {
			for(char k:s) {
				System.out.print(k+" ");
				//System.out.println(Arrays.toString(s));
			}
			System.out.println();
		}
	}

}
