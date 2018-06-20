package sel_enium;
import org.openqa.selenium.*;


import java.util.*;

//import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class One extends Thread {
	
	
	public void run()
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

 	   
 	     String baseUrl = "http://demo.guru99.com/test/login.html";
          
 	     driver.get(baseUrl);
          WebElement email = driver.findElement(By.id("email"));
          WebElement pswd= driver.findElement(By.name("passwd"));
          WebElement login=driver.findElement(By.id("SubmitLogin"));
          email.sendKeys("hellow@selenium.com	");
          pswd.sendKeys("jdasklf");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          login.click();
         
          try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
          try {
  			Thread.sleep(1000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
          driver.get("http://demo.guru99.com/test/radio.html");
          try {
  			Thread.sleep(1000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
          
  		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
  		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
  		WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
  		radio1.click();
  		try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		radio2.click();
  		try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		radio3.click();
  		try {
  			Thread.sleep(5000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
          
		  
          
          System.out.println("Success");
	            
	      driver.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.firefox.marionette","D:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		One th=new One();
		th.start();
	       
		}

	
}
