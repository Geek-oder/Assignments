import java.util.Scanner;

class Concat {
	
	private static Scanner sc;
	
	public static String concat1(String s1, String s2, String s3)
	{
		String s4 = s1.concat(s2).concat(s3);
		return s4;
	}

	public static void concat2(StringBuilder s4, String s2, String s3)
	{
		s4.append(s2+s3);
	}

	public static void concat3(StringBuffer s5, String s2, String s3)
	{
		s5.append(s2+s3);
	}

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		System.out.println("Enter three strings");
		
		String s1= sc.nextLine();
		String s2= sc.nextLine();
		String s3= sc.nextLine();

		//concat1(s1,s2,s3);
		System.out.println("String: " + concat1(s1,s2,s3));

		StringBuilder s4 = new StringBuilder(s1);
		concat2(s4,s2,s3);
		System.out.println("StringBuilder: " + s4);

		StringBuffer s5 = new StringBuffer(s1);
		concat3(s5,s2,s3);
		System.out.println("StringBuffer: " + s5);
	}
}

