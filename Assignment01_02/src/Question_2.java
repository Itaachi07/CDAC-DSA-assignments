import java.util.Scanner;

//2. Write a function to calculate power using recursion.

public class Question_2 {
	static int power(int b , int p) {
		if (p!=0)
		{
			return (b * power(b,p-1));
		}
		else return 1;
	}
	public static void main(String[]arggs)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int b = sc.nextInt();
		System.out.println("Enter the power :");
		int p = sc.nextInt();
		System.out.println("the output :" +power(b,p));
	}

}
