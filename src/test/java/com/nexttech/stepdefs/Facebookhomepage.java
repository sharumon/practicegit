package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Facebookhomepage {
	
	WebDriver driver;

	
	
	
	@Given("^user visits facebook home page$")
	
	public void user_visits_facebook_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   ////how to open browser
		  
	    System.setProperty("webdriver.chrome.driver","C:\\Download\\chromedriver 2_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    //how to open url
	     
	        driver.get("https://facebook.com");

	}

	@Then("^user should see fb news feed$")
	public void user_should_see_fb_news_feed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
