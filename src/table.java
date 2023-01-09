import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner (System.in);
		int a,b,c,d;
		System.out.println("Enter from where table start");
		a=input.nextInt();
		System.out.println("Enter where table end");
		b=input.nextInt();
		System.out.println("Enter the start range");
		c=input.nextInt();
		System.out.println("Enter the end range");
		d=input.nextInt();
		
		for (int i =a;i<=b;i++) {
			for (int j=c;j<=d;j++) {
				System.out.println(i+" x "+j+" = "+i*j);
				System.out.println();
				
				int [] z = new int [3];
				z[0] = 1;
				z[1] = 2;
				
				
				
				System.out.print(z[2]);
				
			}
		}
	}

}
