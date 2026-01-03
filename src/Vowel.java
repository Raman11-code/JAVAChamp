
public class Vowel {

	public static void main(String[] args) {
	String str ="ramanshreya";
	int vowel =0;
	int consonant =0;
	char[] words = str.toCharArray();
	for(int i =0;i<words.length;i++) {
		if(words[i]=='a'||words[i]=='e'||words[i]=='i'||words[i]=='o'||words[i]=='u') {
			vowel = vowel +1;
		}
		else {
			consonant = consonant +1;
		}
		
	}
	System.out.println(vowel);
	System.out.println(consonant);
	}

}
