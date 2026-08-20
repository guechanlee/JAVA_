package com.office.dbex.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IMemberDao {

	final String URL = "jdbc:mysql://localhost:3306/db_member";
	final String USER = "root";
	final String PASSWORD = "1234";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	int result = -1;
	
public int insertNewMember(MemberDto memberDto);

public MemberDto selectMemberByMemId(String id);	

public int updateMember(MemberDto memberDto);

public int deleteMemberByMemId(String memId);
	
	
	return result;
	
}
	
}
