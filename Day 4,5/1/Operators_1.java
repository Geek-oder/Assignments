import java.util.*;
public class Operators_1 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers");
		
		sc= new Scanner(System.in);    
		  
		int a= sc.nextInt();  
		  
		int b= sc.nextInt();  
		  
		int c= sc.nextInt(); 
		
		if(a>b && a>c) {
			System.out.println("The greatest number is "+a);
		}
		
		else if(b>c && b>a) {
			System.out.println("The greatest number is "+b);
		}
		
		else if(c>b && c>a) {
			System.out.println("The greatest number is "+c);
		}
		else {
			System.out.println("Wrong Input");
		}

	}

}
