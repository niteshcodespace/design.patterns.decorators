package design.patterns.decorators;

import java.util.logging.Logger;
import org.openqa.selenium.WebElement;

public class LoggingDecortorElements implements WebElementActions {
	//create class and implements the interface

	private static final Logger logger = Logger.getLogger(LoggingDecortorElements.class.getName());
	private WebElementActions actions;
// create the variable of already impletmented class 
	
	public LoggingDecortorElements(WebElementActions actions) {
		this.actions = actions;
	}

	@Override
	public void click(WebElement ele) {
		logger.info("About to click");
		actions.click(ele);
		logger.info("Click is done");
	}

	@Override
	public void sendKeys(WebElement ele, CharSequence text) {
		logger.info("About to type");
		actions.sendKeys(ele, text);
		logger.info("Type is done");
	}

}
