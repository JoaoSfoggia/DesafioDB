package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Setup.Setup;

public class SeleniumUtils {
	public static WebDriver driver;

	public SeleniumUtils() {
		driver = Setup.getDriver();
	}

	public void esperaElemento(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}