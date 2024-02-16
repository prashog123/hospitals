package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardiologiestPage extends basePage {
	WebDriver driver;
	
	//Constructor
	public CardiologiestPage(WebDriver driver)
	{
		super(driver);
	}

	//Elements
	
	@FindBy(xpath=("(//div[@data-qa-id='doctor_review_count_section'])"))
	WebElement PatientStoriesFilterElement;
	
	@FindBy(xpath="(//li[@aria-label='30+ Patient Stories'])")
	WebElement Patient_30_StoriesElement;
	
	@FindBy(xpath="(//div[@data-qa-id='years_of_experience_section'])")
	WebElement ExperienceFilterElement;
	
	@FindBy(xpath=("(//li[@aria-label='5+ Years of experience'])"))
	WebElement Experience5YearsElement;
	
	@FindBy(xpath="(//div[@class='u-d-inlineblock u-color--white u-c-pointer'])")
	WebElement AllFilterElement;
	
	@FindBy(xpath=("(//label[@class='u-c-pointer u-d-block c-filter__label'])[5]"))
	WebElement Element500RsAbove;
	
	@FindBy(xpath=("(//label[@class='u-c-pointer u-d-block c-filter__label'])[10]"))
	WebElement ElementAvailableTomorrow;
	
	@FindBy(xpath="(//div[@data-qa-id='sort_by_section'])")
	WebElement SortByFilterElement;
	
	@FindBy(xpath=("(//li[@aria-label='Experience - High to Low'])"))
	WebElement ElementHighToLowExp;
	
	@FindBy(xpath="(//h2[@data-qa-id='doctor_name'])")
	public List<WebElement> CardiologistsName;
	
	
	
	
	
	//Actions Methods
	
	
	public void clickOnPatientStoriesFilter()
	{
		PatientStoriesFilterElement.click();
	}
	
	public void clickOn_30_Stories()
	{
		Patient_30_StoriesElement.click();
	}
	
	public void clickOnExperienceFilter()
	{
		ExperienceFilterElement.click();
	}
	
	
	public void clickOnExperience5Years()
	{
		Experience5YearsElement.click();
	}
	
	
	public void clickOnAllFilter()
	{
		AllFilterElement.click();
	}
	
	
	public void clickOn500RsAbove()
	{
		Element500RsAbove.click();
	}
	
	
	public void clickOnAvailableTomorrow()
	{
		ElementAvailableTomorrow.click();
	}
	
	
	public void clickOnSortByFilter()
	{
		SortByFilterElement.click();
	}
	
	public void clickOnHighToLowExp()
	{
		ElementHighToLowExp.click();
	}
			

//	public void getCardiologiests()
//	{
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(CardiologistsName.get(i).getText());
//		}
//	}
}
