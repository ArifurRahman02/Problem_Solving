package practise;

import java.util.HashMap;
import java.util.Map;

public class StringCount {
	
	public static void getCount(String name) {
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();//hello world
		char strArray[]=name.toCharArray();
		for(char c:strArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);//[l,2],[o,2],[l,3]
				
				
			}else {
				charMap.put(c, 1);//[h,1],[e,1],[l,1],[o,1],[w,1],[r,1],[d,1]
			}
		}
		System.out.print(name+ ": "+charMap);
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		getCount("Hello world mr java");
		

	}

}
