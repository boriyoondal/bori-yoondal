import java.util.Scanner;

public class ����n��2�߹迭 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("���� �Է� : ");
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
