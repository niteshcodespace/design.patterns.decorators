package design.patterns.decorators;

import org.openqa.selenium.WebElement;

public class ElementActions implements WebElementActions {

	@Override
	public void click(WebElement ele) {
		// TODO Auto-generated method stub
		ele.click();
		
	}

	@Override
	public void sendKeys(WebElement ele, CharSequence text) {
		// TODO Auto-generated method stub
		ele.sendKeys(text);
		
	}

}
