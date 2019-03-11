package com.sharpbook.entity;

public class User {

	private int UID;
	private String ULOginID;
	private String  ULoginPwd;
	private String UName;
	private int UPoint;
	public User(int uID, String uLOginID, String uLoginPwd, String uName, int uPoint) {
		super();
		UID = uID;
		ULOginID = uLOginID;
		ULoginPwd = uLoginPwd;
		UName = uName;
		UPoint = uPoint;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [UID=" + UID + ", ULOginID=" + ULOginID + ", ULoginPwd=" + ULoginPwd + ", UName=" + UName
				+ ", UPoint=" + UPoint + "]";
	}
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public String getULOginID() {
		return ULOginID;
	}
	public void setULOginID(String uLOginID) {
		ULOginID = uLOginID;
	}
	public String getULoginPwd() {
		return ULoginPwd;
	}
	public void setULoginPwd(String uLoginPwd) {
		ULoginPwd = uLoginPwd;
	}
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public int getUPoint() {
		return UPoint;
	}
	public void setUPoint(int uPoint) {
		UPoint = uPoint;
	}
	
	
}
