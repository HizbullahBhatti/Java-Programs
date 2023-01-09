import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a , b , c;
		Scanner in = new Scanner (System.in);
		System.out.print(" Enter 1st Number");
		a=in.nextFloat();
		
		System.out.print(" Enter 2nd Number");
		b=in.nextFloat();
		
		System.out.print(" Enter 3rd Number");
		c=in.nextFloat();
		
		if (a>b && a>c) {
			System.out.println("Hi");
			
		}
		if(a>b || b>c) {
			System.out.println("Hello");
		}
		
		/*
		 * if(((a && b) || !(b && c))) {
		 * 
		 * }
		 * 
		 * if((a || b) && !(a>b)) {
		 * 
		 * }
		 */
		
		if ((a == b) && (a!=c)) {
			System.out.print("Bye");
		}
		
	
	
	
	
	
	
	
	
	
	}
}