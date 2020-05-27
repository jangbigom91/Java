package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2020/05/26
 * 이름 : 최정한
 * 내용 : JDBC Update 실습하기
 */
public class UpdateTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/cjh";
		String user = "cjh";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql 	= "UPDATE `USER1` SET `hp`='010-1111-1111' ";
				   sql += "WHERE `uid`='J101'";
			
			stmt.executeUpdate(sql);
			
			// 5단계 - 결과셋 처리(SELECT일 경우)
			
			// 6단계 - 데이터베이스 종료
			conn.close();
			
		} catch (Exception e) {
			System.out.println("쿼리문 실행에 문제가 발생했습니다.");;
		} 
		System.out.println("UPDATE 완료...");
	}
}
