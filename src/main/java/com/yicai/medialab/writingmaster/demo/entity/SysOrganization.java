package com.yicai.medialab.writingmaster.demo.entity;

import java.util.Date;

public class SysOrganization {
	private String id;
	private String title;
	private String parentId;
	private Integer sortWeight;
	private Integer totalPersonLimit;
	private Integer availablePersonLimit;
	private Byte isRoot;
	private String remarks;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private Boolean locked;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Integer getSortWeight() {
		return sortWeight;
	}

	public void setSortWeight(Integer sortWeight) {
		this.sortWeight = sortWeight;
	}

	public Integer getTotalPersonLimit() {
		return totalPersonLimit;
	}

	public void setTotalPersonLimit(Integer totalPersonLimit) {
		this.totalPersonLimit = totalPersonLimit;
	}

	public Integer getAvailablePersonLimit() {
		return availablePersonLimit;
	}

	public void setAvailablePersonLimit(Integer availablePersonLimit) {
		this.availablePersonLimit = availablePersonLimit;
	}

	public Byte getIsRoot() {
		return isRoot;
	}

	public void setIsRoot(Byte isRoot) {
		this.isRoot = isRoot;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
		return "SysOrganization [id=" + id + ", title=" + title + ", parentId=" + parentId + ", sortWeight="
				+ sortWeight + ", totalPersonLimit=" + totalPersonLimit + ", availablePersonLimit="
				+ availablePersonLimit + ", isRoot=" + isRoot + ", remarks=" + remarks + ", createBy=" + createBy
				+ ", createTime=" + createTime + ", updateBy=" + updateBy + ", updateTime=" + updateTime + ", locked="
				+ locked + "]";
	}

}
