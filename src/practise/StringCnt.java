//package practise;
//
//import java.util.HashMap;
//
//public class StringCnt {
//	public static void getCount(String name1) {
//		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
//		String name=name1.toLowerCase();
//		char str[]= name.toCharArray();
//		for( char c: str) {
//			if(!String.valueOf(c).isBlank()) {
//			
//			if(map.containsKey(c)) {
//				map.put(c, map.get(c)+1);
//				
//			}else {
//				map.put(c, 1);
//			}
//			
//		}
//		}
//		
////		for(Map.Entry <Character,Integer> e: map.entrySet() ) {
////			System.out.println(e.getKey() +":" + e.getValue());
////	}
//		System.out.println(map);
//		
//		
//	}
//		
//
//	public static void main(String[] args) {
//	getCount("Hello this is Arifur rahman");
//		
//	}
//
//}
