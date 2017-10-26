package basics1;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Nick";
		

	}
	
	static int numberOfVowels (String word) {
		int vowelCount=0;
		for (int i=0; i< word.length(); i++) {
			char c = word.charAt(i);
			
			if(c == 'a' || c =='e'){
				vowelCount++;
			}
		}
		
		return vowelCount;
		
		

}
}
