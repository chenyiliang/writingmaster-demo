package com.yicai.medialab.writingmaster.demo.entity;

import java.util.Date;

public class SysUser {
	private String id;
	private String username;
	private String password;
	private String passwordSalt;
	private String realName;
	private String email;
	private Integer mobile;
	private String remarks;
	private String loginIp;
	private Date loginTime;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private Boolean locked;

	public SysUser() {
	}

	public SysUser(String id, String username, String password, String passwordSalt, String realName, String email,
			Integer mobile, String remarks, String loginIp, Date loginTime, String createBy, Date createTime,
			String updateBy, Date updateTime, Boolean locked) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.passwordSalt = passwordSalt;
		this.realName = realName;
		this.email = email;
		this.mobile = mobile;
		this.remarks = remarks;
		this.loginIp = loginIp;
		this.loginTime = loginTime;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.locked = locked;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordSalt() {
		return passwordSalt;
	}

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	@Override
	public String toString() {
		return "SysUser [id=" + id + ", username=" + username + ", password=" + password + ", passwordSalt="
				+ passwordSalt + ", realName=" + realName + ", email=" + email + ", mobile=" + mobile + ", remarks="
				+ remarks + ", loginIp=" + loginIp + ", loginTime=" + loginTime + ", createBy=" + createBy
				+ ", createTime=" + createTime + ", updateBy=" + updateBy + ", updateTime=" + updateTime + ", locked="
				+ locked + "]";
	}

}
