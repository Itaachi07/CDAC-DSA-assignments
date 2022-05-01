import java.util.Scanner;

//Write a function to calculate factorial of a given number using recursion.

public class Question01 {
	static int factorial(int num) {
		if (num==0)
			return 1;
		else 
		return (num * factorial(num-1));
	}

	public static void main(String[] args) {
		int f  =1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value : ");
		int num = sc.nextInt();
		
		System.out.println("The factorial of number is " +factorial(num));
	}

}
