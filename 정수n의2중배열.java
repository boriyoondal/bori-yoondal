import java.util.Scanner;

public class 정수n의2중배열 {

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
	for(int i=0;i<a;i++) {
		for(int j=0;j<a; j++) {
			System.out.print(array[j][i]+"\t");
		}
	System.out.println();
	}
	
	
	
	
	
	
	
	
	}
}
