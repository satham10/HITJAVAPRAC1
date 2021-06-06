package hit.d4;

public class SwapNumWoTemp {
	public static void main(String[] args) {
		int num1 = -500;
		int num2 = 200;
		System.out.println("Before proceeding swap, numbers as below....\n");
		System.out.println("First Number is " + num1);
		System.out.println("Second Nnumber is " + num2);
		
		num1 = num1 - num2;
		num2 = num2 + num1;
		num1 = num2 - num1;
		
		System.out.println("\nVoila! We had swapped the numbers as below without using Temp Variable....\n");
		System.out.println("Now First number is " + num1);
		System.out.println("Second number is " + num2);
	}

}
