
public class Fibonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(fib(5));
		System.out.println(fac(5));
		System.out.print("Salary Extended "+CalSal(2));
		
		
	}
	
	public static int fib(int n) {
		if (n==1 || n==0) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
		
	}
	
	public static double CalSal(int y) {
		if (y==1 || y==0) {
			return 10000;
		}
		double a = CalSal(y-1)+(10000*0.10);
		return CalSal(y-1)+(a*0.10);
		
	}
	
	
	
	
	public static int fac(int n) {
		if (n==1 || n==0) {
			return 1;
		}
		return fac(n-1)*n;
		
	}


}
