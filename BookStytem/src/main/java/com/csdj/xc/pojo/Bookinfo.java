package com.csdj.xc.pojo;

import java.util.Date;



public class Bookinfo {
   private Integer bookid;
   private String bookcode;
   private String bookname;
   private Integer booktype;
   private String bookatuthor;
   private String publishpress;
   private Date publishdate;
   private Integer isborrow;
   private String createdBy;
   private Date creationtime;
   private Date lastupdatetime;
public Integer getBookid() {
	return bookid;
}
public void setBookid(Integer bookid) {
	this.bookid = bookid;
}
public String getBookcode() {
	return bookcode;
}
public void setBookcode(String bookcode) {
	this.bookcode = bookcode;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public Integer getBooktype() {
	return booktype;
}
public void setBooktype(Integer booktype) {
	this.booktype = booktype;
}
public String getBookatuthor() {
	return bookatuthor;
}
public void setBookatuthor(String bookatuthor) {
	this.bookatuthor = bookatuthor;
}
public String getPublishpress() {
	return publishpress;
}
public void setPublishpress(String publishpress) {
	this.publishpress = publishpress;
}
public Date getPublishdate() {
	return publishdate;
}
public void setPublishdate(Date publishdate) {
	this.publishdate = publishdate;
}
public Integer getIsborrow() {
	return isborrow;
}
public void setIsborrow(Integer isborrow) {
	this.isborrow = isborrow;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public Date getCreationtime() {
	return creationtime;
}
public void setCreationtime(Date creationtime) {
	this.creationtime = creationtime;
}
public Date getLastupdatetime() {
	return lastupdatetime;
}
public void setLastupdatetime(Date lastupdatetime) {
	this.lastupdatetime = lastupdatetime;
}
@Override
public String toString() {
	return "Bookinfo [bookid=" + bookid + ", bookcode=" + bookcode + ", bookname=" + bookname + ", booktype=" + booktype
			+ ", bookatuthor=" + bookatuthor + ", publishpress=" + publishpress + ", publishdate=" + publishdate
			+ ", isborrow=" + isborrow + ", createdBy=" + createdBy + ", creationtime=" + creationtime
			+ ", lastupdatetime=" + lastupdatetime + "]";
}
   
}
