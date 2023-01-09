import java.util.Scanner;

public class P39 {

	public static void main(String[] args) {
		boolean abc = true;
		// TODO Auto-generated method stub
		String c,reverse = "";
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a String");
		c = in.next();
		int length = c.length();
		
		for (int i = length-1;i>=0;i--) {
			reverse = reverse + c.charAt(i);
		}
		System.out.println(reverse);
		
		  if (c!=reverse) {
			  abc=false;
			  
			  }
			  
		  if (abc) {
				  
			  System.out.print(c+" is Palindrome"); }
		  else {
			  System.out.print(c+" is not a Palindrome");
		  }
			 
		 
		
		

	}

}
