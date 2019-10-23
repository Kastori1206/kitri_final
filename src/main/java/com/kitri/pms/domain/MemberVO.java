package com.kitri.pms.domain;

public class MemberVO {
	private String m_id;
	private String m_pw;
	private String m_name;
	private int m_lv;
	private String m_joindate;
	private String m_image;
	private String m_phone;
	private String m_email;
	
	
	public MemberVO() {
		super();
	}
	public MemberVO(String m_id, String m_pw, String m_name, String m_phone, String m_email) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
		this.m_email = m_email;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public int getM_lv() {
		return m_lv;
	}
	public void setM_lv(int m_lv) {
		this.m_lv = m_lv;
	}
	public String getM_joindate() {
		return m_joindate;
	}
	public void setM_joindate(String m_joindate) {
		this.m_joindate = m_joindate;
	}
	public String getM_image() {
		return m_image;
	}
	public void setM_image(String m_image) {
		this.m_image = m_image;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	@Override
	public String toString() {
		return "MemberVO [m_id=" + m_id + ", m_pw=" + m_pw + ", m_name=" + m_name + ", m_lv=" + m_lv + ", m_joindate="
				+ m_joindate + ", m_image=" + m_image + ", m_phone=" + m_phone + ", m_email=" + m_email + "]";
	}
	
	
}
