package week1.day1;

public class Factorial {
	public static void main(String[] args) {
		
		int a=10;
		int c=a;
		int b=1;
		
		
		for (int i = a; i> 0; i--) {
			b=a*b;
			a--;
			
				
		}
		System.out.println("Factorial number of "+c+" is "+b);
	}

}
