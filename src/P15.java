import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int StartRange , EndRange;
		Scanner in =new Scanner (System.in);
		System.out.println("Enter Start Range");
		StartRange=in.nextInt();
		System.out.println("Enter End Range");
		EndRange=in.nextInt();
		System.out.println("Prime numbers between "+StartRange+" and "+EndRange+" are");
		
		for (int i =StartRange;i<EndRange+1;i++) {
			if (i>1){
				for (int j=2;j<=i;j++) {
					if (i % j==0) {
						break;
					}
					else {
						System.out.println(i);
					}
				}
			}
			
		}
		

	}

}
