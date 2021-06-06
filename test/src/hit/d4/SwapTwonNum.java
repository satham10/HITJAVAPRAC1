package hit.d4;

public class SwapTwonNum {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 500;
		System.out.println("Before proceeding swap, numbers as below....\n");
		System.out.println("First Number is " + num1);
		System.out.println("Second Nnumber is " + num2);
		
		int temp_num = num1;
		num1 = num2;
		num2 = temp_num;
		
		System.out.println("\nVoila! We had swapped the numbers as below....\n");
		System.out.println("Now First number is " + num1);
		System.out.println("Second number is " + num2);
	}

}
