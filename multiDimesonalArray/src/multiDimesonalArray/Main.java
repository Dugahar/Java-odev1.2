package multiDimesonalArray;

public class Main {

	public static void main(String[] args) {
	String[][] sehirler= new String[3][3];
	sehirler[0][0] = "İstanbul";
    sehirler[0][1] = "Ankara";
    sehirler[0][2] = "Trabzon";
    sehirler[1][0] = "Kırşehir";
    sehirler[1][1] = "Konya";
    sehirler[1][2] = "Antalya";
    sehirler[2][0] = "Mersin";
    sehirler[2][1] = "Tokat";
    sehirler[2][2] = "Yozgat";
    
    for(int i=0;i<=2;i++) {
    	System.out.println("-------------------");
    	for(int j=0;j<=2;j++) {
    		System.out.println(sehirler[i][j]);
    	}
     }
	}

}
