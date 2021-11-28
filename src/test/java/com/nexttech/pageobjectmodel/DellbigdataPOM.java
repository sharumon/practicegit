package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellbigdataPOM {
WebDriver driver;
public DellbigdataPOM(WebDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a")
WebElement click_Solutions;
public WebElement Solutions() {
	return click_Solutions;
	
}
@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[6]/a")
WebElement click_BigData;
public WebElement BigData() {
	return click_BigData;
	
}
}
