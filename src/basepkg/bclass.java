package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class bclass {
protected WebDriver driver;
@BeforeClass
public void setUp() {
	driver=new ChromeDriver();
	driver.get("https://mothersparsh.com/");
}
}
