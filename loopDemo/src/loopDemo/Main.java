package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		//for
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		int i=1;
		System.out.println("Döngü biter.");
		
		//while
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While sögüsü biter.");
		
		//do-while
		int j=1;
		do{
			System.out.println(j);
			j++;
		}
		while(j<10);
		System.out.println("Do-while döngüsü biter.");
		}

}
