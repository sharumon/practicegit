package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangecontactPOM {
	WebDriver driver;
	public OrangecontactPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//*[@id=\"header-navbar\"]/ul[3]/li[1]/a")
WebElement click_contactsales;
public WebElement contactsales() {
	return click_contactsales;	
}
@FindBy(name="FirstName")
WebElement edit_firstname;
public WebElement firstname() {
	return edit_firstname;	
}
@FindBy(name="LastName")
WebElement edit_lastname;
public WebElement lastname() {
	return edit_lastname;
}
@FindBy(id="Form_submitForm_CompanyName")
WebElement edit_companyname;
public WebElement companyname() {
	return edit_companyname;
}
@FindBy(id="Form_submitForm_NoOfEmployees")
public WebElement click_NoOfEmployees;

@FindBy(name="JobTitle")
WebElement edit_jobtitle;
public WebElement jobtitle() {
	return edit_jobtitle;
	
}
 @FindBy(id="Form_submitForm_Contact")
 WebElement edit_phonenumber;
 public WebElement phonenumber() {
	return edit_phonenumber;
	 
 }
 @FindBy(id="Form_submitForm_Email")
 WebElement edit_email;
 public WebElement email() {
	return edit_email;
	 
 }
 		
 @FindBy(name="Country")
 public WebElement click_county;
 
 @FindBy(name="Comment")
 WebElement edit_message;
 public WebElement message() {
	return edit_message;
	
	
	  }
 @FindBy(id="recaptcha-anchor-label")
 WebElement click_recaption;
 public WebElement recaption() {
	return click_recaption;
	
	 
 }
 @FindBy(id="Form_submitForm_action_request")
 WebElement click_submit;
 public WebElement submit() {
	return click_submit;
	
	 
 }
}
