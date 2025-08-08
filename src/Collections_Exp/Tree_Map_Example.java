package Collections_Exp;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Tree_Map_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Tree Map
		 * 
		 * An object that maps keys to values
		 * Natural Ordering
		 * Unsync 
		 * 
		 * Multiple Null values are allowed
		 * No Null Keys allowed 
		 * Duplicate key not allowed 
		 * each key can map only one value
		 * the map is sorted in 
		 * 
		 * */
		
		Map<Integer,String>map = new TreeMap<Integer,String>();
		
		
		
		map.put(2, "Kanojia");
		map.put(3, "Billionaire");
		map.put(4,null);
		map.put(4,"Rahul");
//		map.put(null, null);
		map.put(3, "Rahul");
		map.put(1, "Skahsam");
		map.put(4, "Kiya");
//		map.put(null, null);
		map.put(6, null);
		map.put(7, null);  // can have multiple null values 
		
		System.out.println(map);
		
		//direct accessing can not be possible
		
	 
		
//		want key value pair use set or Iterator and set is backed by map 
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		
		while(itr.hasNext()) {
			Entry entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		}
		
	}


