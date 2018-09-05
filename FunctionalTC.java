package myTestCases;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FunctionalTC extends Thread
{
	public void run()
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String  baseUrl = "http://10.40.1.40/servicehub#";
	    	driver.get(baseUrl);
		driver.findElement(By.id("uId")).sendKeys("fws@altigen.com");
		driver.findElement(By.id("passwd")).sendKeys("22222");
		driver.findElement(By.id("login")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.xpath("//div[@class=\"dEOOab RxsGPe\" and contains(.,\"Couldn't\")]")).getText());
		driver.findElement(By.xpath("//div[@class='application_box']//div[@class='appUserGroupbox']//div[contains(text(),'Max Report Pro (Development)')]")).click();
		
		  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(1));
    //driver.close();
    //driver.switchTo().window(tabs2.get(0));
    try {
		Thread.sleep(35000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     driver.switchTo().frame("go");
    driver.findElement(By.xpath("//ul [@id=\"menu\" and contains(.,\"Agent Report\")]/li[3]/span/span")).click();
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.findElement(By.xpath("//ul [@id=\"menu\" and contains(.,\"Agent Report\")]/li[3]/div/ul/li[2]/span")).click();
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.findElement(By.xpath("//span[text()='1207 Account Code Report'] ")).click();
    
     System.out.println(driver.getTitle());
     System.out.println("Working Fine");
     
    //wg dropdown
		
	WebElement Wgdropdown = driver.findElement(By.xpath("//div [@id=\"divworkGroup\"]/span"));
	
	Wgdropdown.click();
	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//driver.findElement(By.xpath("//ul [@id=\"ddlWorkGroup_listbox\"]/li[2]")).click();//wG Selection

	System.out.println("CheckPoint 1");
	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.xpath("//div [@class=\"k-multiselect-wrap k-floatwrap\"]")).click(); //Agent dropdown
	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	driver.findElement(By.xpath("//ul [@id=\"ddlAgents_listbox\"]/li[2]")).click();//Dexter Young
	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.xpath("//span[@aria-owns=\"ddlTimePeriod1_listbox\"]")).click();//This dropdown
	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.xpath("//ul[@id=\"ddlTimePeriod1_listbox\"]/li[7]")).click();//last 6
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//span[@aria-owns=\"ddlTimePeriod2_listbox\"]/span/span")).click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//span[@aria-owns=\"ddlTimePeriod2_listbox\"]/span"));
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//ul[@id=\"ddlTimePeriod2_listbox\"] /li[3]")).click();  //months
	System.out.println("CheckPoint 2");
		
		
	driver.findElement(By.id("btnRunReport")).click();
	
	try {
		Thread.sleep(15000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.id("chartTypeColumnAndBar")).click();
	driver.findElement(By.id("lnkBasicBar")).click();
	driver.findElement(By.id("txtSingleColumnChartTitle")).sendKeys("Test");
	driver.findElement(By.id("btnAddSingleColumnChart")).click();
	WebElement title = driver.findElement(By.id("chartsDiv"));
	String abc=title.getText();
	System.out.println(abc);
	
	if(abc=="Test")
	{
		System.out.println("Test Case Pass ");		
		}
	else
	{
		System.out.println("Charts are not generating");
	}
	try {
		Thread.sleep(15000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.quit();
	
	
	}
	
	
	

	
	

	
    public static void main( String[] args )
    {
         
    	FunctionalTC th =new FunctionalTC();
    	th.run();
    }
}
