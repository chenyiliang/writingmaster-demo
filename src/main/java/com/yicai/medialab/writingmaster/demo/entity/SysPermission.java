package com.yicai.medialab.writingmaster.demo.entity;

import java.util.Date;
import java.util.List;

public class SysPermission {
	private String id;
	private String parentId;
	private String title;
	private String permission;
	private List<String> mappingUrls;
	private Byte type;
	private String icon;
	private String remarks;
	private Integer sortWeight;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public List<String> getMappingUrls() {
		return mappingUrls;
	}

	public void setMappingUrls(List<String> mappingUrls) {
		this.mappingUrls = mappingUrls;
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getSortWeight() {
		return sortWeight;
	}

	public void setSortWeight(int sortWeight) {
		this.sortWeight = sortWeight;
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

	@Override
	public String toString() {
		return "SysPermission [id=" + id + ", parentId=" + parentId + ", title=" + title + ", permission=" + permission
				+ ", mappingUrls=" + mappingUrls + ", type=" + type + ", icon=" + icon + ", remarks=" + remarks
				+ ", sortWeight=" + sortWeight + ", createBy=" + createBy + ", createTime=" + createTime + ", updateBy="
				+ updateBy + ", updateTime=" + updateTime + "]";
	}

}
