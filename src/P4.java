import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a,b,c,d,sum,average,minimum;
		
		Scanner in =new Scanner (System.in);
		System.out.print("Enter the marks of Hassan");
		a=in.nextFloat();
		System.out.print("Enter the marks of Ali");
		b=in.nextFloat();
		System.out.print("Enter the marks of Memon");
		c=in.nextFloat();
		
		sum=a+b+c; average=sum/3;
		System.out.println("Sum is: "+sum);
		System.out.println("Average is: "+average);
		
		if (a<=b && a<=c) {
			System.out.println("Minimum marks:"+a);
		}
		else if (b<=a && b<=c) {
			System.out.println("Minimum marks:"+b);
		}
		else if (c<=a && c<=b) {
			System.out.println("Minimum marks: "+c);
		}

	}

}
