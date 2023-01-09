import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter 1st Number");
		a=in.nextInt();
		System.out.println("Enter 2nd Number");
		b=in.nextInt();
		
		if (a==b) {
			System.out.println(a+" and "+b+" are equal");
		}
		
		if (a>b) {
			System.out.println(a+" is greater than "+b);
		}
		
		if (a<b) {
			System.out.println(b+" is greater than "+a);
		}
		
		if (a!=b) {
			System.out.println(a+" and "+b+" are not equal");
		}
		
		
		
		

	}

}
