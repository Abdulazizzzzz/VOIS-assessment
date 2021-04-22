package Automation.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checkout {

ChromeDriver driver;
	
	

	
	@BeforeTest
	
	public void openurl() {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Seleniumdrivers\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		
                  }
	


       @Test

       public void checkoutpage() {
    	   
    	   
    	 //Click on Sign in
    	   driver.findElement(By.linkText("Sign in")).click();
    	   //Login
    	   driver.findElement(By.id("email")).sendKeys("Task@vois.com");
    	   driver.findElement(By.id("passwd")).sendKeys("Vois@123");
    	   driver.findElement(By.id("SubmitLogin")).click();
    	   
    	 //Click on Women
    	   driver.findElement(By.linkText("DRESSES")).click();

    	   WebElement dressimage=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
    	   WebElement more_button=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[2]/span"));
    	   Actions actions=new Actions(driver);
    	   actions.moveToElement(dressimage).moveToElement(more_button).click().perform();

    	   //Change quantity by 3
    	   driver.findElement(By.id("quantity_wanted")).clear();
    	   driver.findElement(By.id("quantity_wanted")).sendKeys("3");

    	   //Select size as S
    	   WebElement dropdlist=driver.findElement(By.xpath("//*[@id='group_1']"));
    	   Select oSelect=new Select(dropdlist);
    	   oSelect.selectByVisibleText("S");

    	   //Select Color
    	   driver.findElement(By.id("color_14")).click();

    	   //Click on add to cart
    	   driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();

    	   //Click on proceed
    	   driver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")).click();
    	   //Checkout page Proceed
    	   driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
    	   driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
    	   //Agree terms&Conditions
    	   driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
    	   driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();

    	   //Click on Payby Check
    	   driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
    	   //Confirm the order
    	   driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();

    	  
       }

     
      
       

       @AfterTest

       public void close() {
	
	//driver.quit();
       }
}
