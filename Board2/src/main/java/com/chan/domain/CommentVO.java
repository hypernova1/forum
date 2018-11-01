package com.chan.domain;

import java.util.Date;

public class CommentVO {

	private Integer cno;
	private Integer bno;
	private Integer originno;
	private Integer groupord;
	private Integer grouplayer;
	private String title;
	private String content;
	private Integer writer;
	private Date regdate;
	
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public Integer getOriginno() {
		return originno;
	}
	public void setOriginno(Integer originno) {
		this.originno = originno;
	}
	public Integer getGroupord() {
		return groupord;
	}
	public void setGroupord(Integer groupord) {
		this.groupord = groupord;
	}
	public Integer getGrouplayer() {
		return grouplayer;
	}
	public void setGrouplayer(Integer grouplayer) {
		this.grouplayer = grouplayer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getWriter() {
		return writer;
	}
	public void setWriter(Integer writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
}