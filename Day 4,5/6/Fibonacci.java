import java.util.Scanner;

class Fibonacci {
	
	private static Scanner sc;

	static void printFibonacciNumbers(int n)
	{
		int f1 = 1, f2 = 1, i;

		if (n < 1)
			return;
		System.out.print(f1);
		for (i = 1; i < n; i++)
		{
			System.out.print(", "+f2);
			int next = f1 + f2;
			f1 = f2;
			f2 = next;
		}
	}
	


	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		System.out.println("Enter a positive no: ");
		int a= sc.nextInt();
		printFibonacciNumbers(a);
	}
}
