package Map;


import java.util.*;
import java.util.Map.Entry;
public class Hash_Map {
	public static void main(String[] args) {
		HashMap<String , Integer> map= new HashMap<>();
		
		// Insertion
		map.put("India", 120);
		map.put("US", 30);
		map.put("Chaina", 150);
		
		System.out.println(map);
		System.out.println("After Updated ");
		 
		System.out.println(map);
		
		map.put("China", 180);
		System.out.println(map);
		
		map.remove("Chaina");
		
		// Search Ya Lookup
		
//		if(map.containsKey("Indiab")) {
//			System.out.println("Key is present in the map");
//			
//		}else {
//			System.out.println("Key is not present in the map");
//		}
//		
	//  	System.out.println(map.get("France")); // Key exist
		//  System.out.println(map.get("India"));  // key does not exist 
		
		// Iteration 
		 
		// for each loop 
	//	for(int val : arr) {
		
		
		// 1st method Entery Set ke through
//		for(Map.Entry<String,Integer> e : map.entrySet()) {
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//		}
//		
		
		// 2nd Method Set 
//		Set<String> keys = map.keySet();
//		for(String key : keys) {
//			System.out.println(k ey + " " + map.get(key));
//		}
//		
		 
		
		
		
		
		
		
	}
	
	

}
