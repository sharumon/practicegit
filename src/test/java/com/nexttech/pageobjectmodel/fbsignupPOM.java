package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbsignupPOM {

	WebDriver driver;
public fbsignupPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
@FindBy(xpath="//*[@id=\"login_link\"]/div[3]/a")
WebElement click_createnewaccount;
public WebElement creatnewaccount() {
	return click_createnewaccount;
	
}
	
@FindBy(name="firstname")
WebElement edit_firstname;
public WebElement firstname() {
	return edit_firstname;
}
@FindBy(id="u_b_d_ZT")
WebElement edit_lastname;
public WebElement lastname() {
	return edit_lastname;
}
@FindBy(name="reg_email__")
WebElement edit_mobilenumber;
public WebElement mobilenumber() {
	return edit_mobilenumber;
}
@FindBy(name="reg_passwd__")
WebElement edit_password;
public WebElement password() {
	return edit_password;
	
}
@FindBy(id="month")
public WebElement click_month;{
}
@FindBy(id="day")
public WebElement clcik_day;{
}
@FindBy(id="year")
	public WebElement click_year;{
	}
	
@FindBy(id="u_b_5_Hx")
public WebElement click_gender;{
	
}
@FindBy(name="websubmit")
public WebElement click_signup;{
	
}
}








