import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the value for the length of diamond");
		int l =in.nextInt();
		  for (int i=1;i<=l ;i++) { 
			  for (int j=1;j<=l-i;j++) { 
				  System.out.print(" ");
		  } 
			  for (int j=1;j<2*i;j++) { 
				  System.out.print("*");} 
			  
			  System.out.println();
			  
		  
		  }
		  
		  for (int i = l - 1; i >= 1; i--) {
		

			  for (int j = l - i; j >= 1; j--) {
					System.out.print(" ");

				}
				for (int j = 2 * i; j > 1; j--) {
					System.out.print("*");
				}
				System.out.println();

		  		}
		  int z;
		  z=in.nextInt();
		  for (int i = 0 ; i<z ;i++) {
			  if(i%2==0) {
				  System.out.println("On");
			  }
			  else {
				  System.out.println("Off");
				  
			  }
			  
			  
		  }
		  String a ="abc";
		  
		  for (int i= 0 ;i<a.length();i++) {
			  if (a.charAt(i)>='a'&& a.charAt(i)<='z') {
				  System.out.print();
			  }
		  }

	}


}