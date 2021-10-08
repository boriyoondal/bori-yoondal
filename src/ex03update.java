import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03update {

	public static void main(String[] args) {
		// ����ڿ��� id,pw���� �Է� �ް�
		// �Է¹��� id���� pw�� �����Ͻÿ�.
		
		String pw = "";
		String nick = "";
		
		System.out.println("ȸ�� ���� ���� ����");
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.println("[1]PW [2]NICK");
		int choice = sc.nextInt();
		System.out.println("���� �� ���� ");
		if (choice == 1) {
			System.out.print("���� �� PW : ");
			pw = sc.next();
		} else if (choice == 2) {
			System.out.print("���� �� NickName : ");
			nick = sc.next();
		}

		Connection conn = null;
		PreparedStatement psmt = null;

			try {
				// �������
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
				
				// ����ڰ� ��ĳ�ʷ� �Է¹��� ������ �Է��ϴ� ��

				// 5.SQL��� ����
				int cnt = psmt.executeUpdate();

				// 6. ��� �� ó��
				if (cnt > 0) {
					System.out.println("���� ����");
	
				} else {
					System.out.println("���� ����");
				}

			} catch (Exception e) {
				// �����߻�
				e.printStackTrace();// � ������ �߻��ߴ��� �ܼ�â�� ����� ��
			} finally {
				// ���������� ����Ǵ� ������ ���� ���������� ����Ǵ� �κ�
				// 7. ��������
				// �������� Ư���� �����߻�, ��Ÿ�ӿ���(������ �ؾ����� �� �������Ƿ�) => try,catch���� �־ �����ذ�!
				try {
					psmt.close();
					conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		

	}

}
