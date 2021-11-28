package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.bestsellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class bestseller {
	WebDriver driver;

	
	@Given("^user visits Amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable {
	////how to open browser
		  
	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    //how to open url
	     
	        driver.get("https://amazon.com");

	    
	}

	@When("^user click on Best Seller$")
	public void user_click_on_Best_Seller() throws Throwable {
		bestsellerPOM obj =new bestsellerPOM(driver);
		obj.bestseller().click();
	    
	}

	@Then("^user should be able to redirect to the best seller page$")
	public void user_should_be_able_to_redirect_to_the_best_seller_page() throws Throwable {
	    
	}

}
