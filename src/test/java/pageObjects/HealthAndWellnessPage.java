package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HealthAndWellnessPage extends basePage{

	WebDriver driver;
	
	//Constructor
	
	public HealthAndWellnessPage(WebDriver driver) 
	{
		
		super(driver);
		
	}

	
	//Elements
	@FindBy(xpath = "(//div[@class='form-container'])[1]")
	public WebElement ScheduleDemoAreaElement;
	
	@FindBy(xpath = "(//input[@id='name'])[1]")
	public WebElement EnterNameElement;
	
	@FindBy(xpath = "(//input[@id='organizationName'])[1]")
	public WebElement OrganizationNameElement;
	
	@FindBy(xpath = "(//input[@id='contactNumber'])[1]")
	public WebElement ContactNumberElement;
	
	@FindBy(xpath = "(//input[@id='officialEmailId'])[1]")
	public WebElement officialEmailIdElement;
	
	
	@FindBy(xpath = "(//select[@id='organizationSize'])[1]")
    WebElement organizantionSizeDropdownElement;
	
	@FindBy(xpath = "(//select[@id='interestedIn'])[1]")
	WebElement interestedInDropdownElement;
	
	@FindBy(xpath = "//header[@id='header']//button[@type='submit'][normalize-space()='Schedule a demo']")
    WebElement scheduleButton;
	
	@FindBy(xpath = "(//div[@class='u-text--bold text-alpha'])[1]")
	public WebElement captureThankYouText;
	
	@FindBy(xpath = "(//div[@class='u-m-t--10'])[1]")
	public WebElement capturethankYouParagraph;
	
	
	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]")
    WebElement thankYouModal;
	
    @FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/div[1]")
    WebElement thankYou;
    
    @FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/div[2]")
    WebElement thankYouParagraph;
	
	//Actions Methods
	
	

	public void organizantionSizeDropdown()
	{
		
		Select organizantionSizeDropdown=new Select(organizantionSizeDropdownElement);
		organizantionSizeDropdown.selectByVisibleText("501-1000");
		
	}
	
	public void interestedInDropdown()
	{
		
		Select interestedInDropdown=new Select(interestedInDropdownElement);
		interestedInDropdown.selectByVisibleText("Taking a demo");
		
	}
	
	public WebElement getScheduleButton()
	{
        return scheduleButton;
    }
	
	public WebElement getScheduleDemoAreaElement() 
	{
		return ScheduleDemoAreaElement;
	}
	
	public boolean getThankYouModal()
	{
	        return thankYouModal.isDisplayed();
    }
	
	public String getThankYou()
	{
		return thankYou.getText();
	}
	
    public String getThankYouParagraph()
    {
    	return thankYouParagraph.getText();
	}
}
