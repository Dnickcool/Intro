package basics1;

public class SandwichString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sandwichTheWord("||||", "ham"));
		

	}

	 static String sandwichTheWord(String bread, String filling) {
		 return bread.substring(0, 2) + filling + bread.substring(2, 4);
		 
	}
}