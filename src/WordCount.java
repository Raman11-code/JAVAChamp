
public class WordCount {

	public static void main(String[] args) {
		String str = "Java world Java";
		String[] words = str.split(" ");
		int wordcount = words.length;
		System.out.println("Number of words" +" "+wordcount);

	}

}
