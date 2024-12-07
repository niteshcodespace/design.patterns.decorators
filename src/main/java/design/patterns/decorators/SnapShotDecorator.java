package design.patterns.decorators;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

public class SnapShotDecorator implements WebElementActions {
	// create class and implements the interface

	private static final Logger logger = Logger.getLogger(SnapShotDecorator.class.getName());
	private WebElementActions actions;
	private int i=1;
// create the variable of already impletmented class 

	public SnapShotDecorator(WebElementActions actions) {
		this.actions = actions;
	}

	@Override
	public void click(WebElement ele) {
		logger.info("About to click");
		actions.click(ele);
		takeSnap(ele);
		logger.info("Click is done");
	}

	@Override
	public void sendKeys(WebElement ele, CharSequence text) {
		logger.info("About to type");
		actions.sendKeys(ele, text);
		takeSnap(ele);
		logger.info("Snap for sendkey is done");
	}

	private void takeSnap(WebElement ele) {
		File screenshotAs = ele.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotAs, new File(i+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

}
