package testCase;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CardiologiestPage;
import pageObjects.homePage;
import testBase.baseClass;
import utilities.ExcelUtils;

public class TC_001_SearchingCardiologiests extends baseClass{
	
	@Test(priority = 1)
	public void SearchingCardiologiests() throws InterruptedException
	{
	
	logger.info("***** Starting TC_001_SearchingCardiologiests *****");
	try 	
	{
		
		homePage hp=new homePage(driver);
		
		hp.ClickonLocation();
		logger.info("Clicked on Location input box");
		
		hp.ClearLocation();
		logger.info("Cleared existing Location Appearing");
		
		hp.LocationArea.sendKeys(p.getProperty("Location"));
		logger.info("Entered Location as Banglore");
		
		
		hp.ClickOnSearchDoc();
		logger.info("Clicked On Search Doctors, Clinic, Hosplitals,etc.");
		
		hp.SearchDoctorsArea.sendKeys(p.getProperty("Doctors_Spc"));;
		logger.info("Entered Doctor's Speciality as Cardiologiest");
		
		Thread.sleep(1000);
		
		hp.ClickOnCardiologiestOpt();
		logger.info("Clicked on Cardiologiest Option");
	}
	catch(Exception e) 
	{
		System.out.println("Searching Cardiologiests test failed"+ e.getMessage());
		logger.error("Searching Cardiologiests test failed..");
		Assert.fail("An exception occurred in Searching Cardiologiests test: " + e.getMessage());
	}
		
	}


}
