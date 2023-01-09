import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Given Formula m = (x-h)^2 + (y-k)^2"+"\n"+"we have to find value of m from given value of x , h , y , k");
		int a , b, c ,d;
		
		Scanner input =new Scanner (System.in);
		
		System.out.println("Enter the value for x");
		a=input.nextInt();
		
		System.out.println("Enter the value for h");
		b=input.nextInt();
		
		System.out.println("Enter the value for y");
		c=input.nextInt();
		
		System.out.println("Enter the value for k");
		d=input.nextInt();
		
		int m;
		m = (a-b)^2+(c-d)^2;
		System.out.print("Value of m is "+m);
		

	}
	

}
