package kl22020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFunction {
	
	WebDriver driver;
	

	public void main(String[] args) {
		driver=new ChromeDriver();
		driver.getCurrentUrl();
		
	}

}
