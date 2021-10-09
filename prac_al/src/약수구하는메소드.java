import java.util.Arrays;

public class 약수구하는메소드 {

	public static void main(String[] args) {

		int base = 10;
		int[] result_array= getDivisors(base);
		System.out.println(Arrays.toString(result_array));
	}
	private static int[] getDivisors(int base) {
		int[] result_array= new int[base];
		int data=1;
		int index=0;
		for(int i=0;i<base-1;i++) {
			result_array[i]=data;
			data++;
		}
		int[] array = new int[base];
		for(int i=1;i<=base;i++) {
			if(base%i==0) {
				array[index++]=i;
			}
		}
		return Arrays.copyOf(array, index);
	}
}