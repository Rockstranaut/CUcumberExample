package com.lti.stpd;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepsForLogin {
	WebDriver driver;
	@Given("Chrome is opened & Login Page is dispalyed")
	public void chrome_is_opened_Login_Page_is_dispalyed() {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
 		 driver= new ChromeDriver();
 		 driver.get("http://127.0.0.1:8080/htmldb");
	    
	}

	@When("user enters username & Password")
	public void user_enters_username_Password() {
		 driver.findElement(By.id("P11_USERNAME")).sendKeys("hr");
		  driver.findElement(By.id("P11_PASSWORD")).sendKeys("hr");
	    
	}

	@When("Click on Login")
	public void click_on_Login() {
		 driver.findElement(By.cssSelector("input[value='Login")).click();
	  
	}

	@Then("HomePage Should be displayed")
	public void homepage_Should_be_displayed() {
	assertEquals("Login Failed", "Oracle", driver.getTitle());
	}


}
