package basics1;

public class GivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numList = {1,2,3,4}; 
		System.out.println(countEvens(numList));
		 

	} 
	
	static int countEvens(int[] numList) {
		
		int evenNumberCount = 0;
		for(int number: numList) {
			
			if (number % 2 == 0) {
				evenNumberCount++;
			}
			
		}
		return evenNumberCount;
		
	}

}
