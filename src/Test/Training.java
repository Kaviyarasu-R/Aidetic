package Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Training {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.Driver","C:\\web driver\\chromedriver.exe");


//Headles browser 
ChromeOptions options = new ChromeOptions();
//options.setHeadless(true);
options.addArguments("--headless browser");

WebDriver driver = new ChromeDriver(options);

driver.manage().window().maximize();

driver.get("https://testsheepnz.github.io/BasicCalculator.html");
//driver.navigate().to("https://testsheepnz.github.io/BasicCalculator.html");

//Scroll the page by using javascript
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scroll(0,1000)");

Thread.sleep(5000);

driver.findElement(By.xpath("//input[@id='number1Field']")).sendKeys("1234567890");
driver.findElement(By.xpath("//input[@id='number2Field']")).sendKeys("1234567890");
driver.findElement(By.xpath("//input[@id='calculateButton']")).click();

Thread.sleep(5000);

String Answer = driver.findElement(By.id("numberAnswerField")).getAttribute("readonly");

System.out.println(Answer);

String TitleofthePage = driver.getTitle();
System.out.println("Current page title" + TitleofthePage);

//Perform the equal operation by using boolaen
boolean result = TitleofthePage.equals("Basic Calculator");
System.out.println(result);

//Perform the equal operation by using If else
String val = "Basic Calculator";
if(TitleofthePage.equals("Basic Calculator")==true)
{
	System.out.println("Passed");
}
else {
	System.out.println("Failed");
}

String pageurl = driver.getCurrentUrl();
System.out.println("Page current url " + pageurl);

File Snip =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
Files.copy(Snip, new File("D:\\RBC\\screenshot.png"));
driver.quit();

	}
	
}


