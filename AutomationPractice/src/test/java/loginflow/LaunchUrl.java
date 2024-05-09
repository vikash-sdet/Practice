package loginflow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchUrl {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@class='Pke_EE']")).click();
		
		WebElement searchbar=driver.findElement(By.xpath("//div[@class='_2SmNnR']//input"));
		searchbar.click();
		
		searchbar.sendKeys("Nike Shoes" +Keys.ENTER);
		
		WebElement selectshoe=driver.findElement(By.xpath("(//div[@class='_13oc-S']//img)[1]"));
		selectshoe.click();
		
		// switch to new browswe tab
		
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        //assertTrue(driver.findElement(By.id("fruits-vegetables")).isDisplayed());
		
		
		WebElement selectshoesize =driver.findElement(By.xpath("((//ul[@class='_1q8vHb'])[2]//li[@id])[5]"));
		selectshoesize.click();
		
		//Add to card button.
		driver.findElement(By.xpath("(//li[@class='col col-6-12'])[1]")).click();
		
		

	}

}
