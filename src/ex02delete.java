import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex02delete {

	public static void main(String[] args) {
		// 사용자가 입력한 ID를 삭제하시오.

		System.out.println("회원삭제 서비스");
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			conn = DriverManager.getConnection(url, dbid, dbpw);
			//여기까지 고정값
			
			String sql = "delete from JDBC_member where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				psmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
