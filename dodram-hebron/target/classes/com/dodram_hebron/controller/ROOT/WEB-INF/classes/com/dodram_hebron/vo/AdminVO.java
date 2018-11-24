package com.dodram_hebron.vo;

import java.util.Date;

public class AdminVO {
	private int roster_pkid;
	private String roster_code;
	private String roster_name;
	private String roster_id;
	private String roster_pw;
	private Date roster_joining;

	public int getRoster_pkid() {
		return roster_pkid;
	}

	public void setRoster_pkid(int roster_pkid) {
		this.roster_pkid = roster_pkid;
	}

	public String getRoster_code() {
		return roster_code;
	}

	public void setRoster_code(String roster_code) {
		this.roster_code = roster_code;
	}

	public String getRoster_name() {
		return roster_name;
	}

	public void setRoster_name(String roster_name) {
		this.roster_name = roster_name;
	}

	public String getRoster_id() {
		return roster_id;
	}

	public void setRoster_id(String roster_id) {
		this.roster_id = roster_id;
	}

	public String getRoster_pw() {
		return roster_pw;
	}

	public void setRoster_pw(String roster_pw) {
		this.roster_pw = roster_pw;
	}

	public Date getRoster_joining() {
		return roster_joining;
	}

	public void setRoster_joining(Date roster_joining) {
		this.roster_joining = roster_joining;
	}
	
}
