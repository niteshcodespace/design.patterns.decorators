package design.patterns.decorators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDecorators {

	public static void main(String[] args) {
		ElementActions actions = new ElementActions();
		LoggingDecortorElements logging = new LoggingDecortorElements(actions);
		SnapShotDecorator snap = new SnapShotDecorator(logging);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		WebElement username = driver.findElement(By.id("username"));
		//logging.sendKeys(username, "demosalesmanager");
		snap.sendKeys(username, "demosalesmanager");
		

	}

}
