package basics1;

public class SleepIn {

	public static void main(String[] args) {
		
		sleepIn(true, false);
		
	}

       private static void sleepIn(boolean b, boolean c) {
		// TODO Auto-generated method stub
		
	}

	static boolean CheckIShouldSleepIn(boolean weekday, boolean vacation) {
		
		if(!weekday || vacation) {
			return true;
		}
		
		else
			return false;
	

}

}