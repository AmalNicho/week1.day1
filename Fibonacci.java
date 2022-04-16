package week1.day1;


public class Fibonacci {
	public static void main(String[] args) {
		int x=8;
		int a=0;
		int b=1;
		int c=0;
		System.out.println("Fibonacci numbers of series "+x+" is :");
	for (int i = 0; i < x; i++) {
					c=a+b;
					a=b;
					b=c;
		
		System.out.print(c+",");
		
		
		
	}
		
	}

}
