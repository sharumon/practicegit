package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.DellbigdataPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellbigdata {
	WebDriver driver;

	@Given("^user visit Dell home page$")
	public void user_visit_Dell_home_page() throws Throwable {
		 // to open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Download\\chromedriver 2_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //to open the url
	    driver.get("https://www.dell.com/en-us");
	}

	@When("^user go to Solution drodown menu and click on Big Data$")
	public void user_go_to_Solution_drodown_menu_and_click_on_Big_Data() throws Throwable {
		Actions first=new Actions(driver);
		DellbigdataPOM obj=new DellbigdataPOM(driver);
		first.moveToElement(obj.Solutions()).build().perform();
		obj.BigData().click();
       //heard wait
		Thread.sleep(5000);
		
				
	}

	@Then("^user redirect to Big Data portfolio$")
	public void user_redirect_to_Big_Data_portfolio() throws Throwable {
	   
	}
}
