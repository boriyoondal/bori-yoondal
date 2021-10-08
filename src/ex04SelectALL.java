import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ex04SelectALL {

	public static void main(String[] args) {

		// ���� ���ԵǾ� �ִ� ��� ȸ���� ������ ���(�ܼ�)
		// JDBC_member ���̺��� ��� ���� ���
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		// try~catch : ����ó��(��Ÿ�ӿ���)�� ���� �ۼ�
		try {
			// ���� �� �ڵ�
			// 1. ����̹� �ּҸ� �ε�, �ٸ� DMS ���� ��� ���� �ʿ���
			// ClassNotFoundException catch������ ���ܻ�Ȳ�� �߻����� �� �ܼ�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			// 2. �����ͺ��̽��� ����(Connection ��ü ����)
			conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "select * from jdbc_member";
			// 3. SQL ����/�غ� (PreparedStatement)��ü ����
			psmt = conn.prepareStatement(sql);
			
			//executeUpdate() : insert, delete, update -> ���̺� ��ȭ O �� ��
			//-> ��ȯ ��(int) -> �� ���� �࿡�� ��ȭ�� �Ͼ����
			//executeQuery() : select -> ���̺� ��ȭ�� ���� ��, �б⸸
			//-> ��ȯ �� (ResultSet(Object), ��ü�� ��ȯ ��) -> select�� ���� �� �����
			//next() : Ŀ���� �� ĭ ������(���� ���� ����Ŵ)
			//-> Ŀ���� ����Ű�� �࿡ ���� �ִ� �� ���� ���� �Ǵ���, ������ true ��ȯ, ������ false ��ȯ
			
			// 4. SQL�� ����
			rs = psmt.executeQuery();

			// 5. �� ���
			while (rs.next()) {
				//������ �÷� �� �������� 
				
				String id = rs.getString("id");//�÷��� ����(1���� ����) ���� -> resultset���� ����
				String pw = rs.getString("pw");
				String nick = rs.getString("nick");
				
				
				System.out.println("ID :"+id);
				System.out.println("PW :"+pw);
				System.out.println("Nick : "+nick);
				System.out.println("=============");
			}

		} catch (Exception e) {
			// try�� ���� �߻��� ���� ��Ȳ�� ���� ó��
			e.printStackTrace();
		} finally {
			//try �ȿ��� ���ܻ�Ȳ�� �߻��ϵ�, �߻� �ʵ� ������ �����ϴ� ����.
			//6. ����� ��ü �ݱ�(�ڿ���ȯ)
			try {
				rs.close(); 
				// ��ü ������ ���� ���� ���-> ���ʿ��� ���ܻ�Ȳ �߻� -> close() ȣ��x 
				//->��Ÿ�ӿ���(������ ���� �� ������ �߻��ߴ� �� Ȯ�� �� �� �ִ� ��Ȳ) �߻�
				psmt.close();
				conn.close();
				//����� ��ü �ݾ��ְ� �ڿ��� ��ȯ���ش�.
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}

	}

}
