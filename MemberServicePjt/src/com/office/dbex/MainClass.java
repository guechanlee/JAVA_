package com.office.dbex;

import java.sql.Connection;
import java.sql.DriverManager;

import com.office.dbex.member.MemberController;

public class MainClass {

	public static void main(String[] args) {
		
		new MemberController().execute();
		
		/*
		// MySQL Connect TEST
		String url = "jdbc:mysql://localhost:3306/db_member";
		String user = "root";
		String password = "1234";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection SUCCESS!!");
			
		} catch (Exception e) {
			System.out.println("Connection FAIL!!");
			
			e.printStackTrace();
			
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
			
		}
		*/
		
	}
	
}
