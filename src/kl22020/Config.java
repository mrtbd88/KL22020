package kl22020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Config extends WebDriverFunction {
	
	public String url       = "https://www.facebook.com";
	public String fnameLoc  ="//*[@id=\'u_0_m\']";
	public String lnameLoc  ="//*[@id=\'u_0_o\']";
	public String emailLoc  ="//*[@id=\'u_0_r\']";
	public String passLoc  ="//*[@id=\'u_0_w\']";
	public String fnameVal 	= "Mahfuj";
	public String lnameVal 	= "Tuhin";
	public String emailVal 	= "mrtbd88@gmail.com";
	public String passVal 	= "password";
	public String idinLoc     ="//*[@id=\'email\']";
	public String passinLoc   ="//*[@id=\'pass\']";
	

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahfuj Tuhin\\eclipse-workspace\\KL22020\\drivers\\chromedriver.exe");
		
		    driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.get(url);
			System.out.println("Chrome driver open");
			
	}
	@Test
	public void signupFBTest() throws Exception {
		System.out.println("Facebook signup test");
		driver.findElement(By.xpath(fnameLoc)).sendKeys(fnameVal);
		driver.findElement(By.xpath(lnameLoc)).sendKeys(lnameVal);
		driver.findElement(By.xpath(emailLoc)).sendKeys(emailVal);
		driver.findElement(By.xpath(passLoc)).sendKeys(passVal);
		
		Thread.sleep(3000);
		WebElement web=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		WebElement webd=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		WebElement weby=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		
		Select sel=new Select(web);
		Select seld=new Select(webd);
	    Select sely=new Select(weby);

		sel.selectByVisibleText("Dec");
		seld.selectByIndex(16);
		sely.selectByValue("1971");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();//click male button
		driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();//click SIGNUP button

		
	}
	@Test
	public void signinFBTest() {
		System.out.println("Facebook signin test");
		driver.findElement(By.xpath(idinLoc)).sendKeys(emailVal);
		driver.findElement(By.xpath(passinLoc)).sendKeys(passVal);
		
	}
	
	@AfterTest
	public void closeBrowser(){
		System.out.println (" browser is about to close +++++++");
		driver.close();
		System.out.println (" browser is closed +++++++ ");
	


	}

}
