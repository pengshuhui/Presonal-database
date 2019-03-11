package com.sharpbook.entity;

public class Category {
	private int CID;
	private String CName;
	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	@Override
	public String toString() {
		return "Category [CID=" + CID + ", CName=" + CName + "]";
	}
	public Category(int cID, String cName) {
		super();
		CID = cID;
		CName = cName;
	}
	public Category() {
		super();
	}
	

}
