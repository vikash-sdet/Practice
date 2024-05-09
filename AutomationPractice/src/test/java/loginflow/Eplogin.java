package loginflow;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Eplogin {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://epnew.maxhealthcare.in/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Login
		
		WebElement username =driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		username.click();
		username.sendKeys("Test 1");
		
		WebElement password =driver.findElement(By.xpath("//input[@id=\"mat-input-1\"]"));
		password.click();
		password.sendKeys("1");
		
		
		WebElement location=driver.findElement(By.xpath("(//span[@class=\"mat-mdc-button-touch-target\"]) [1]"));
		location.click();
		
		WebElement Loginbutton=driver.findElement(By.xpath("//*[text()=' Login ']"));
		Loginbutton.click();
		
		//Assertation after Login
		
		//String actualString = driver.findElement(By.xpath("//div[@class='prescription-count ng-tns-c60-5']//h3[text()='WELCOME TO MAX']")).getText();
		//System.out.println(actualString);
		//String actualString = driver.findElement(By.xpath("//div[@class=\"welcome-title ng-tns-c60-5\"]//h3[@class=\"ng-tns-c60-5\"]")).getText();
		

		//String expectedString = "WELCOME TO MAX";

		//assertTrue(actualString.contains(expectedString));
		
		//System.out.println("yes");
		
		//Dashboard--In continuation with the above, verify that clicking on any patient's row redirects user to EP tab.
		
		//List<WebElement> allpatients=driver.findElements(By.xpath("(//tbody[@class=\"mdc-data-table__content\"]//tr[@class=\"mat-mdc-row mdc-data-table__row cdk-row example-element-row custom-row ng-tns-c60-5 ng-star-inserted\"]) [1]"));
		//allpatients.get(0).click();
		
		//WebElement First=driver.findElement(By.xpath("(//td[text()=' Checked-In '])[1]"));
		
		
		//WebElement Firstpatient=driver.findElement(By.xpath("(//tbody[@class=\"mdc-data-table__content\"]//tr) [1]"));
		//Firstpatient.click();
		
		//driver.findElement(By.xpath("//*[text()=' Cash ']"));
		
		//driver.findElement(By.xpath("(//li[@class=\"ng-star-inserted\"]) [1]")).click();
		
		
		//System.out.println("Ok");
		
     System.out.println("yes");
     
     //Thread.sleep(2000);
     
     WebElement Eptab=driver.findElement(By.xpath("//nav[@class='nav-menu item']//a[contains(text(),'E-prescription')]"));
     Eptab.click();
     
     //Thread.sleep(2000);
     
     WebElement Firstpatient = driver.findElement(By.xpath("((//div[@class='patient-list'])[1]//div[@class='left-item'])[1]"));
     Firstpatient.click();
     
     //Thread.sleep(2000);
     
     
     WebElement Vitalsheader = driver.findElement(By.xpath("//mat-expansion-panel[@id='vitalPanel']"));
     Vitalsheader.click();
     
     
     WebElement Weight = driver.findElement(By.xpath("//input[@id='weightInpVital']"));
     Weight.click();
     Weight.sendKeys("79");
     
     System.out.println("yesss");
     
     WebElement Height = driver.findElement(By.xpath("//input[@id='heightInpVital']"));
     Height.click();
     Height.sendKeys("150");
     
     WebElement Temprature = driver.findElement(By.xpath("//input[@id='heightInpVital']"));
     Height.click();
     Height.sendKeys("150");
     
     
     
     
     
	}
    
	// this is used for the Assertation
	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

}
