import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total1;
		Scanner input =new Scanner (System.in);
		System.out.println("Enter the Sale Amount");
		float user=input.nextFloat();
		
		if (user <3000) {
			total1=user+200;
			System.out.println("According to Sale commission is 200\n"+"Toatl "+total1);
			
		}
		else if (user>=3000) {
			double total2 = 200+0.09*user;
			double sum = total2+user;
			System.out.println("According to sale commisiion is "+total2);
			System.out.println("Total Salary adding commission is "+sum);
		}
		
		

	}

}
