package practise;

import java.util.HashMap;

public class FirstUnique {
	public static void uniqueValue(String name) {
		
	char name1[]=name.toCharArray();
	HashMap<Character, Integer> map=new HashMap<Character, Integer>();
	for(char c: name1) {
		map.put(c, map.getOrDefault(c,0)+1);
		
	}
	for(char c: name1) {
		if(map.get(c)==1) {
			System.out.println(c);
			break;
		}
	}
	}

	public static void main(String[] args) {
		uniqueValue("java learning jaaz");
		

	}

}
