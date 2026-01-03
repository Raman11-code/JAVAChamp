
public class Evenlength {

	public static void main(String[] args) {
	String str ="Shrey is chsmpion in professional skills";
	String[] words = str.split("\\s+");
	for(String word:words) {
		if(word.length()%2==0) {
			System.out.println(word);
		}
	}
   
	}
	

}
