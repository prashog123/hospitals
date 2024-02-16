package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SurgeriesPage extends basePage{

	
	WebDriver driver;
	
	//Constructor
	public SurgeriesPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	//Elements
	
	
	
	@FindBy(xpath = "(//h1[@class='text-module_base__1vdUh text-16px font-bold text-black'])[1]")
	public WebElement generalSurgeryElement;
	
	@FindBy(xpath = "(//h1[@class='text-module_base__1vdUh text-16px font-bold text-black'])[2]")
	WebElement ProctologyElement;
	
	@FindBy(xpath = "(//h1[@class='text-module_base__1vdUh text-16px font-bold text-black'])[3]")
	WebElement OphthamologyElement;
	
	@FindBy(xpath = "(//h1[@class='text-module_base__1vdUh text-16px font-bold text-black'])[4]")
	public WebElement UrologyElement;
	
	@FindBy(xpath = "(//h1[@class='text-module_base__1vdUh text-16px font-bold text-black'])[5]")
	WebElement CosmeticElement;
	
	@FindBy(xpath = "(//h1[@class='text-module_base__1vdUh text-16px font-bold text-black'])[6]")
	WebElement OrthopedicsElement;
	
	@FindBy(xpath = "(//span[@class='ModalHeader-module_crossIcon__Yf11z utils-module_right0px__yofdH ModalHeader-module_sizeLargeCrossIcon__3a5hf top-[47%]'])")
	WebElement CloseButtonElement;
	
	
	
	//Action Method
	
	public void ClickOngeneralSurgery()
	{
		generalSurgeryElement.click();
	}
	
	public void ClickOnProctology()
	{
		ProctologyElement.click();
	}
	
	public void ClickOnOphthamology()
	{
		OphthamologyElement.click();	
	}
	
	public void ClickOnUrology()
	{
		UrologyElement.click();
	}
	
	public void ClickOnCosmetic()
	{
		CosmeticElement.click();
	}
	
	public void ClickOnOrthopedics()
	{
		OrthopedicsElement.click();
	}

	public void ClickOnClose() 
	{
		CloseButtonElement.click();
	}
	
	
	
}

