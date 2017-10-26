package basics1;

public class WelcomeStrudentsToTheClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array strings
//		String name1= "Tara";
//		String name2= new String("Tara");
//		System.out.println concatentated("welcome to class");
//		String name3= "Nick";
//		String name4= new String ("Nick");
		
		String[] namesList = {"John", "bob"};
		
		for(String name: namesList) {
			System.out.println(name.concat(" - welcome to the class"));
		}
	}

}
