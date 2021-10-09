import java.util.Scanner;

public class 정수오름차순 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int temp = 0;
		for(int i=0; i<array.length; i++) {
			System.out.print((i+1)+"번째 수 입력 : ");
			array[i] = sc.nextInt();
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-(i+1); j++) {
				if(array[j]>array[j+1]) {
					 temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("정렬 후  ");	
		for(int i =0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	
	
	}
}
