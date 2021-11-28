package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.OrangeITPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeIT {
	WebDriver drvier;
	
	@Given("^user visit orange home page$")
	public void user_visit_orange_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Download\\chromedriver 2_win32\\chromedriver.exe");
		drvier = new ChromeDriver();
	    //to open the url
	    
		drvier.get("https://www.orangehrm.com/");
	}

	@When("^user go to  OrangeHRM dropdown menu then  able to see IT manger and click there$")
	public void user_go_to_OrangeHRM_dropdown_menu_then_able_to_see_IT_manger_and_click_there() throws Throwable {
	   Actions act=new Actions(drvier);
	   OrangeITPOM obj=new OrangeITPOM(drvier);
	   act.moveToElement(obj.Whyorange()).build().perform();
      obj.itmanager().click();
	   
	   
	}

	@Then("^user will redirect to it manager page$")
	public void user_will_redirect_to_it_manager_page() throws Throwable {
	    
	}
	


}
