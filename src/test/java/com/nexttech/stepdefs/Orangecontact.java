package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttech.pageobjectmodel.OrangecontactPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orangecontact {
	WebDriver driver;
	@Given("^user land on orangehrm page$")
	public void user_land_on_orangehrm_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Download\\chromedriver 2_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    // soft wait
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	// how to maximize the browser
	    driver.manage().window().maximize();
       // how to open the url
	    driver.get("https://www.orangehrm.com/");
	 
		
	}

	@When("^user click on contact sales$")
	public void user_click_on_contact_sales() throws Throwable {
		OrangecontactPOM dot=new OrangecontactPOM(driver);
		dot.contactsales().click();
		Thread.sleep(3000);
		
	}

	@When("^user enter name\"([^\"]*)\" last name\"([^\"]*)\" and\"([^\"]*)\"$")
	public void user_enter_name_last_name_and(String arg1, String arg2, String arg3) throws Throwable {
		OrangecontactPOM dot1=new OrangecontactPOM(driver);
		dot1.firstname().sendKeys(arg1);
		dot1.lastname().sendKeys(arg2);
		dot1.companyname().sendKeys(arg3);
	
	}

	@When("^user select dropdown No of Employees$")
	public void user_select_dropdown_No_of_Employees() throws Throwable {
		OrangecontactPOM dot2=new OrangecontactPOM(driver);
		Select dry=new Select(dot2.click_NoOfEmployees);
		dry.selectByIndex(5);
	}
	
      
	@When("^user enter job \"([^\"]*)\" phone number\"([^\"]*)\" email\"([^\"]*)\"$")
	public void user_enter_job_phone_number_email(String arg1, String arg2, String arg3) throws Throwable {
		OrangecontactPOM dot3=new OrangecontactPOM(driver);
		dot3.jobtitle().sendKeys(arg1);
		dot3.phonenumber().sendKeys(arg2);
		dot3.email().sendKeys(arg3);
	}

	@When("^user select dropdown for County$")
	public void user_select_dropdown_for_County() throws Throwable {
		OrangecontactPOM does=new OrangecontactPOM(driver);
		Select dal=new Select(does.click_county);
		dal.selectByVisibleText("United States");
		
	}

	@Then("^user write\"([^\"]*)\"$")
	public void user_write(String arg1) throws Throwable {
		OrangecontactPOM does1=new OrangecontactPOM(driver);
		does1.message().sendKeys(arg1);
	}
	
	@Then("^user click on i am not a robot$")
	public void user_click_on_i_am_not_a_robot() throws Throwable {
		OrangecontactPOM does3=new OrangecontactPOM(driver);
		does3.recaption().click();
	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		OrangecontactPOM does3=new OrangecontactPOM(driver);
		does3.submit().click();
	}

}
