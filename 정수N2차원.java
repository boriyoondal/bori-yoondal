import java.util.Scanner;

public class 정수N2차원 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int a = sc.nextInt();
	
		
	
	int[][] array = new int[a][a];
	int data=1;
	for(int i=0; i<a; i++) {
		for(int j=0; j<a;j++) {
			array[i][j]=data;
			data++;
		}
	
	}
		
		for(int j=0;j<a;j++) {
			System.out.print(array[0][j]+"\t");
		}
		System.out.println();
	
		for(int j=4;j>=0;j--) {
			System.out.print(array[1][j]+"\t");
		}
		System.out.println();
	
		for(int j=0;j<a;j++) {
			System.out.print(array[2][j]+"\t");
		}
		System.out.println();
	
		for(int j=4;j>=0;j--) {
			System.out.print(array[3][j]+"\t");
		}
		System.out.println();
	
		for(int j=0;j<a;j++) {
			System.out.print(array[4][j]+"\t");
		}
		System.out.println();
	
	}
}
