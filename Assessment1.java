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

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Assessment1
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		
		
		Thread.sleep(3000);
		WebDriver driver1=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		
		
		
		//ScreenShot of the WholePage
		Shutterbug.shootPage(driver,Capture.FULL, true).save("C:\\Users\\mouni\\OneDrive\\Pictures\\Screenshots");
		
		
		
	     
	     
	}

}
