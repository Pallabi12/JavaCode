package Mapping;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {

		// HashMap saves value in <Key, Value> pair

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(200, "Tom");
		map.put(100, "Ram");
		map.put(300, "Pallabi");
		map.put(500, null);
		map.put(200, "Harry");
		map.put(null, null);
		map.put(null, "Pallabi");

		System.out.println(map.get(100));
		System.out.println(map.get(500));
		System.out.println(map.get(200));
		System.out.println(map.get(null));

		System.out.println("--------------------------------");

		// to print the key value pair in output
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println("-------------------------------------");

		Map<String, String> hashMap = new HashMap<String, String>();

		hashMap.put("IBM", "Tom");
		hashMap.put("Google", "Pallabi");
		hashMap.put("MS", "Arthi");
		hashMap.put("Amazon", "Naveen");
		hashMap.put("TCS", "Ravi");
		hashMap.put("HCL", "Ali");
		hashMap.put("CG", "Meera");

		System.out.println("====HASHMAP - RANDOM======");
		hashMap.forEach((k, v) -> System.out.println(k + ":" + v));

		System.out.println("-----------------------------------");

		// LinkedHashMap - for ordered sequence

		Map<String, String> empMap = new LinkedHashMap<String, String>();

		empMap.put("IBM", "Tom");
		empMap.put("Google", "Pallabi");
		empMap.put("MS", "Arthi");
		empMap.put("Amazon", "Naveen");
		empMap.put("TCS", "Ravi");
		empMap.put("HCL", "Ali");
		empMap.put("CG", "Meera");

		System.out.println("====LINKEDHASHMAP - ORDERED======");
		empMap.forEach((k, v) -> System.out.println(k + ":" + v));



		//TreeMap - for sorted result
		Map<String, String> treeMap = new TreeMap<String, String>();

		treeMap.put("IBM", "Tom");
		treeMap.put("Google", "Pallabi");
		treeMap.put("MS", "Arthi");
		treeMap.put("Amazon", "Naveen");
		treeMap.put("TCS", "Ravi");
		treeMap.put("HCL", "Ali");
		treeMap.put("CG", "Meera");

		System.out.println("====TREEMAP - SORTED======");
		treeMap.forEach((k, v) -> System.out.println(k + ":" + v));

	}

}
