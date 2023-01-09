import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner (System.in);
		
		System.out.println("Enter the marks of Programming");
		int user=input.nextInt();
		if (user == 0 || user<90) {
			System.out.println("better Luck Next Time");
		}
		else if (user>=90 && user<=99) {
			System.out.println("You Scored an A");
			
		}
		else if (user == 100) {
			System.out.println("You got a perfect score");
		}

	}

}
