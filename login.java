import java.util.Scanner;

public class 로그인 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String id = "dldmsql1214";
		String pw = "1214";
		
		String new_id = "";
		String new_pw = "";

		while (true) {
			System.out.print("ID : ");
			new_id = sc.next();
			System.out.print("PW : ");
			new_pw = sc.next();
			if (!new_id.equals(id) || !new_pw.equals(pw)) {
				System.out.println("로그인 성공");
			break;
			} else {	
				System.out.println("로그인 실패");	
			}
		} 


	}

}
