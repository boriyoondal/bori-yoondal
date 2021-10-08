import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ex04SelectALL {

	public static void main(String[] args) {

		// 현재 가입되어 있는 모든 회원의 정보를 출력(콘솔)
		// JDBC_member 테이블의 모든 정보 출력
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		// try~catch : 예외처리(런타임오류)를 위해 작성
		try {
			// 실행 할 코드
			// 1. 드라이버 주소를 로드, 다른 DMS 사용시 경로 수정 필요함
			// ClassNotFoundException catch문에서 예외상황이 발생했을 시 콘솔
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			// 2. 데이터베이스와 연결(Connection 객체 생성)
			conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "select * from jdbc_member";
			// 3. SQL 실행/준비 (PreparedStatement)객체 생성
			psmt = conn.prepareStatement(sql);
			
			//executeUpdate() : insert, delete, update -> 테이블에 변화 O 일 때
			//-> 반환 값(int) -> 몇 개의 행에서 변화가 일어났는지
			//executeQuery() : select -> 테이블에 변화가 없을 때, 읽기만
			//-> 반환 값 (ResultSet(Object), 객체가 반환 됨) -> select문 실행 시 결과값
			//next() : 커서를 한 칸 움직임(다음 행을 가리킴)
			//-> 커서가 가리키는 행에 값이 있는 지 없는 지를 판단함, 있으면 true 반환, 없으면 false 반환
			
			// 4. SQL문 실행
			rs = psmt.executeQuery();

			// 5. 값 출력
			while (rs.next()) {
				//각각의 컬럼 값 가져오기 
				
				String id = rs.getString("id");//컬럼의 순서(1부터 시작) 지정 -> resultset상의 순서
				String pw = rs.getString("pw");
				String nick = rs.getString("nick");
				
				
				System.out.println("ID :"+id);
				System.out.println("PW :"+pw);
				System.out.println("Nick : "+nick);
				System.out.println("=============");
			}

		} catch (Exception e) {
			// try문 에서 발생한 예외 상황에 대한 처리
			e.printStackTrace();
		} finally {
			//try 안에서 예외상황이 발생하든, 발생 않든 무조건 실행하는 구문.
			//6. 사용한 객체 닫기(자원반환)
			try {
				rs.close(); 
				// 객체 생성이 되지 않은 경우-> 위쪽에서 예외상황 발생 -> close() 호출x 
				//->런타임오류(실행을 했을 때 오류가 발생했는 지 확인 할 수 있는 상황) 발생
				psmt.close();
				conn.close();
				//사용한 객체 닫아주고 자원을 반환해준다.
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}

	}

}
