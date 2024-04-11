//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginDemo {
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
//	@When("User Enters username and password")
//	public void user_is_on_google_search_page() {
//		 System.out.println("2");
//		 driver.findElement(By.id("username")).sendKeys("student");
//		 driver.findElement(By.id("password")).sendKeys("Password123 ");
//		 
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
//}
