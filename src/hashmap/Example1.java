package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Example1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		hm.put(1,"abc@gmail.com");
		hm.put(2, "xyz@gmail.com"); // adding key and values into map
		hm.put(3, "123@gmail.com");
		hm.put(4, null); 
		hm.put(5, null);
		hm.put(2, "pqr@gmail.com"); // duplicate keys are not allowed
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.get(2));
		hm.replace(2, "xyz@gamil.com"); // replacing value 
		System.out.println(hm);
		for(Object x:hm.entrySet()) {
			System.out.println(x);
		}
		System.out.println(hm.keySet()); // get keys 
		System.out.println(hm.values()); // get values
		System.out.println(hm.entrySet()); // get keys and values set
		hm.remove(2); // removing  key and value using key
		System.out.println(hm.size());
		Iterator<Entry<Integer,String>> it = hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
