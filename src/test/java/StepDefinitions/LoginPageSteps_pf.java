//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import PageFactory.HomePage_PF;
//import PageFactory.LoginPage_PF;
//import io.cucumber.java.en.*;
//
//public class LoginPageSteps_pf {
//	
//	WebDriver driver = null;
//	LoginPage_PF login;
//	HomePage_PF home;
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
//		
//		
//		login.enter_username(username);
//		login.enter_password(password);
//	
//	}
//
//	@And("click on login button")
//	public void user_enter_something_on_searchfiled() {
//
//    login.click_loginbtn();
//	}
//
//	@Then("User redirected to the home page")
//	public void user_click_on_search_button() {
//		home.displayed_logout_btn();
//	}
//
//
//
//
//}
