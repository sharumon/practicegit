package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookloginPOM {
WebDriver driver;
public facebookloginPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(name="email")
WebElement sendkeys_email;
public WebElement email() {
	return sendkeys_email;
	
}

@FindBy(name="pass")
WebElement sendkeys_password;
public WebElement password() {
	return sendkeys_password;
	
}
@FindBy(id="loginbutton")
WebElement click_login;
public WebElement login() {
	return click_login;
	
}




}
