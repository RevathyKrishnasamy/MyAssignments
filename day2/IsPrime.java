package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n = 37, c = 0;
	
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				c++;
		}
		
		

		if (c == 2) {
			System.out.println(n + " " + "is a prime number");
		} else {
			System.out.println(n + " " + "not a prime number");
		}
		
	

	}
}
