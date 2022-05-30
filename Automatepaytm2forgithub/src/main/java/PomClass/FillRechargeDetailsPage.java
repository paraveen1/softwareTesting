package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillRechargeDetailsPage {

	//@FindBy (xpath="(//input[@autocomplete='new-password'])[1]")
	//private WebElement mobileNo;
	
	
	@FindBy (xpath="//a[text()='Airtel']")
	private WebElement operator;
	
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement allcircle;
	
	@FindBy (xpath="(//input[@autocomplete='new-password'])[2]")
	private WebElement amount;
	
	
	
	public FillRechargeDetailsPage (WebDriver driver)
	
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void  OpenFillRechargeDetailsPage()
	{
		
		 
		// mobileNo.sendKeys("9860067721");
		 operator.click();
		 allcircle.click();
		 amount.sendKeys("150");
	}
	
}
