package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Amazonsearch {
	WebDriver driver;

	@Given("^user vist amazon home page$")
	public void user_vist_amazon_home_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Download\\chromedriver 2_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// to open the url
		// need to use get method
		driver.get("https://www.amazon.com/");
	}

	@Given("^user search by \"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
		AmazonsearchPOM mon=new AmazonsearchPOM(driver);
		mon.search().sendKeys(arg1);
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		AmazonsearchPOM mon=new AmazonsearchPOM(driver);
		mon.searbutton().click();
	}


}
