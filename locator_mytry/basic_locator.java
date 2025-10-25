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
        //<----------------------------------------------------->
        //---> find the value with css selector 
        //--> the are three types id , name ,class 
        
        //-----> find the element with id in css selector 
        
        //---> location by-id 
        driver.findElement(By.cssSelector("[id='newsletter-subscribe-button']")).click();
        
        //----->find the web element with class in css selector 
        
        driver.findElement(By.cssSelector("[class='button-1 search-box-button']")).click();
        
        //---> find the element with name in css selector 
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("phone");
		
		//<-------------------------------------------------------------------------->
		//----> finding the element with xpath href with indexing 
		driver.findElement(By.xpath("(//a[@href='/books'])[3]")).click();
		
	   //-----> finding the element with traves in the element one by one 
       driver.findElement(By.xpath("(//a[@href='/books'])[3]/../../..//a[@href='/jewelry']")).click();
       
       //<--------------------------------------------------------------------------->
		
       //find element with link text method
       driver.findElement(By.linkText("Black & White Diamond Heart")).click();
       
	
       //<-------------------------------------------------------------------------->
	
       //---------> login script for web demo shop with By.xpath 
       
       driver.findElement(By.linkText("Log in")).click();
       
       //----------> sending the data to email id filled by using by.xpath
       
       driver.findElement(By.xpath("//input[@class='email']")).sendKeys("007sam12345@gmail.com");
       
       //----------> sending data with class selector 
     driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("123456789"); 
          	   
       //------> click the web element with class name method 
       
       driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
       
       //<-------------------------------------------------------------------------------------->
       
       
       
       
       
	}
	

}
