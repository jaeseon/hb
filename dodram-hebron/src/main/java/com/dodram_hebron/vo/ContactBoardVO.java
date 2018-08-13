package com.dodram_hebron.vo;

import java.util.Date;

public class ContactBoardVO {
	private int contact_pkid;
	private String user_name;
	private String user_email;
	private String user_tel;
	private String user_title;
	private String user_ques;
	private Date reg_date;
	private String mail_yn;
	private String answ;
	private Date answ_date;
	private String type;
	
	
	
	@Override
	public String toString() {
		return "ContactBoardVO [contact_pkid=" + contact_pkid + ", user_name=" + user_name + ", user_email="
				+ user_email + ", user_tel=" + user_tel + ", user_title=" + user_title + ", user_ques=" + user_ques
				+ ", reg_date=" + reg_date + ", mail_yn=" + mail_yn + ", answ=" + answ + ", answ_date=" + answ_date
				+ ", type=" + type + "]";
	}
	
	public String getUser_tel() {
		return user_tel;
	}
	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}
	public String getUser_title() {
		return user_title;
	}
	public void setUser_title(String user_title) {
		this.user_title = user_title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getContact_pkid() {
		return contact_pkid;
	}
	public void setContact_pkid(int contact_pkid) {
		this.contact_pkid = contact_pkid;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_ques() {
		return user_ques;
	}
	public void setUser_ques(String user_ques) {
		this.user_ques = user_ques;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getMail_yn() {
		return mail_yn;
	}
	public void setMail_yn(String mail_yn) {
		this.mail_yn = mail_yn;
	}
	public String getAnsw() {
		return answ;
	}
	public void setAnsw(String answ) {
		this.answ = answ;
	}
	public Date getAnsw_date() {
		return answ_date;
	}
	public void setAnsw_date(Date answ_date) {
		this.answ_date = answ_date;
	}
	
}
