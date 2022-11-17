package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDragable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/draggable");
        driver.manage().timeouts();
        driver.switchTo().frame(0);
        WebElement Drag = driver.findElement(By.xpath("//div[contains(@class,'ui-widget-content')]"));
        Actions builder = new Actions(driver);
        builder.clickAndHold(Drag).moveToElement(Drag, 150, 200).perform();
        
	}

}


