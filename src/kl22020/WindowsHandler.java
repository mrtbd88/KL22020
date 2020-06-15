package kl22020;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler {

	
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahfuj Tuhin\\eclipse-workspace\\BatchMarch2020\\jars\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%2F%3Fclient%3Dsafari%26channel%3Diphone_bm&hl=en&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
			
	 
	        driver.manage().window().maximize();
	 	
		
			driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[3]/a")).click();
				
			System.out.println(driver.getTitle());
			
			Set<String> wh = driver.getWindowHandles();
			Iterator<String> it = wh.iterator();
			
			String Main=it.next();
		    String Terms=it.next();
					String Privecy=it.next();
			String Helps=it.next();
			
			driver.switchTo().window(Terms);
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(Privecy);
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(Helps);
			System.out.println(driver.getTitle());
			
			Thread.sleep(4000);

	}

}
