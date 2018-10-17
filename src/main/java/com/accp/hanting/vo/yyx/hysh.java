package com.accp.hanting.vo.yyx;

import java.util.Date;

public class hysh {
            public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsernickname() {
		return usernickname;
	}
	public void setUsernickname(String usernickname) {
		this.usernickname = usernickname;
	}
	public Integer getMerchanttype() {
		return merchanttype;
	}
	public void setMerchanttype(Integer merchanttype) {
		this.merchanttype = merchanttype;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public Integer getUserintegral() {
		return userintegral;
	}
	public void setUserintegral(Integer userintegral) {
		this.userintegral = userintegral;
	}
	public Integer getUsermoney() {
		return usermoney;
	}
	public void setUsermoney(Integer usermoney) {
		this.usermoney = usermoney;
	}
	public Integer getLogintype() {
		return logintype;
	}
	public void setLogintype(Integer logintype) {
		this.logintype = logintype;
	}

	public Integer getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getMerchantphone() {
		return merchantphone;
	}
	public void setMerchantphone(String merchantphone) {
		this.merchantphone = merchantphone;
	}
	public Date getRecententry() {
		return recententry;
	}
	public void setRecententry(Date recententry) {
		this.recententry = recententry;
	}
			private Integer userid;
            private String usernickname;
            private Integer merchanttype;
            private String useremail;
            private Integer userintegral;
            private Integer usermoney;
            private Integer logintype;
            public Integer getAs() {
				return as;
			}
			public void setAs(Integer as) {
				this.as = as;
			}
			private Integer as;
            private Integer auditStatus;
            private String merchantphone;
            private Date recententry;
            private String userphone;
            public String getUserphone() {
				return userphone;
			}
			public void setUserphone(String userphone) {
				this.userphone = userphone;
			}
			public int getUsersex() {
				return usersex;
			}
			public void setUsersex(int usersex) {
				this.usersex = usersex;
			}
			private int usersex;
			private int stateboolean;
			public int getStateboolean() {
				return stateboolean;
			}
			public void setStateboolean(int stateboolean) {
				this.stateboolean = stateboolean;
			}
			
			public String userrealname;
			public String getUserrealname() {
				return userrealname;
			}
			public void setUserrealname(String userrealname) {
				this.userrealname = userrealname;
			}
		private String username;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String userPwd;
		public String getUserPwd() {
			return userPwd;
		}
		public void setUserPwd(String userPwd) {
			this.userPwd = userPwd;
		}
		
		private int authentication;
		public int getAuthentication() {
			return authentication;
		}
		public void setAuthentication(int authentication) {
			this.authentication = authentication;
		}
		
		private String shopName;
		public String getShopName() {
			return shopName;
		}
		public void setShopName(String shopName) {
			this.shopName = shopName;
		}
}
