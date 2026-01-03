import java.util.HashMap;
import java.util.Map;

public class stringques {

	public static void main(String[] args) {
		String str = "abcbdd";
		//a ---character
		
		
		char[] words = str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character ch:words) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
		 }
	 
	}


