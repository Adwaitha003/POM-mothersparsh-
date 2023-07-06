package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
	
By loginbtn=By.xpath("//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[2]");
By create=By.xpath("//*[@id=\"customer_login\"]/a[2]");
public login(WebDriver driver) {
	this.driver=driver;
}
public void ca() {
   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
   
   driver.switchTo().frame("webklipper-publisher-widget-container-survey-frame");
   driver.findElement(By.id("survey-close-div")).click();
   driver.switchTo().defaultContent();
   driver.findElement(loginbtn).click();
   JavascriptExecutor js=(JavascriptExecutor)driver;
   js.executeScript("window.scrollBy(0,250)", "");
   driver.findElement(create).click();
   
}
}
