package com.office.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) {
		
		
		String url = "jdbc:mysql://localhost:3306/db_member";
		String user = "root";
		String password = "1234";
		
		Connection conn = null;
		
		
		// 인증이 안될 시 conn에 null이 들어간다.
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection SUCCESS!!");
		
		// 작업명세서
		String sql = "INSERT INFO TBL_MEMBER(memId, memPw, memMail, memPhone) "
				+ "VALUES(?,?,?,?)";
		
		// 일꾼
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(0, sql);
		pstmt.setString(0, sql);
		pstmt.setString(0, sql);
		pstmt.setString(0, sql);
		
		
		
			
		} catch (SQLException e) {
			System.out.println("Connection FAIL!!");
			e.printStackTrace();
		
		} finally {
			try {
				//방어 코드 null이면 애초에 커넥션이 되지 않기 때문에 null이 아닐 경우 close
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				
				
		
	}
	
}
