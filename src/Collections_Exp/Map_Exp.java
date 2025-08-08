package Collections_Exp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * Map
         * 
         * Key values
         * linkedHash map , treemap,
         * 
         * A object map that maps key to values
         * A map cannot contain duplicate key values
         * Each key can map to most of one value
         * Ordering - Sorted by key or map implementation
         * Values can be duplicated but not keys
         * Only one null as key is allowed
         * Multiple null values are allowed
         * It is Synchronized : Multiple threads at a time
         * 
         * */

	Map<Integer,String>map = new HashMap<Integer,String>();
	
	
	
	map.put(2, "Kanojia");
	map.put(3, "Billionaire");
	map.put(4,null);
	map.put(4,"Rahul");
	map.put(null, null);
	map.put(3, "Rahul");
	map.put(1, "Skahsam");
	map.put(4, "Kiya");
	map.put(null, null);
	
	System.out.println(map);
	
	//direct accessing can not be possible
	
 
	
//	want key value pair use set or Iterator and set is backed by map 
	
	Set set = map.entrySet();
	
	Iterator itr = set.iterator();
	
	
	while(itr.hasNext()) {
		Entry entry = (Map.Entry)itr.next();
		
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	
	}

}
