package com.accp.hanting.vo.yyx;

import java.util.Date;

public class comment {
                                         public int getServiceAppraiseID() {
		return serviceAppraiseID;
	}
	public void setServiceAppraiseID(int serviceAppraiseID) {
		this.serviceAppraiseID = serviceAppraiseID;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public String getServiceTitle() {
		return serviceTitle;
	}
	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
	}
	public String getServiceAppraiseContent() {
		return serviceAppraiseContent;
	}
	public void setServiceAppraiseContent(String serviceAppraiseContent) {
		this.serviceAppraiseContent = serviceAppraiseContent;
	}
	public Date getServiceAppraiseDate() {
		return serviceAppraiseDate;
	}
	public void setServiceAppraiseDate(Date serviceAppraiseDate) {
		this.serviceAppraiseDate = serviceAppraiseDate;
	}
										private int serviceAppraiseID;
										
                                         private String userNickName;
                                         private String serviceTitle;
                                         private String serviceAppraiseContent;
                                         private Date serviceAppraiseDate;
                                         public String getUserID() {
											return userID;
										}
										public void setUserID(String userID) {
											this.userID = userID;
										}
										private String userID;
                                         private String userName;
										public String getUserName() {
											return userName;
										}
										public void setUserName(String userName) {
											this.userName = userName;
										}
                                         
}
