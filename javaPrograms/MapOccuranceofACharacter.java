package javaPrograms;

import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.testng.annotations.Test;

public class MapOccuranceofACharacter {
@Test
public static void run()
{
	String s1="helloooral";
	char[] ch=s1.toCharArray();
	Map<Character,Integer> mp=new HashedMap();
	for (char c : ch) 
	{
		if(mp.containsKey(c))
		{
			Integer cnt = mp.get(c);
		mp.put(c, ++cnt);
	}
		else mp.put(c, 1);
	}
	System.out.println(mp);
}
}
