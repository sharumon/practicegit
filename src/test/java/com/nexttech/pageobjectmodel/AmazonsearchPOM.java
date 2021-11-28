package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {
	WebDriver drive;

	public AmazonsearchPOM(WebDriver drive) {
		this.drive=drive;
		PageFactory.initElements(drive, this);

	}

	//@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	@FindBy(id="twotabsearchtextbox")
	WebElement editL_searchbox;
	public WebElement search() {
		return editL_searchbox;

	}


	@FindBy(id="nav-search-submit-button")
	WebElement click_searchbutton;
	public WebElement searbutton() {
		return click_searchbutton;

	}













}
