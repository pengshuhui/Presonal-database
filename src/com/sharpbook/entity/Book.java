package com.sharpbook.entity;

public class Book {
	private int BID;
	private String BTitle;
	private String BAuthor;
	private double BPrice;
	private Category BCategoryID=new Category();
	private String BPublisher;
	private String BPhoto;
	public int getBID() {
		return BID;
	}
	public void setBID(int bID) {
		BID = bID;
	}
	public String getBTitle() {
		return BTitle;
	}
	public void setBTitle(String bTitle) {
		BTitle = bTitle;
	}
	public String getBAuthor() {
		return BAuthor;
	}
	public void setBAuthor(String bAuthor) {
		BAuthor = bAuthor;
	}
	public double getBPrice() {
		return BPrice;
	}
	public void setBPrice(double bPrice) {
		BPrice = bPrice;
	}
	public Category  getBCategoryID() {
		return BCategoryID;
	}
	public void setBCategoryID(Category bCategoryID) {
		BCategoryID=bCategoryID;
	}
	public Book() {
		super();
	}
	public Book(int bID, String bTitle, String bAuthor, double bPrice, Category bCategoryID, String bPublisher,
			String bPhoto) {
		super();
		BID = bID;
		BTitle = bTitle;
		BAuthor = bAuthor;
		BPrice = bPrice;
		BCategoryID=bCategoryID ;
		BPublisher = bPublisher;
		BPhoto = bPhoto;
	}
	public String getBPublisher() {
		return BPublisher;
	}
	public void setBPublisher(String bPublisher) {
		BPublisher = bPublisher;
	}
	public String getBPhoto() {
		return BPhoto;
	}
	public void setBPhoto(String bPhoto) {
		BPhoto = bPhoto;
	}
	@Override
	public String toString() {
		return "Book [BID=" + BID + ", BTitle=" + BTitle + ", BAuthor=" + BAuthor + ", BPrice=" + BPrice
				+ ", BCategoryID=" + BCategoryID + ", BPublisher=" + BPublisher + ", BPhoto=" + BPhoto + "]";
	}
	

}
