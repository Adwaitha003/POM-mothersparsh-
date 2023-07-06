package tests;

import org.testng.annotations.Test;

import basepkg.bclass;
import pages.Createpage;
import pages.login;



public class mothersparshtest extends bclass{
	@Test
	public void test1() throws InterruptedException
	
	{
		login ob1 =new login(driver);
		ob1.ca();
		
		Createpage ob= new Createpage(driver);
		ob.registration("Adwaitha","Chandran","19-08-1997","adwaithac3@gmail.com","hello123@");
			
		
		
}
}