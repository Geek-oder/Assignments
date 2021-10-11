public class Method_Overloading {
	
	public static int add(int input1, int input2) {
		return input1+input2;
	}
	
	public static double add(double input1, double input2) {
		return input1+input2;	
	}

	public static String add(String input1, String input2) {
		return input1.concat(input2);	
	}
	public static void main(String[] args) {
		
		System.out.println(add(5,4));
		
	}

}
