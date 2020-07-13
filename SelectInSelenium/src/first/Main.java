package first;

import java.nio.channels.Selector;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//Selenium//drivers//chrome83//chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.ynet.co.il");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    Select selector=new Select(driver.findElement(By.id("mainSearchSelectType")));
	    selector.selectByIndex(2);
	    selector.deselectByValue("pro");
	    List<WebElement>langs=driver.findElements(By.cssSelector("span.lang-name"));
	    langs.get(0).click();
	    
	    Thread.sleep(5000);
	    driver.close();
	    System.out.println("### Test End ###");
	}

}
