package loginflow;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		
		WebElement ele =driver.findElement(By.xpath("(//div[@class=\"avatar mx-auto white\"] )[1]"));
		ele.click();
		
		//TEXT_BOX
		WebElement Textbox = driver.findElement(By.xpath("//div[@class='element-list collapse show']//ul[@class='menu-list']//li[@id='item-0']"));
		Textbox.click();
		
		WebElement Username =driver.findElement(By.xpath("//input[@id='userName']"));
		Username.click();
		Username.sendKeys("Vikash Kumar");
		
		WebElement eid =driver.findElement(By.xpath("//input[@id='userEmail']"));
		eid.clear();
		eid.sendKeys("Vk123@gmail.com");
		
		WebElement CrAdress =driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		CrAdress.click();
		CrAdress.sendKeys("T2, G-02, La Resentia");
		
		
		js.executeScript("window.scrollBy(0,250)","");
		
		
		driver.findElement(By.xpath("//button[text()= 'Submit']")).click();
		
		WebElement AfterSubmitText=driver.findElement(By.xpath("//div[@class='mt-4 row']"));

		System.out.println(AfterSubmitText.getText());
		
		
		//CHECK_BOX
		
		WebElement CheckBox=driver.findElement(By.xpath("//span[text()='Check Box']"));
		CheckBox.click();
		
		WebElement HomeCB =driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		HomeCB.click();
		System.out.println("abc");
		
		Thread.sleep(3000);
		
		
		WebElement Radioresult=driver.findElement(By.xpath("//div[@class='display-result mt-4']"));
		System.out.println(Radioresult.getText());
		 
		
		//RADIO_BUTTON
		
		WebElement RadioButtonTab = driver.findElement(By.xpath("//span[text()='Radio Button']"));
		RadioButtonTab.click();
		System.out.println("def");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		System.out.println("wer");
		
		//WEB TABLES
		
		WebElement WebTablesTab = driver.findElement(By.xpath("//span[text()='Web Tables']"));
		WebTablesTab.click();
		
		WebElement FirstGrid=driver.findElement(By.xpath("(//div[@class='rt-tbody']//div[@class='rt-tr-group'])[1]"));

		System.out.println(FirstGrid.getText());
		
		js.executeScript("window.scrollBy(0,480)","");
		
		//BUTTONS
		
//		WebElement ButtonsTab = driver.findElement(By.xpath("//span[text()='Buttons']"));
//		ButtonsTab.click();
//		
//		
//		Actions act = new Actions(driver); //Double Click
//		
//		WebElement DoubleClkBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
//		System.out.println(DoubleClkBtn.getText());
//		act.doubleClick(DoubleClkBtn).perform();
//		
//		System.out.println("upto this");
//		
//		WebElement DoubleClkMsg = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
//		System.out.println(DoubleClkMsg.getText());
//		System.out.println("abvmfjg");
		
		
//		Actions action = new Actions(driver);
//		WebElement RtClk = driver.findElement(By.xpath("(//div[@class='mt-4'])[1]//button[@id='rightClickBtn']"));
//		action.contextClick(RtClk).perform();
		
		// Forms > Practice Form
		
		WebElement FormTab=driver.findElement(By.xpath("(//div[@class='header-wrapper'])[2]"));
		FormTab.click();
		
		Thread.sleep(3000);
		
		WebElement PctForm=driver.findElement(By.xpath("//span[text()='Practice Form']"));
		PctForm.click();
		
//		String ActualTitle = driver.findElement(By.xpath("//h1[text()='Practice Form']")).getText();
//		String ExpectedTitle= "Practice Form";
		//Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vikash");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Srivastava");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("vk123@gmail.com");
		
		driver.findElement(By.xpath("((//div[@class='col-md-9 col-sm-12'])[2]//div[@class='custom-control custom-radio custom-control-inline'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("7903952292");
		
		//WebElement DOB = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		//DOB.clear();     //(to be Discussed about DOB picker in JAVA Selenium)
		
		
		
//		String formatDate = "yyyy-MM-dd";
//		DateFormat dateFormat = new SimpleDateFormat(formatDate);
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(new Date());
//		cal.add(Calendar.DATE, 1);
//		String newDate = dateFormat.format(cal.getTime());
		
		
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)","");
		System.out.println("aaaa");
		
//		WebDriverWait wait2 = new WebDriverWait(driver, 10);
//		wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("xpath_of_element_to_be_invisible")));
//		driver.findElement(By.xpath("xpath_element_to_be_clicked")).click();
		
		Thread.sleep(3000);
		
//		WebElement Subject = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
//		Subject.click();
//		Subject.sendKeys("Science");
//		System.out.println("bab");
		
		WebElement Hobbies =driver.findElement(By.xpath("((//div[@class='col-md-9 col-sm-12'])[6]//label[@class='custom-control-label'])[1]"));
		Hobbies.click();
		
		
		//Choose File:
//		WebElement fileInput = driver.findElement(By.id("uploadPicture"));
//		System.out.println("bbbaaa");
//		fileInput.sendKeys("C:\\Users\\vikash.kumar\\Pictures\\Screenshots.png");
//		WebElement submitButton = driver.findElement(By.id("submit-button"));
//	        submitButton.click();
		
		js.executeScript("window.scrollBy(0,450)","");
		
		//Drop down invisible Element
		
		WebElement State = driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));
		State.click();
		System.out.println("///");
		
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Uttar Pradesh']"));
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("arguments[0].click();", element);
		
		System.out.println("xxxx");
		
		driver.findElement(By.xpath("//button[@id='submit']")).click(); // Submit Button
		
		
		WebElement message = driver.findElement(By.xpath("//div[@id='example-modal-sizes-title-lg']"));
		System.out.println(message.getText());
		
		//WebElement closebtn=driver.findElement(By.xpath("//div[@class='modal-content']//div[@class='modal-footer']/button"));
		WebElement closebtn=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(closebtn).click();
		
		System.out.println("dgbfkjdgkjsf");
		//driver.quit();
		
		
		
	}

}
