package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Login {

	public static void main(String[] args) {
		
		//Interacting with Browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				//Maximizing the window
				driver.manage().window().maximize();
				//Launching facebook
				driver.get("https://www.facebook.com/");
				//Login to FB
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavithrathirukonda@gmail.com");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Hihello@123");
				driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
