package Test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionCommands {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.Driver","C:\\web driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		// Html Unit driver
		//HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		
		System.out.print("output URL " + driver.getCurrentUrl());
		
		/*
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)");
		
		//driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		WebElement name1 = driver.findElement(By.xpath("//input[@id='number1Field']"));
		WebElement name2 = driver.findElement(By.xpath("//input[@id='number2Field']"));
		
	
		if(name1.isDisplayed() && name1.isEnabled())
		{
			name1.sendKeys("Gowthamkumar");
		}
		if(name2.isDisplayed() && name2.isEnabled())
		{
			name2.sendKeys("Ramasamy");
		}
		
		/*
		
		driver.findElement(By.xpath("//input[@id='integerSelect']")).isSelected();
		driver.findElement(By.xpath("//input[@id='integerSelect']")).click();
		
		if (driver.findElement(By.xpath("//input[@id='u_9_4_Mx']")).isSelected() == false)
		{
			System.out.println("Male");
		}
		if(driver.findElement(By.xpath("//input[@id='u_9_5_Uq']")).isSelected() == true)
		{
			System.out.println("Female");
		}
		
		*/
		
		driver.close();
		
		
	}

}
