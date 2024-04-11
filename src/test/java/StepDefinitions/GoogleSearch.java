
package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.*;

public class GoogleSearch {



	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;
	@Given("User is on login page")
	public void user_enters_url() {
		 System.out.println("1");
		 System.setProperty("webdriver.chrome.driver", "C:/Priyanka/selenium/src/test/java/Driver/chromedriver.exe");
		// System.out.println("2");
	        // Initialize Chrome WebDriver
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  	  //  System.out.println("1");
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//	 System.out.println("1");
			driver.manage().window().maximize();
	    //    System.out.println("3");
	        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	    //    System.out.println("4");
		
		
	    System.out.println("1");
	}

	@When("^User Enters (.*) and (.*)$")
	public void user_is_on_google_search_page(String username, String password) throws InterruptedException {
		
		login = new LoginPage_PF(driver);
		login.enter_username(username);
		login.enter_password(password);
	
	}

	@And("click on login button")
	public void user_enter_something_on_searchfiled() {
    login = new LoginPage_PF(driver);
    login.click_loginbtn();
	}

	@Then("User redirected to the home page")
	public void user_click_on_search_button() throws InterruptedException {
		
		System.out.println("LAST STEP");
//		home = new HomePage_PF(driver);
//		home.displayed_logout_btn();
		Thread.sleep(6000);
		driver.close();
		driver.quit();
	}




}






























//---------------------------------------------------------------------------------------------------------------------------------------
//	
//	WebDriver driver = null;
//	@Given("User is on login page")
//	public void user_enters_url() {
//		 System.out.println("1");
//		 System.setProperty("webdriver.chrome.driver", "C:/Priyanka/selenium/src/test/java/Driver/chromedriver.exe");
//		// System.out.println("2");
//	        // Initialize Chrome WebDriver
//	        driver = new ChromeDriver();
//	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	  	  //  System.out.println("1");
//			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		//	 System.out.println("1");
//			driver.manage().window().maximize();
//	    //    System.out.println("3");
//	        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//	    //    System.out.println("4");
//		
//		
//	    System.out.println("1");
//	}
//
//	@When("^User Enters (.*) and (.*)$")
//	public void user_is_on_google_search_page(String username, String password) throws InterruptedException {
//		 System.out.println("2");
//		 driver.findElement(By.id("username")).sendKeys(username);
//		 Thread.sleep(6000);
//		 driver.findElement(By.id("password")).sendKeys(password);
//		 Thread.sleep(6000);
//	}
//
//	@And("click on login button")
//	public void user_enter_something_on_searchfiled() {
//		 System.out.println("3");
//		 driver.findElement(By.id("submit")).click();
//	}
//
//	@Then("User redirected to the home page")
//	public void user_click_on_search_button() {
//		 System.out.println("4");
//		// driver.findElement(By)
//		 driver.close();
//	}
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
////	//WebDriver driver = null;
////	@Given("user enters url")
////	public void user_enters_url() {
////		 System.out.println("1");
////		 System.setProperty("webdriver.chrome.driver", "C:/Priyanka/selenium/src/test/java/Driver/chromedriver.exe");
////		 System.out.println("2");
////	        // Initialize Chrome WebDriver
////	        WebDriver driver = new ChromeDriver();
////	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////	  	    System.out.println("1");
////			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
////			 System.out.println("1");
////			driver.manage().window().maximize();
////	        System.out.println("3");
////	        // Open a website
////	        driver.get("https://www.google.com");
////	        System.out.println("4");
////		
////		
////	    System.out.println("1");
////	}
////
////	@When("user is on google search page")
////	public void user_is_on_google_search_page() {
////		 System.out.println("2");
////	}
////
////	@And("user enter something on searchfiled")
////	public void user_enter_something_on_searchfiled() {
////		 System.out.println("3");
////	}
////
////	@Then("user click on search button")
////	public void user_click_on_search_button() {
////		 System.out.println("4");
////	}
////
////	@And("user redirected to the saerch page")
////	public void user_redirected_to_the_saerch_page() {
////		 System.out.println("5");
////	}
//
//
//}

//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import PageFactory.HomePage_PF;
//import PageFactory.LoginPage_PF;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
