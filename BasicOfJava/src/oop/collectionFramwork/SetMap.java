package oop.collectionFramwork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Practical 21 : Map And Set
 *  Write another program using Map and Set concepts.
 */

public class SetMap {

	public static void main(String[] args)
	{

		int[] arr = {1,2,3,1,2,4,5,6,6,7,4,5,2};
		Set<Integer> set = new HashSet<>();

		for(Integer i:arr)
		{
			set.add(i);
		}
		for(Integer i:set)
		{
			System.out.println(i);
		}

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Rahul");
		map.put(2, "Rhoan");
		map.put(3, "Pream");

		Set<Integer> keySet = map.keySet();
		for(Integer i:keySet)
		{
			System.out.println(map.get(i));
		}

	}
}