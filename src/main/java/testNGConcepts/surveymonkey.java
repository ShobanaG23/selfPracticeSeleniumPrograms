package testNGConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class surveymonkey {

	public static WebDriver driver;
	@Test
	public void login() throws IOException {
		
		//open browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//open url
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\rarav\\eclipse-workspace\\selfPracticeSeleniumProgram\\src\\main\\java\\testNGConcepts\\config.properties");
		prop.load(fis);
		
		String url = prop.getProperty("surl");
		System.out.println("url entered is :"+url);
		driver.get(url);
		
		//click login
		driver.findElement(By.linkText("Log in")).click();
		
		//accept cookies
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

		
		//enter username
		driver.findElement(By.xpath("//input[@aria-label='Email address']")).sendKeys("shobana.govindaraju@gmail.com");
		
		
		//click next
		
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		
		
	}

}
