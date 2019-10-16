package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefinition.Hook;

public class Register {
	public Register()
	{
		PageFactory.initElements(Hook.d, this);
	}
	@FindBy(id="u_0_m")
	private WebElement fname;
	
	@FindBy(id="u_0_o")
	private WebElement lname;
	
	@FindBy(id="u_0_r")
	private WebElement phno;
	
	@FindBy(id="u_0_y")
	private WebElement pswd;
	
	
	@FindBy(id="u_0_a")
	private WebElement gender;
	
	public WebElement getFname() {
		return fname;
	}

	public void setFname(WebElement fname) {
		this.fname = fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public void setLname(WebElement lname) {
		this.lname = lname;
	}

	public WebElement getPhno() {
		return phno;
	}

	public void setPhno(WebElement phno) {
		this.phno = phno;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public void setPswd(WebElement pswd) {
		this.pswd = pswd;
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(WebElement gender) {
		this.gender = gender;
	}

	public WebElement getSignup() {
		return signup;
	}

	public void setSignup(WebElement signup) {
		this.signup = signup;
	}
	@FindBy(id="u_0_15")
	private WebElement signup;
	
	
	
	
	
	

}
