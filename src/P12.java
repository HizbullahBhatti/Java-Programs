import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter (1-5) from the menu");
		System.out.println("1 - Apple Juice\n2 - Mango Juice\n3 - Sprite\n4 - Water\n5 - Tea");
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter the Choice Number");
		int user =in.nextInt();
		
		if (user == 1) {
			System.out.print("Apple Juice");
		}
		
		else if (user == 2) {
			System.out.print("Mango Juice");
		}
		
		else if (user == 3) {
			System.out.print("Sprite");
		}
		
		else if (user == 4) {
			System.out.print("Water");
		}
		
		else if (user == 5) {
			System.out.print("Tea");
		}
		
		else {
			System.out.println("Error , choice was not valid, here is your money back");
		}

	}

}
