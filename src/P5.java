import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("KFC Memo");
		System.out.println("-------------");
		System.out.println("Burger Price = 360.00");
		System.out.println("Ice Cream Price = 90.00");
		System.out.println("Cold Drink Price = 35.00");
		
		
		Scanner in = new Scanner(System.in);
		
		float a,b,c,total;
		float burger=360,ice_cream=90,cold_drink=35;
		
		System.out.println("Number of Burgers");
		a=in.nextFloat();
		
		System.out.println("Number of Ice Cream");
		b=in.nextFloat();
		
		System.out.println("Number of Cold Drinks");
		c=in.nextFloat();
		
		float price_burger = a*burger;
		float price_cream=b*ice_cream;
		float price_cold=c*cold_drink;
		
		total= price_burger+price_cream+price_cold;
		
		System.out.println("Total = "+total);
		
		
	}

}
