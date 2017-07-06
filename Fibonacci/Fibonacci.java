public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.printFibonacci(9);
	}

	public void printFibonacci(int n) {
		// If the nth number is less than 0, return this message. 
		if (n <= 0) {
			System.out.println("There's no Fibonacci number.");
			return;
		}

		int num1 = 0;
		int num2 = 1;

		if (n == 1) {
			System.out.println(num1);
			return;
		}

		if (n == 2) {
			System.out.println(num1);
			System.out.println(num2);
			return;
		}

		System.out.println(num1);
		System.out.println(num2);
		
		// First print num1 and num2, then loop from the 3rd number. 
		// 3rd number is equal to the sum of num1 and num2. 

		for (int i = 2; i < n; i++) {
	 		int num3 = num1 + num2;

	 		if (num3 % 3 == 0) {
	 			System.out.println("Buzz");
	 		} else if (num3 % 5 == 0) {
	 			System.out.println("Fizz");
	 		} else if (num3 % 15 == 0) {
	 			System.out.println("FizzBuzz");
	 		} else if (isPrime(num3)) {
	 			System.out.println("BuzzFizz");
	 		} else {
	 			System.out.println(num3);
	 		}

	 		num1 = num2;
	 		num2 = num3;
		}
	}

	public boolean isPrime(int n) {
		// Prime number should start from 2, if n == 1, should return false. 
		if (n == 1) {
			return false;
		}
		for (int j = 2; j <= n / 2; j++)   {
	        	if (n % j == 0) {
	            	return false;
	        	}
	    	}
	        return true;
	}
}

