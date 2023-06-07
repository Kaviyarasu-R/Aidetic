package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.Driver","C:\\web driver\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scroll(0,600)");

		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		driver.navigate().to("https://ww1.demoaut.com/");
		
       /* driver.get("https://www.facebook.com/");
        System.out.print(driver.getCurrentUrl());
        
        Thread.sleep(4000);  */
        driver.navigate().back();
        System.out.print(driver.getTitle());
        
        Thread.sleep(4000);
        driver.navigate().forward();
        System.out.print(driver.getTitle());
        
        driver.navigate().refresh();
        
        driver.close();
	}

}
