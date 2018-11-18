package com.dodram_hebron.vo;

import java.util.Date;

public class UpdateReportVO {
	private int no;
	private String title;
	private String type;
	private Date register_date;
	private Date update_date;
	@Override
	public String toString() {
		return "UpdateReportVO [no=" + no + ", title=" + title + ", type=" + type + ", register_date=" + register_date
				+ ", update_date=" + update_date + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getRegister_date() {
		return register_date;
	}
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	
}
