package Automation.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class createaccount {
ChromeDriver driver;
	
	

	
	@BeforeTest
	
	public void openurl() {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Seleniumdrivers\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		
	}
	
	public void Registeration() {
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("Task00@vois.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		///////////////////////////////////////
		  driver.findElement(By.id("id_gender1")).click();
		  driver.findElement(By.name("customer_firstname")).sendKeys("Vois");
		  driver.findElement(By.name("customer_lastname")).sendKeys("assessemnt");
		  driver.findElement(By.id("passwd")).sendKeys("Vois@123");
		  
		///////////////////////////////////////
		  driver.findElement(By.id("firstname")).sendKeys("Vois");
		  driver.findElement(By.id("lastname")).sendKeys("assessemnt");
		  driver.findElement(By.id("company")).sendKeys("vodafone intelligent solutions");
		  driver.findElement(By.id("address1")).sendKeys("Sixth Horizon Centre");
		  driver.findElement(By.id("city")).sendKeys("cairo");
		  
		  //////////////////////////////////////
		  WebElement statedropdown=driver.findElement(By.name("id_state"));
		  Select oSelect=new Select(statedropdown);
		  oSelect.selectByValue("5");

		  driver.findElement(By.name("postcode")).sendKeys("12345");
		  
		  ////////////////////////////////////
		  WebElement countrydropDown=driver.findElement(By.name("id_country"));
		  Select oSelectC=new Select(countrydropDown);
		  oSelectC.selectByVisibleText("United States");
		  
		  ////////////////////////////////////////////////
		  driver.findElement(By.id("phone")).sendKeys("0222460519");
		  driver.findElement(By.id("phone_mobile")).sendKeys("01154666263");
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("home");
		  driver.findElement(By.name("submitAccount")).click();


		
		
	}

    
	
	@AfterTest
	
	public void close() {
		
		//driver.quit();
	}


	


}
