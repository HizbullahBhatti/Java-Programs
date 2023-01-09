import java.util.Scanner;

public class Other_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b, c ,d , sum1 , sum2;
		
		Scanner input =new Scanner (System.in);
		
		System.out.println("Enter numerator for first fraction");
		a=input.nextInt();
		
		System.out.println("Enter denominator for first fraction");
		b=input.nextInt();
		
		System.out.println("Enter numerator for second fraction");
		c=input.nextInt();
		
		System.out.println("Enter denominator for second fractions");
		d=input.nextInt();
		
		sum1 = (a*d) + (b*c);
		sum2 = b*d;
		
		System.out.println("Sum "+sum1+"/"+sum2 );
		
		
		

	}

}
