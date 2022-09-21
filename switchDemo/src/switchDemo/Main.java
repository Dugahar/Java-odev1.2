package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'F';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel");
			break;
		case 'B':
			System.out.println("Güzel");
			break;
		case 'C':
			System.out.println("Geçer");
			break;
		case 'D':
			System.out.println("Koşullu geçer");
			break;
		case 'F':
			System.out.println("Kalır");
			break;
		default:
			System.out.println("Geçersiz not");
		}
	}

}
