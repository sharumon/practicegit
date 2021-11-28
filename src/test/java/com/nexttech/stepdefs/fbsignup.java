package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttech.pageobjectmodel.fbsignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbsignup {
	WebDriver driver;
	
	@Given("^user visit facebook url$")
	public void user_visit_facebook_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Download\\chromedriver 2_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    // soft wait
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
       // how to open the url
	    driver.get("https://www.facebook.com/");
	 // how to maximize the browser
	    driver.manage().window().maximize();
	}

	@When("^user clik on Create new account$")
	public void user_clik_on_Create_new_account() throws Throwable {
		fbsignupPOM act=new fbsignupPOM(driver);
			act.creatnewaccount().click();
				
	}

	@When("^user put \"([^\"]*)\" and \"([^\"]*)\" also\"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_put_and_also_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		fbsignupPOM app=new fbsignupPOM(driver);
		app.firstname().sendKeys(arg1);
		app.firstname().sendKeys(arg2);
		app.mobilenumber().sendKeys(arg3);
		app.password().sendKeys(arg4);
		
		
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		fbsignupPOM se1=new fbsignupPOM(driver);
		Select dry=new Select(se1.click_month);
		//dry.selectByIndex(02);
		dry.selectByValue("03");
		
		Select dry1=new Select(se1.clcik_day);
		dry1.selectByValue("20");
		Select dry2=new Select(se1.click_year);
	dry2.selectByVisibleText("1993");
	}

	@Then("^user click male as gender$")
	public void user_click_male_as_gender()throws Throwable{
		fbsignupPOM yes=new fbsignupPOM(driver);
		yes.click_gender.click();
	}

	@Then("^user will be able to sign up successfully$")
	public void user_will_be_able_to_sign_up_successfully() throws Throwable {
		fbsignupPOM no=new fbsignupPOM(driver);
		no.click_signup.click();
	}


	
	
	
}
