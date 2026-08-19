package com.office.dbex.member;

public interface IMember {

	// Menu
	final public int MEMBER_SIGN_UP		= 1;
	final public int MEMBER_SIGN_IN		= 2;
	final public int MEMBER_MODIFY		= 3;
	final public int MEMBER_DELETE		= 4;
	
	// Result
	final public int MEMBER_SIGN_UP_SUCCESS = 1;
	final public int MEMBER_SIGN_UP_FAIL 	= 0;
	
	final public boolean MEMBER_SIGN_IN_SUCCESS = true;
	final public boolean MEMBER_SIGN_IN_FAIL 	= false;
	
}
