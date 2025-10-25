package locator_mytry;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_locator {
	public static void main(String[]args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        
        //------> finding locater by id 
        
        // navagate by id to find the file location 
        By id = By.id("small-searchterms");
        
        
        //store the web element in the value
        WebElement email1 = driver.findElement(id);
        
        //sending data to that filed 
        email1.sendKeys("helo la amgo");
        
        //------>
        
        By id2 = By.id("newsletter-email");
        WebElement num2 = driver.findElement(id2);
        num2.sendKeys("sal sal");
        
        Thread.sleep(2000);
        
        //---> find the value with css selector 
        //--> the are three types id , name ,class 
        
        //-----> find the element with id in css selector 
        
        //---> location by-id 
        driver.findElement(By.cssSelector("[id='newsletter-subscribe-button']")).click();
        
        //----->find the web element with class in css selector 
        
        driver.findElement(By.cssSelector("[class='button-1 search-box-button']")).click();
        
        //--->
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("phone");
		
		
	}

}
