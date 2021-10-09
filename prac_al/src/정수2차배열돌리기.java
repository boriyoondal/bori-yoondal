import java.util.Scanner;

public class 정수2차배열돌리기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		int[][] array = new int [a][a];
		int data = 1;
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[0].length; j++) {
				array[i][j] = data;
				System.out.print(array[i][j]+"\t ");
				data++;
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<array.length;i++) {
			for(int j=array.length-1; j>=0; j--) {
				
				System.out.print(array[j][i]+"\t ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=array.length-1; i>=0; i--) {
			for(int j=array.length-1; j>=0; j--) {
				
				System.out.print(array[i][j]+"\t ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=array.length-1; i>=0; i--) {
			for(int j=0; j<array.length; j++) {
				
				System.out.print(array[j][i]+"\t ");
				}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[0].length; j++) {
				
				System.out.print(array[i][j]+"\t ");
			}
		System.out.println();
		}
}
}