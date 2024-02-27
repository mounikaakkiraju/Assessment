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
import org.testng.annotations.Test;

public class link1 
{
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		
		 //ScreenShot of the firstLink
		 driver.findElement(By.linkText("https://www.getcalley.com/")).click();
		 TakesScreenshot event = (TakesScreenshot)driver;
	     File source = event.getScreenshotAs(OutputType.FILE);
	     File des=new File("./Link1.png");
	     FileUtils.copyFile(source, des);
	     
		
	}

}
