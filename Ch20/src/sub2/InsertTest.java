package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



/*
 * 날짜 : 2020/05/26
 * 이름 : 최정한
 * 내용 : JDBC INSERT 실습하기
 */
public class InsertTest {
	public static void main(String[] args) throws Exception {
		
		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/cjh";
		String user = "cjh";
		String pass = "1234";
		
		// 1단계 - JDBC 드라이버 동적로드
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		// 3단계 - SQL 실행객체 생성
		Statement stmt = conn.createStatement();
		
		// 4단계 - SQL 실행
		String sql = "INSERT INTO `USER1` VALUES ('J102', '정약용', '010-1231-2913', 42)";
		stmt.executeUpdate(sql);
		
		// 5단계 - 결과셋(ResultSet) 처리(SELECT일 경우)
		
		// 6단계 - 데이터베이스 종료(해제)
		stmt.close();
		conn.close();
		
		System.out.println("INSERT 완료...");
	}
}
