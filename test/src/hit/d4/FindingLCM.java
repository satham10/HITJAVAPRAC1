package hit.d4;

public class FindingLCM {

	public static void main(String[] args) {
		int num1 = 120, num2 = 60, LCM;
		LCM = (num1 > num2) ? num1 : num2;
		while(true) {
		if( LCM % num1 == 0 && LCM % num2 == 0 ) {
		System.out.printf("The LCM of %d and %d is %d.", num1, num2, LCM);
		break;
		}
		++LCM;
		}
		
	}

}
