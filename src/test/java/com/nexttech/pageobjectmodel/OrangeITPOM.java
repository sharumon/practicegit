package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeITPOM {

	WebDriver driver;
	public OrangeITPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(xpath="//*[@id=\"header-navbar\"]/ul[1]/li[2]/a")
WebElement act_Whyorange;
public WebElement Whyorange() {
	return act_Whyorange;
	
}
@FindBy(xpath="//*[@id=\"header-navbar\"]/ul[1]/li[2]/div/div/div[2]/div/div[1]/p[4]/a")
WebElement click_itmanager;
public WebElement itmanager() {
	return click_itmanager;
	
}

}
