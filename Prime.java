import java.util.Scanner;


public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int i=2;
		int notPrime = 0;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value to test if prime:");
		x = input.nextInt();
		input.close();
		
		while (i <= x/2){
			if (x % i == 0)
				notPrime = 1;
			i++;
		}
			if (notPrime == 1)
				System.out.println("The number is not prime.");
			else
				System.out.println("The number is prime.");
		
	
	}
	}


