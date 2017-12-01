package com.boot.dubbo.server.model;

import java.io.Serializable;

import com.summaryday.framework.a.Colum;
import com.summaryday.framework.a.Colum.ObjTypes;
import com.summaryday.framework.a.Key;
import com.summaryday.framework.a.Table;


@SuppressWarnings("serial")
@Table(name="t_user")
public class User implements Serializable{
	@Key(isPrimary=true)
	@Colum(columName="id",isNUll=false,type=ObjTypes.STRING)
	private String id;
	
	@Colum(columName="username",isNUll=false,type=ObjTypes.STRING)
	private String username;
	
	/*@Colum(columName="password",isNUll=false,type=ObjTypes.STRING)
	private String password;
	*/
	@Colum(columName="postname",isNUll=false,type=ObjTypes.STRING)
	private String postname;
	
//	@Colum(columName="department",isNUll=false,type=ObjTypes.STRING)
//	private String department;
	
	/*@Colum(columName="userqq",isNUll=false,type=ObjTypes.STRING)
	private String userqq;
	
	@Colum(columName="useremail",isNUll=false,type=ObjTypes.STRING)
	private String useremail;*/
	
	@Colum(columName="userphone",isNUll=false,type=ObjTypes.STRING)
	private String userphone;
	/*
	@Colum(columName="usersex",isNUll=false,type=ObjTypes.STRING)
	private String usersex;
	
	@Colum(columName="udate",isNUll=false,type=ObjTypes.STRING)
	private String udate;*/

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

	/*public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}*/

	public String getPostname() {
		return postname;
	}

	public void setPostname(String postname) {
		this.postname = postname;
	}

	/*public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUserqq() {
		return userqq;
	}

	public void setUserqq(String userqq) {
		this.userqq = userqq;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
*/
	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	/*public String getUsersex() {
		return usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getUdate() {
		return udate;
	}

	public void setUdate(String udate) {
		this.udate = udate;
	}
	*/
	
		
}