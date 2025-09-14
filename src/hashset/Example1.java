package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		HashSet<Object> set=new HashSet<>();
		set.add(123);
		set.add(123);
		set.add(null);
		set.add(null);
		set.add("hi");
		set.add('a');
		System.out.println("size of set :"+set.size());
		System.out.println(set); 
		ArrayList<Object> list=new ArrayList<>(set);
		System.out.println("specific value:"+list.get(3)); // to get a specific value from a set
		System.out.println("............");
		// duplicates values and duplicate nulls are not allowed
		for(Object x:set) {
			System.out.println(x);
		}
		set.remove(123);
		System.out.println("......");
		Iterator<Object> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("after removing value"+set);
		
		set.clear();
		System.out.println(set.size());
		
	}

}
