package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jcpenney {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Maximizing the window
		driver.manage().window().maximize();
		//navigate to the url
		driver.navigate().to("https://www.jcpenney.com/");
		
		//Searching for the shirts and adding 1st item to the cart
        driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();

        driver.findElement(By.id("searchTerm")).sendKeys("Shirts");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn_searchForm']")).click();
        
        driver.findElement(By.xpath("//img[@class='productDisplay_image--default']")).click();
        WebElement shirtSize = driver.findElement(By.id("SIZE"));
        Select size=new Select(shirtSize);
        size.selectByVisibleText("15 / 32-33");
        
        driver.findElement(By.xpath("//img[@alt='Oxford Blue']")).click();
        driver.findElement(By.xpath("//button[@name='add to bag']")).click();
        
        //switching to the frame
        WebElement frame = driver.findElement(By.xpath("//*[@id='modalIframe']"));
         driver.switchTo().frame(frame);
         driver.findElement(By.xpath("//input[@id='btncheckout']")).click();
         //Switching back to the parent frame
         driver.switchTo().parentFrame();
         driver.findElement(By.xpath("//input[@id='Checkout']")).click();
	}

}
