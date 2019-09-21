package create2;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Createuser2 {
	

		WebDriver driver;
		@Given("Chrome is opened & Login Page is dispalyed")
		public void chrome_is_opened_Login_Page_is_dispalyed() {
			System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.get("http://127.0.0.1:8080/htmldb");
		   
		}


@When("user enters login details")
		public void user_enters_username_Password() {
			 driver.findElement(By.id("P11_USERNAME")).sendKeys("sys");
			  driver.findElement(By.id("P11_PASSWORD")).sendKeys("newuser123");
		  
		}

		@When("Click on Login")
		public void click_on_Login() {
			 driver.findElement(By.cssSelector("input[value='Login")).click();
		}

		@When("Click on Administration")
		public void click_on_Administration() {
		 driver.findElement(By.linkText("Administration")).click();
		}

		@When("Click on Database Users")
		public void click_on_Database_Users() {
		  driver.findElement(By.linkText("Database Users")).click();
		}

		@When("Click on Create")
		public void click_on_Create() {
		  driver.findElement(By.xpath("//*[@id=\"R162627621263759065\"]/tbody/tr/td[2]/input")).click();
		  
		}

		
		@When("Enter New Username & new Password & Confirm Password")
		public void enter_New_Username_new_Password_Confirm_Password(io.cucumber.datatable.DataTable dataTable) {
			List<Map<String, String>> data= dataTable.asMaps();
			
			 driver.findElement(By.name("p_t01")).sendKeys(data.get(0).get("UserName"));
			  driver.findElement(By.name("p_t02")).sendKeys(data.get(0).get("Pass"));
			  driver.findElement(By.name("p_t03")).sendKeys(data.get(0).get("cPass"));
		    throw new cucumber.api.PendingException();
		}
		@When("Clicked on create button")
		public void clicked_on_create_button() {
		   driver.findElement(By.xpath("//*[@id=\"R162638405127839537\"]/thead/tr/th[2]/input[2]")).click();
		}

		@Then("Message Should be displayed that new user is created")
		public void message_Should_be_displayed_that_new_user_is_created() {
			System.out.println("NEW User Account is Created");
			
			/*try
			{
				assertEquals("User Creation Failed", "User Created.", "User Craeted.");
			}
			catch(ComparisonFailure cf)
			{
				
			}*/
		}

	}


