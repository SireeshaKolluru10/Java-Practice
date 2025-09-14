package arraylist;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Iterator;
//import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		//List<Integer>l=new ArrayList();
		//Collection <Object>list2=new ArrayList<Object>();
		//Iterable <Object>list3=new ArrayList<>();
		ArrayList<Object> list=new ArrayList<>();
		list.add(69); // adding value in the array list
		list.add(23.4);
		list.add('c');
		list.add(true);
		list.add(69);
		list.add(null);
		list.add(null);
		System.out.println(list); // printing the array list
		list.set(3,false);	// replacing a value
		System.out.println(list);
		list.add(3, "what?"); // adding value at a specific index
		System.out.println(list);
		list.remove(3); // removing an element
		System.out.println(list);
		System.out.println(list.isEmpty());
      for(Object x:list) {
    	  System.out.println(x);
      }
      System.out.println("........");
		ArrayList<Object> list1=new ArrayList<>();
		list1.add(null);
		list1.add(null);
		list1.add(69);
		list.removeAll(list1); // removing multiple elements from the list
		Iterator<Object> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list);

		}


}
