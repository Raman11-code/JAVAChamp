import java.util.HashMap;
import java.util.Map;

public class NonrepeatedCharacter {

	public static void main(String[] args) {
	String str ="swiss";
	char[] words = str.toCharArray();
	Map<Character,Integer> map = new HashMap<Character,Integer>();
	for(Character ch:words) {
		map.put(ch, map.getOrDefault(ch,0)+1 );
	}
	
	for(char ch:words) {
		if(map.get(ch)==1) {
			System.out.println(ch);
		}
	}
	}

}
