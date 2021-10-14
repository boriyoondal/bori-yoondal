import java.util.Random;
import java.util.Scanner;

public class .LOTTO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = rd.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.println("Çà¿îÀÇ¼ýÀÚ  : "+lotto[i]);
		}
	
	
	
	
	}
}
