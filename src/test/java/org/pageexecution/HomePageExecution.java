package org.pageexecution;

import java.util.Date;

import org.baseutil.BaseClass;
import org.pagefactory.LoginPageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePageExecution extends BaseClass {
	@Parameters({ "data" })
	@BeforeMethod
	public void beforeMethod(String data) {
		System.out.println("going to the link");
		driver.get(data);
	}

	@Test
	public void test1() {
		Date d = new Date();
		System.out.println(d.toString());
		LoginPageFactory lp = new LoginPageFactory();
		lp.getUsername().sendKeys("shahul");
	}

	@Test
	public void test2() {
		Date d = new Date();
		System.out.println(d.toString());
		LoginPageFactory lp = new LoginPageFactory();
		lp.getUsername().sendKeys("deepak");
	}

	public void excludeMethod() {
		System.out.println("excludeMethod");
	}

}
