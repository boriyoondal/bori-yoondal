import java.util.Scanner;

public class 과일고르기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] fruits = { "자몽", "망고", "바나나", "멜론" };
		
		System.out.println("찾고 싶은 과일 : ");
		String fruit = sc.next();

			if (fruit.equals(fruits[0])) {
				System.out.println("자몽의 위치는 1번에 있습니다.");
			}
			else if (fruits.equals(fruits[1])) {
				System.out.println("망고의 위치는 2번에 있습니다.");
			}
			else if (fruit.equals(fruits[2])) {
				System.out.println("바나나의 위치는 3번에 있습니다.");
			} 
			else if(fruit.equals(fruits[3]))
				System.out.println("멜론의 위치는 4번에 있습니다.");

	}
}
