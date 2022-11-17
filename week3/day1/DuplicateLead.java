package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Pvt Ltd");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidhuna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sri");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SV");

	    driver.findElement(By.id("createLeadForm_firstName")).clear();
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vid");

	    driver.findElement(By.id("createLeadForm_lastName")).clear();
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vidhu");
	    //FirstName(Local) Field Using id Locator
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sweety");
	    //Department Field Using any Locator of Your Choice
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Electronics");
        //Description Field Using any Locator of your choice 
        driver.findElement(By.id("createLeadForm_description")).sendKeys(" ");
        //email in the E-mail address Field using the locator of your choice
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vidhuna08@gmail.com");
        //Click on Create Button
        driver.findElement(By.className("smallSubmit")).click();
        String Title=driver.getTitle();
		
	}

}

