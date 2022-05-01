import java.util.Scanner;

//Write a function to print a given number in binary format using recursion.
public class question04 {

	static void tobinary(int num)
	{
		if(num ==0) {
			System.out.print("0");
			return ;
		}	tobinary(num/2);
			System.out.print(num%2);
		
	}
	static void binary(int num)
	{
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		tobinary(num);
		
		
	}

}
