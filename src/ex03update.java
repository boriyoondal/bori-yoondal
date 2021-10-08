import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03update {

	public static void main(String[] args) {
		// 사용자에게 id,pw값을 입력 받고
		// 입력받은 id값의 pw를 변경하시오.
		
		String pw = "";
		String nick = "";
		
		System.out.println("회원 정보 수정 서비스");
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.println("[1]PW [2]NICK");
		int choice = sc.nextInt();
		System.out.println("수정 할 정보 ");
		if (choice == 1) {
			System.out.print("수정 할 PW : ");
			pw = sc.next();
		} else if (choice == 2) {
			System.out.print("수정 할 NickName : ");
			nick = sc.next();
		}

		Connection conn = null;
		PreparedStatement psmt = null;

			try {
				// 정상실행
				Class.forName("oracle.jdbc.driver.OracleDriver");

				String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
				String dbid = "hr";
				String dbpw = "hr";
				conn = DriverManager.getConnection(url, dbid, dbpw);
				
				if(choice==1) {
					String sql = "update JDBC_member set pw = ?  where id = ?";
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, pw);
					psmt.setString(2, id);
					
				}else if(choice==2) {
					String sql = "update JDBC_member set nick = ?  where id = ?";
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, nick);
					psmt.setString(2, id);
				}
				
				// 사용자가 스캐너로 입력받은 정보를 입력하는 곳

				// 5.SQL명령 실행
				int cnt = psmt.executeUpdate();

				// 6. 명령 후 처리
				if (cnt > 0) {
					System.out.println("수정 성공");
	
				} else {
					System.out.println("수정 실패");
				}

			} catch (Exception e) {
				// 오류발생
				e.printStackTrace();// 어떤 오류가 발생했는지 콘솔창에 출력해 줌
			} finally {
				// 정상적으로 실행되던 오류가 났던 마지막으로 실행되는 부분
				// 7. 연결종료
				// 지역변수 특성상 오류발생, 런타임오류(실행을 해야지만 알 수있으므로) => try,catch문에 넣어서 문제해결!
				try {
					psmt.close();
					conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		

	}

}
