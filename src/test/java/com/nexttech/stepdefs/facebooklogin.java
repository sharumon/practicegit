package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.facebookloginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebooklogin {
	WebDriver driver;
	
	@Given("^user visit facbook home$")
	public void user_visit_facbook_home() throws Throwable {
	    // to open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Download\\chromedriver 2_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //to open the url
	    driver.get("https://www.facebook.com/login/");
	    
	}

	@When("^user enter email\"([^\"]*)\"$")
	public void user_enter_email(String arg1) throws Throwable {
		facebookloginPOM first=new facebookloginPOM(driver);
		first.email().sendKeys(arg1);
	}

	@When("^user put \"([^\"]*)\"$")
	public void user_put(String arg1) throws Throwable {
		facebookloginPOM nd=new facebookloginPOM(driver);
		nd.password().sendKeys(arg1);
		
	}

	@Then("^user should be able to login facebook$")
	public void user_should_be_able_to_login_facebook() throws Throwable {
		facebookloginPOM third=new facebookloginPOM(driver);
		third.login().click();
	}



}
