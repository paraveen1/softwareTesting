package paytmTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClass.FillRechargeDetailsPage;
import PomClass.RechargePagePaytm;

public class VerifyPaytmPage {
	WebDriver driver;
	RechargePagePaytm rechargepagepaytm ;
	FillRechargeDetailsPage fillrechargedetailsPage;
	
	@BeforeClass
	public void launchBrowse()
	{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
	      driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void  openPaytmHomePage()
	{
		driver.get("https://paytm.com/");
		rechargepagepaytm = new RechargePagePaytm(driver);
	   fillrechargedetailsPage = new FillRechargeDetailsPage(driver);
	   fillrechargedetailsPage.OpenFillRechargeDetailsPage();
	  
		 
	}
	
	@Test
	public void VerifyRechargeButton()
	{
//		String url = driver.getCurrentUrl();
//		
//		Assert.assertEquals("https://paytm.com/datacard-bill-payment/airtel", url);
//		
//		if(url.equals("https://paytm.com/datacard-bill-paymen"))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fails");
//		}
		
	}
	
	
	@Test
	public void verifyrechargeDetailsPage()
	{
		
		
	String url = driver.getCurrentUrl();
	String title = driver.getTitle();
		Assert.assertEquals("Airtel Data Card Bill Payment - Get Best Deals and Cashback Offers at Paytm", title);
		if(url.equals("https://paytm.com/datacard-bill-payment/airtel"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fails");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@AfterMethod
	//public void afterMethod()
	//{
	//	System.out.println("After Method");
	//}
	
	//@AfterClass
	
	//public void afterClass()
	//{
	//	System.out.println("After Class");
	//}

}
