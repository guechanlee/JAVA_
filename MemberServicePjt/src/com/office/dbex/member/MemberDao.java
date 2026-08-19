package com.office.dbex.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao implements IMemberDao {
	
	public int insertNewMember(MemberDto memberDto) {
		System.out.println("[MemberDao] insertNewMember()");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;
		
		try {
			// 1. Connect 객체 생성 (App과 DB Server 연결, 다리 건설)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 2. 작업 명세서(SQL)
			/*
			String sql = "INSERT INTO TBL_MEMBER(memId, memPw, memMail, memPhone) "
					+ "VALUES(" + memberDto.getMemId() + 
					", " + memberDto.getMemPw() + 
					", " + memberDto.getMemMail() + 
					", " + memberDto.getMemPhone() + ")";
					
			System.out.println("sql: " + sql);
			*/
			
			String sql =  "INSERT INTO TBL_MEMBER(memId, memPw, memMail, memPhone) "
						+ "VALUES(?, ?, ?, ?)";
			
			// 3. 일꾼
			pstmt = conn.prepareStatement(sql);
			
			// 4. 데이터 주입
			pstmt.setString(1, memberDto.getMemId());
			pstmt.setString(2, memberDto.getMemPw());
			pstmt.setString(3, memberDto.getMemMail());
			pstmt.setString(4, memberDto.getMemPhone());
			
			// 5. 작업 지시(run or execute)
			result = pstmt.executeUpdate();  // 0 또는 1
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			// 6. 외부 자원 해제
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return result;  // -1
		
	}

	public MemberDto selectMemberByMemId(String id) {
		System.out.println("[MemberDao] selectMemberByMemId()");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<MemberDto> dtos = new ArrayList<MemberDto>();
		
//		dtos.size():     0 or 1
		
		try {
			// 1. Connect 객체 생성 (App과 DB Server 연결, 다리 건설)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 2. 작업 명세서(SQL)
			String sql =  "SELECT "
						+ 	"* "
						+ "FROM "
						+ 	"TBL_MEMBER "
						+ "WHERE "
						+ 	"memId = ?";
			
			// 3. 일꾼
			pstmt = conn.prepareStatement(sql);
			
			// 4. 데이터 주입
			pstmt.setString(1, id);
			
			// 5. 작업 지시(run or execute)
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int memNo = rs.getInt("memNo");
				String memId = rs.getString("memId");
				String memPw = rs.getString("memPw");
				String memMail = rs.getString("memMail");
				String memPhone = rs.getString("memPhone");
				String memRegDate = rs.getString("memRegDate");
				String memModDate = rs.getString("memModDate");
				
				MemberDto dto = 
						new MemberDto(memNo, memId, memPw, memMail, memPhone, memRegDate, memModDate);
				
				dtos.add(dto);
				
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			// 6. 외부 자원 해제
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return dtos.size() > 0 ? dtos.get(0) : null;
		
	}

}
