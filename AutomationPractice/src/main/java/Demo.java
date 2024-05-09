
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Demo {
	public static void main(String[] args) {
		//WebDriverManager.chromiumdriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikash.kumar\\Desktop\\chromedriver-win64");
		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://maxhis-uat.maxhealthcare.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();

	}

}
