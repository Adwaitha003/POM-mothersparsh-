package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createpage {
	WebDriver driver;
	By fname=By.id("RegisterForm-FirstName");
	By lname=By.id("RegisterForm-LastName");
	By dob=By.id("RegisterForm-dob");
    By email=By.id("RegisterForm-email");
    By pswd=By.id("RegisterForm-password");
    By checkbox=By.id("tc-check");
    By clickcreate=By.xpath("//button[@onclick='return true']");
    
	public Createpage(WebDriver driver) 
	{
		this.driver=driver;		
	}
	public void registration(String firstname,String lastname,String db,String motheremail,String password) throws InterruptedException
	{
		
		driver.findElement(fname).sendKeys(firstname);
		driver.findElement(lname).sendKeys(lastname);
	    driver.findElement(dob).sendKeys(db);		
	    driver.findElement(email).sendKeys(motheremail);
	    driver.findElement(pswd).sendKeys(password); 
	    
	    Thread.sleep(2000);
	    
		driver.findElement(checkbox).click();
		driver.findElement(clickcreate).click();
	}
}


