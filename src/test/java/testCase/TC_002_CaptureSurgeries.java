package testCase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SurgeriesPage;
import pageObjects.homePage;
import testBase.baseClass;
import utilities.ExcelUtils;
import utilities.TakeScreenshot;

public class TC_002_CaptureSurgeries extends baseClass{
	
	@Test(priority = 3)
	public void CapturePopularSurgeries() throws InterruptedException, IOException
	{
	logger.info("***** Starting TC_002_CaptureSurgeries *****");
	try 
	{
		
		
		homePage hp=new homePage(driver);
		
		hp.clickOnSurgeries();
		logger.info("Clicked On Surgeries ");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 600)");
		logger.info("Scrolled Down Untill Popular Surgeries");
		
		Thread.sleep(1000);
		TakeScreenshot ts = new TakeScreenshot(driver);
		
		ts.takeScreenshot(driver, "PopularSurgeries.png");
		logger.info("Captured ScreenShot of Popular Surgeries");
		
		
		List<WebElement> surgeries = driver.findElements(By.xpath("(//p[@data-qa-id='surgical-solution-ailment-name'])"));
		
		logger.info("Displaying The List of All Popular Surgeries in Console and Excel Sheet");
		
		
		ExcelUtils et = new ExcelUtils(System.getProperty("user.dir") + "\\testdata\\Surgeries.xlsx");
		
		System.out.println("List Of Popular Surgeries");
		System.out.println("===============================================");
		//List<WebElement> dentists = dp.getDentists();
		for (int i = 0; i < surgeries.size(); i++) {
			System.out.println(surgeries.get(i).getText());
			et.setCellData("Popular_surgeries", i, 0, surgeries.get(i).getText());
		}

		logger.info("Displayed List of All Popular Surgeries in Console and Excel Sheet");
		
		System.out.println("===============================================");
		
	}
	catch(Exception e) 
	{
		System.out.println("Capture Popular Surgeries test failed"+ e.getMessage());
		logger.error("Capture Popular Surgeries test failed..");
		Assert.fail("An exception occurred in Capture Popular Surgeries test: " + e.getMessage());	
	}
		
	}
	

	
	
	
	@Test(priority = 4)
	public void GeneralSurgeries() throws IOException
	{
	try 
	{
	
		SurgeriesPage sp =new SurgeriesPage(driver);
		
		sp.ClickOngeneralSurgery();
		logger.info("Clicked On General Surgery");
		
		Thread.sleep(1000);
		TakeScreenshot ts = new TakeScreenshot(driver);
		
		ts.takeScreenshot(driver, "GeneralSurgeries.png");
		logger.info("Captured ScreenShot of General Surgery");
		
		List<WebElement> generalsurgeries = driver.findElements(By.xpath("(//div[@class='flex flex-wrap gap-x-48px gap-y-44px px-20px pt-8px pb-32px']//div//p[@class='mt-12px AilmentItem-module_itemText__XvCHL'])"));
		
		
		ExcelUtils et = new ExcelUtils(System.getProperty("user.dir") + "\\testdata\\Surgeries.xlsx");
		
		logger.info("Displaying The List of All General Surgeries in Console and Excel Sheet");
		
		System.out.println("List Of General Surgeries");
		System.out.println("===============================================");
		for (int i = 0; i < generalsurgeries.size(); i++) {
			System.out.println(generalsurgeries.get(i).getText());
			et.setCellData("General_Surgeries", i, 0, generalsurgeries.get(i).getText());
		}
		
		
		logger.info("Displayed List of All General Surgeries in Console and Excel Sheet");
		
		System.out.println("===============================================");
		sp.ClickOnClose();
		logger.info("Clicked on Close Button and Closed the Open Tab");

	}
	catch(Exception e) 
	{
		System.out.println("General Surgeries test failed"+ e.getMessage());
		logger.error("General Surgeries test failed..");
		Assert.fail("An exception occurred in General Surgeries test: " + e.getMessage());	
	}
	
	}
		
	@Test(priority = 5)
	public void ProctologySurgeries() throws IOException
	{
	try 
	{	
		SurgeriesPage sp =new SurgeriesPage(driver);
		sp.ClickOnProctology();
		logger.info("Clicked On Proctology");
		
		Thread.sleep(1000);
		TakeScreenshot ts = new TakeScreenshot(driver);
		
		ts.takeScreenshot(driver, "ProctologySurgeries.png");
		logger.info("Captured ScreenShot of Proctology Surgeries");
		
		List<WebElement> proctologySurgeries = driver.findElements(By.xpath("(//div[@class='flex flex-wrap gap-x-48px gap-y-44px px-20px pt-8px pb-32px']//div//p[@class='mt-12px AilmentItem-module_itemText__XvCHL'])"));
		
		ExcelUtils et = new ExcelUtils(System.getProperty("user.dir") + "\\testdata\\Surgeries.xlsx");
		
		logger.info("Displaying The List of All Proctology Surgeries in Console and Excel Sheet");
		
		System.out.println("List Of Proctology Surgeries");
		System.out.println("===============================================");
		
		for (int i = 0; i < proctologySurgeries.size(); i++) {
			System.out.println(proctologySurgeries.get(i).getText());
			et.setCellData("Proctology_Surgeries", i, 0, proctologySurgeries.get(i).getText());
		}
		logger.info("Displayed List of All Proctology Surgeries in Console and Excel Sheet");
		System.out.println("===============================================");
		
		sp.ClickOnClose();
		logger.info("Clicked on Close Button and Closed the Open Tab");
	
	}
	catch(Exception e) 
	{
		System.out.println("Proctology Surgeries test failed"+ e.getMessage());
		logger.error("Proctology Surgeries test failed..");
		Assert.fail("An exception occurred in Proctology Surgeries test: " + e.getMessage());
	}
	
	}
	
		
		
	@Test(priority = 6)
	public void OphthamologySurgeries() throws IOException
	{
	try 
	{
		SurgeriesPage sp =new SurgeriesPage(driver);
		sp.ClickOnOphthamology();
		logger.info("Clicked On Ophthamology");
		
		Thread.sleep(1000);
		TakeScreenshot ts = new TakeScreenshot(driver);
		
		ts.takeScreenshot(driver, "OphthamologySurgeries.png");
		logger.info("Captured ScreenShot of Ophthamology Surgeries");
		
		
		List<WebElement> OphthamologySurgeries = driver.findElements(By.xpath("(//div[@class='flex flex-wrap gap-x-48px gap-y-44px px-20px pt-8px pb-32px']//div//p[@class='mt-12px AilmentItem-module_itemText__XvCHL'])"));
		
		ExcelUtils et = new ExcelUtils(System.getProperty("user.dir") + "\\testdata\\Surgeries.xlsx");
		
		logger.info("Displaying The List of All Ophthamology Surgeries in Console and Excel Sheet");
		
		System.out.println("List Of Ophthamology Surgeries");
		System.out.println("===============================================");
		
		for (int i = 0; i < OphthamologySurgeries.size(); i++) {
			System.out.println(OphthamologySurgeries.get(i).getText());
			et.setCellData("Ophthamology_Surgeries", i, 0, OphthamologySurgeries.get(i).getText());
		}
		logger.info("Displayed List of All Ophthamology Surgeries in Console and Excel Sheet");
		System.out.println("===============================================");
		
		sp.ClickOnClose();
		logger.info("Clicked on Close Button and Closed the Open Tab");
	}
	catch(Exception e) 
	{
		System.out.println("Ophthamology Surgeries test failed"+ e.getMessage());
		logger.error("Ophthamology Surgeries test failed..");
		Assert.fail("An exception occurred in Ophthamology Surgeries test: " + e.getMessage());	
	}
	
	}	
		
		
		
	@Test(priority = 7)
	public void UrologySurgeries() throws IOException
	{
	try 
	{
		
		SurgeriesPage sp =new SurgeriesPage(driver);
		sp.ClickOnUrology();
		logger.info("Clicked On Urology");
		
		Thread.sleep(1000);
		TakeScreenshot ts = new TakeScreenshot(driver);
		
		ts.takeScreenshot(driver, "UrologySurgeries.png");
		logger.info("Captured ScreenShot of Urology Surgeries");
		
		
		List<WebElement> UrologySurgeries = driver.findElements(By.xpath("(//div[@class='flex flex-wrap gap-x-48px gap-y-44px px-20px pt-8px pb-32px']//div//p[@class='mt-12px AilmentItem-module_itemText__XvCHL'])"));
		
		ExcelUtils et = new ExcelUtils(System.getProperty("user.dir") + "\\testdata\\Surgeries.xlsx");
		
		logger.info("Displaying The List of All Urology Surgeries in Console and Excel Sheet");
		
		System.out.println("List Of Urology Surgeries");
		System.out.println("===============================================");
		
		for (int i = 0; i < UrologySurgeries.size(); i++) {
			System.out.println(UrologySurgeries.get(i).getText());
			et.setCellData("Urology_Surgeries", i, 0, UrologySurgeries.get(i).getText());
		}
		logger.info("Displayed List of All Urology Surgeries in Console and Excel Sheet");
		
		System.out.println("===============================================");
		
		sp.ClickOnClose();
		logger.info("Clicked on Close Button and Closed the Open Tab");
		
	}
	catch(Exception e) 
	{
		System.out.println("Urology Surgeries test failed"+ e.getMessage());
		logger.error("Urology Surgeries test failed..");
		Assert.fail("An exception occurred in Urology Surgeries test: " + e.getMessage());	
	}	
	}
	
	@Test(priority = 8)
	public void CosmeticSurgeries() throws IOException
	{
	try 
	{
		
		SurgeriesPage sp =new SurgeriesPage(driver);
		
		sp.ClickOnCosmetic();
		logger.info("Clicked On Cosmetic");
		
		Thread.sleep(1000);
		TakeScreenshot ts = new TakeScreenshot(driver);
		
		ts.takeScreenshot(driver, "CosmeticSurgeries.png");
		logger.info("Captured ScreenShot of Cosmetic Surgeries");
		
		
		List<WebElement> cosmeticSurgeries = driver.findElements(By.xpath("(//div[@class='flex flex-wrap gap-x-48px gap-y-44px px-20px pt-8px pb-32px']//div//p[@class='mt-12px AilmentItem-module_itemText__XvCHL'])"));
		
		ExcelUtils et = new ExcelUtils(System.getProperty("user.dir") + "\\testdata\\Surgeries.xlsx");
		
		logger.info("Displaying The List of All Cosmetic Surgeries in Console and Excel Sheet");
		
		System.out.println("List Of Cosmetic Surgeries");
		System.out.println("===============================================");
		
		for (int i = 0; i < cosmeticSurgeries.size(); i++) {
			System.out.println(cosmeticSurgeries.get(i).getText());
			et.setCellData("Cosmetic_Surgeries", i, 0, cosmeticSurgeries.get(i).getText());
		}
		logger.info("Displayed List of All Cosmetic Surgeries in Console and Excel Sheet");

		System.out.println("===============================================");

		sp.ClickOnClose();
		logger.info("Clicked on Close Button and Closed the Open Tab");
	
	}
	catch(Exception e) 
	{
		System.out.println("Cosmetic Surgeries test failed"+ e.getMessage());
		logger.error("Cosmetic Surgeries test failed..");
		Assert.fail("An exception occurred in Cosmetic Surgeries test: " + e.getMessage());	
	}
	
	}
	
	@Test(priority = 9)
	public void OrthopedicsSurgeries() throws IOException
	{
	try 
	{
			
		
		SurgeriesPage sp =new SurgeriesPage(driver);
		
		sp.ClickOnOrthopedics();
		logger.info("Clicked On Orthopedics");
		
		Thread.sleep(1000);
		TakeScreenshot ts = new TakeScreenshot(driver);
		
		ts.takeScreenshot(driver, "OrthopedicsSurgeries.png");
		logger.info("Captured ScreenShot of Orthopedics Surgeries");
		
		
		List<WebElement> orthopedicsSurgeries = driver.findElements(By.xpath("(//div[@class='flex flex-wrap gap-x-48px gap-y-44px px-20px pt-8px pb-32px']//div//p[@class='mt-12px AilmentItem-module_itemText__XvCHL'])"));
		
		ExcelUtils et = new ExcelUtils(System.getProperty("user.dir") + "\\testdata\\Surgeries.xlsx");
		
		logger.info("Displaying The List of All Orthopedics Surgeries in Console and Excel Sheet");
		
		System.out.println("List Of Orthopedics Surgeries");
		System.out.println("===============================================");
		
		for (int i = 0; i < orthopedicsSurgeries.size(); i++) {
			System.out.println(orthopedicsSurgeries.get(i).getText());
			et.setCellData("Orthopedics_Surgeries", i, 0, orthopedicsSurgeries.get(i).getText());
		}
		logger.info("Displayed List of All Orthopedics Surgeries in Console and Excel Sheet");
		
		System.out.println("===============================================");
		
		sp.ClickOnClose();
		logger.info("Clicked on Close Button and Closed the Open Tab");
		
		
	}
	
	catch(Exception e) 
	{
		System.out.println("Orthopedics Surgeries test failed"+ e.getMessage());
		logger.error("Orthopedics Surgeries test failed..");
		Assert.fail("An exception occurred in Orthopedics Surgeries test: " + e.getMessage());	
	}
	logger.info("***** Ending TC_002_CaptureSurgeries *****");

	}

}
