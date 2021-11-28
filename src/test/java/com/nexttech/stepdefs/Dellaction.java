package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.DellactionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellaction {

	WebDriver driver;
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
		
		//how to open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Download\\chromedriver 2_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    // soft wait
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    // how to maximize the browser
	    driver.manage().window().maximize();
       // how to open the url
	    driver.get("https://www.dell.com");
	}

	@When("^user go to Solutions dropdown menu and able to see View All Solutions and click there$")
	public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions_and_click_there() throws Throwable {
	Actions dell=new Actions(driver);
	DellactionPOM obj=new DellactionPOM(driver);
	dell.moveToElement(obj.Solutions()).build().perform();
	obj.AllSolutions().click();
// heard wait
	Thread.sleep(5000);
	}

	@Then("^user redirects to solution portfolio$")
	public void user_redirects_to_solution_portfolio() throws Throwable {
	  // how to close window
		driver.close();
		driver.quit();
	}

}
