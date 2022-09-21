package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number = 5;
		int answer = 0;
		
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				answer = answer + i;
			}
		}
		if(answer == number) {
			System.out.println("Mükemmel sayıdır.");
		}
		else {
			System.out.println("Mükemmel sayı değildir.");
		}
	}

}
