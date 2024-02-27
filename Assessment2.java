package Assessment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assessment2 
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
		//step 1:-launching the browser
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step 2:-Navigate to the given Particular URL
		
		driver.get("https://demo.dealsdray.com/");
		
		//step 3:- Login 
		
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com",Keys.TAB,"prexo.mis@dealsdray.com",Keys.ENTER);
		driver.findElement(By.xpath("//div[@style='cursor: pointer;']")).click();
	    driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();	
	    
	    //step 4:- Upload the given File
	    
	    WebElement fileUpload=driver.findElement(By.xpath("//input[@type='file']"));
	    fileUpload.sendKeys("C:\\Users\\mouni\\Downloads\\demo-data.xlsx");
	    driver.findElement(By.xpath("//button[.='Import']")).click();
	    
	    //step 5:- Validate the data
	    
	    WebElement Vd = driver.findElement(By.xpath("//button[.='Validate Data']"));
	    Vd.click();
	    Thread.sleep(1000);
	    
	    //step 6:- Switch to alert
	    
	    Alert alt=driver.switchTo().alert();
	    alt.accept();
	    
	    //Step 7:- Scroll the page
	    
	    Robot robo=new Robot();
	    robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	    robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	    robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	    robo.keyPress(KeyEvent.VK_PAGE_DOWN);	
	    
	     //step 8:-Take the Screenshot
	    
	     TakesScreenshot event = (TakesScreenshot)driver;
	     File source = event.getScreenshotAs(OutputType.FILE);
	     File des=new File("./screenshot2.png");
	     FileUtils.copyFile(source, des);
	    
	    
	
	}
	
	

}
