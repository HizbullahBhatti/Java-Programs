import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fac,pressure;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the value Factor");
		fac=in.nextFloat();
		
		if (fac==1 || fac<=10) {
			System.out.println("Value of Pressure is 35");
		}
		else if (fac>10 && fac<=15) {
			System.out.println("Value of Pressure is 45");
		}
		
		else if (fac>15 && fac<=19) {
			System.out.println("Value of Pressure is 55");
		}
		
		else if (fac==20) {
			System.out.println("Value of Pressure is 60");
		}
		
		else {
			System.out.println("Value of Pressure is 0");
		}
		
		

	}

}
