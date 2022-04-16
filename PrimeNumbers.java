package week1.day1;


public class PrimeNumbers {
	public static void main(String[] args) {
		
		int a=997;
		
		boolean flag=true;
		
		for (int i = 2; i <a/2 ; i++) {
		if (a%i==0)
		{ flag=false;
		break;
		}
			}
		if (flag==true)
		{ System.out.println(a +" is prime number");
		
		}
else
{ System.out.println(a +" is not prime number");
		}

	}
	
	}

