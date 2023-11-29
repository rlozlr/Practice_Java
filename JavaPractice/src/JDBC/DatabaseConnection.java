package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	// DB 접속
	// DB Driver, URL, user, password
	// driver : com.mysql.cj.jdbc.Driver
	// url : jdbc:mysql://localhost:3306/db명(javadb)
	// user : javaUser
	// password : mysql
	
	// 싱글톤 패턴을 사용하여 단 하나의 DatabaseConnection 객체를 생성하도록 함
	private static DatabaseConnection dbc = new DatabaseConnection();
	// DB 연결 객체
	private Connection conn = null;
	// JDBC 드라이버 클래스명
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	// DB URL
	private String jdbcUrl = "jdbc:mysql://localhost:3306/javadb";
	
	// 생성자에서 DB 접속 수행
	private DatabaseConnection() {
		 // 반드시 try-catch 블록으로 예외 처리
		try {
			 // JDBC 드라이버 클래스 로드
			Class.forName(jdbcDriver);
			// DriverManager를 사용하여 DB 연결
			conn = DriverManager.getConnection(jdbcUrl, "javaUser", "mysql");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없음");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("연결정보가 정확하지 않음");
			e.printStackTrace();
		}
	}
	
	// 싱글톤 패턴에서 단일 객체를 반환하는 메서드
	static DatabaseConnection getInstance() {
		return dbc;
	}
	
	// 데이터베이스 연결 객체를 반환하는 메서드
	Connection getConnection() {
		return conn;
	}
	
}
