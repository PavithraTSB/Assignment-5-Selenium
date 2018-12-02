package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		//Interacting with Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Maximizing the window
		driver.manage().window().maximize();
		//Launching facebook
		driver.get("https://www.facebook.com/");
		//sending keys to all the fields
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Divya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Veni");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("pavithrathirukonda@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("pavithrathirukonda@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Hihello@123");
		
		//filling Dropdowns
		WebElement days = driver.findElement(By.xpath("//*[@id='day']"));
		Select day=new Select(days);
		day.selectByVisibleText("27");
		
		WebElement months = driver.findElement(By.xpath("//*[@id='month']"));
		Select month=new Select(months);
		month.selectByVisibleText("Mar");
		
		WebElement years = driver.findElement(By.xpath("//*[@id='year']"));
		Select year=new Select(years);
		year.selectByVisibleText("1992");
		
		//Clicking the radio button
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		
		//Clicking the signup button
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	
				
	}

}
