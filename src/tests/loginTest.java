package tests;

import org.testng.annotations.Test;

import basepkg.bclass;
import pages.loginPagee;

public class loginTest extends bclass {
@Test
public void test2(){
	loginPagee ob= new loginPagee(driver);
	ob.log("adwaithac3@gmail.com", "hello123@");
}
}
