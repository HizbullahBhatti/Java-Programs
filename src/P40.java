import java.util.Scanner;

public class P40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float c;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Celsius Degree");
		c = in.nextFloat();
		float sum=c+(float)273.15;
		System.out.println("Kelvin Temperature is "+sum);

	}

	
	
}
