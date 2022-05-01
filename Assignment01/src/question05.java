import java.util.Scanner;

//Write a function to print a given number in hexadecimal format.

public class question05 {
	public static void hex1(int num) {
		if (num!=0)
		{
		if (num%16 == 1)
			System.out.print("1");
		if (num%16 == 2)
			System.out.print("2");
		if (num%16 == 3)
			System.out.print("3");
		if (num%16 == 4)
			System.out.print("4");
		if (num%16 == 5)
			System.out.print("5");
		if (num%16 == 6)
			System.out.print("6");
		if (num%16 == 7)
			System.out.print("7");
		if (num%16 == 8)
			System.out.print("8");
		if (num%16 == 9)
			System.out.print("9");
		if (num%16 == 10)
			System.out.print("A");
		if (num%16 == 11)
			System.out.print("B");
		if (num%16 == 12)
			System.out.print("C");
		if (num%16 == 13)
			System.out.print("D");
		if (num%16 == 14)
			System.out.print("E");
		if (num%16 == 15)
			System.out.print("F");
			hex1(num/16);
			}
	}
public static String tohex(int num)
{
	String hex ="";
	char [] a = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	while (num>0)
	{
		int rem = num%16;
		hex = a[rem]+hex;
		num = num/16;
	}
	return hex;
}
	public static String rehex(int num1)
	{
		char [] a1 = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int rem; 
		String hexdec="";
		if (num1!=0)
		{
			rem = num1%16;
			hexdec = a1[rem]+hexdec;
			num1 = num1/16;
			rehex(num1);
		}
		return hexdec;
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num1 = sc.nextInt();
		hex1(num1);
		System.out.println();
		System.out.println(tohex(num1));
		System.out.print(rehex(num1));
		
	}

}
