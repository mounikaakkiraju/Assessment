package Assessment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Link5
{ 
	public static void main(String[] args) throws IOException 
		
	{
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		
		//ScreenShot of the FifthLink
		driver.findElement(By.linkText("https://www.getcalley.com/how-calley-auto-dialer-app-works/")).click();
		 TakesScreenshot event = (TakesScreenshot)driver;
	     File source = event.getScreenshotAs(OutputType.FILE);
	     File des=new File("./Link5.png");
	     FileUtils.copyFile(source, des);
		
	}

}
