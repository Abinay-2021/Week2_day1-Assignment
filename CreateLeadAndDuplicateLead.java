package week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAndDuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.getTitle();
		System.out.println(text);
		if(text.equalsIgnoreCase("Leaftaps - TestLeaf Automation Platform")) {
			
           System.out.println("title matches");
		}
		else {
			
			System.out.println("title doesn't match");
		}
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abi");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
	
	WebElement dd = driver.findElement(By.name("dataSourceId"));
	Select dd1 = new Select(dd);	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	dd1.selectByVisibleText("Partner");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement dd2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select dd3 = new Select(dd2);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	dd3.selectByVisibleText("Pay Per Click Advertising");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Abinaya");
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Rajendran");
	driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss");
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/09/94");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Profile");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Banking");
	driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("4000");
	
	WebElement dd4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select dd5 = new Select(dd4);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	dd5.selectByVisibleText("Finance");
	
	WebElement dd6 = driver.findElement(By.id("createLeadForm_currencyUomId"));
	Select dd7 = new Select(dd6);
	dd7.selectByVisibleText("EUR - Euro");
	
	WebElement dd8 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select dd9 = new Select(dd8);
	dd9.selectByVisibleText("Sole Proprietorship");
	
	driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("300");
	driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("44110011");
	driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("**&&");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Description Entered");
	driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Notes Entered");
	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
	driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("644");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9115678990");
	driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("500");
	driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Person1");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Raj@yahoo.com");
	driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://Testing.com");
	driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("PersonName");
	driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("AttentionName");
	driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Address1");
	driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address2");
	driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Boston");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	WebElement dd10 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd11 = new Select(dd10);
	dd11.selectByVisibleText("Arizona");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("678908");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	WebElement dd12 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select dd13 = new Select(dd12);
	dd13.selectByVisibleText("United States Minor Outlying Islands");
	driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("644");

	driver.findElement(By.className("smallSubmit")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String Text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	String company1 = Text.replaceAll("[0-9]", "").replaceAll("[()]", "");
	System.out.println(company1);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
	driver.findElement(By.className("smallSubmit")).click();
	
	String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	
	String company2 = text2.replaceAll("[0-9]", "").replaceAll("[()]", "");
	System.out.println(company2);
	
	if (company1.equals(company2)) {
		
		System.out.println("This is an Duplicate Company Name");
	}
	else {
		System.out.println("This is not an Duplicate Company Name");
	}
	
		
	}

}
