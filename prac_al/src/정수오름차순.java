import java.util.Scanner;

public class ������������ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int temp = 0;
		for(int i=0; i<array.length; i++) {
			System.out.print((i+1)+"��° �� �Է� : ");
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
		System.out.println("���� ��  ");	
		for(int i =0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	
	
	}
}
