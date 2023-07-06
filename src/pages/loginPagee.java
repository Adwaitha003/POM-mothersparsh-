package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class loginPagee {
WebDriver driver;
By loginbtn=By.xpath("//*[@id=\\\"shopify-section-header\\\"]/sticky-header/header/div/a[2]");
By email=By.id("CustomerPassword");
By passw=By.id("CustomerPassword");
By log=By.xpath("//*[@id=\"customer_login\"]/button");

public loginPagee(WebDriver driver) {
	this.driver=driver;
}
public void log(String id,String pswd) {
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	   
	   driver.switchTo().frame("webklipper-publisher-widget-container-survey-frame");
	   driver.findElement(By.id("survey-close-div")).click();
	   driver.switchTo().defaultContent();
	   driver.findElement(loginbtn).click();
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,150)", "");
	   driver.findElement(email).sendKeys(id);
	   driver.findElement(passw).sendKeys(pswd);
	   driver.findElement(log).click();
	   
}
}
