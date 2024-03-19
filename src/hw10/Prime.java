package hw10;

public class Prime {

	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++) {
			int random = (int)(Math.random()*100)+1;
			if(isPrime(random)) {
				System.out.println(random + "是質數");
			}else {
				System.out.println(random + "不是質數");
			}
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
