/**
 *  工程名：dubbo.pojo
 *  文件名：CnUser.java
 *  包名：com.loner.dubbo.pojo
 *  创建时间：2016年9月13日 上午10:49:02
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.dubbo.pojo;

import java.io.Serializable;

/**
 *  类名：CnUser
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年9月13日 上午10:49:02
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class CnUser implements Serializable {

	private static final long serialVersionUID = 7597208973898660283L;

	private String uid;
	private String uname;
	private String uage;
	private String addr;

	public CnUser() {
		super();
	}

	public CnUser(String uid, String uname, String uage, String addr) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uage = uage;
		this.addr = addr;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUage() {
		return uage;
	}

	public void setUage(String uage) {
		this.uage = uage;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "CnUser [uid=" + uid + ", uname=" + uname + ", uage=" + uage + ", addr=" + addr + "]";
	}

}
