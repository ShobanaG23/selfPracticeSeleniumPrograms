package selfPracticeSeleniumProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc001_facebookProgram {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("chrome browser is launched");
		
	//	driver = driver.openBrowser("chrome");
		driver.get("https://www.facebook.com/");
		System.out.println("facebook is launched");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//create new account
		
		driver.findElement(By.linkText("Create new account")).click();
		System.out.println("clicked on create a account");
		
		//Thread.sleep(5000);
		
		//enter username and password, phone number, password----------------------------
		
		driver.findElement(By.name("firstname")).sendKeys("prathyun");
		driver.findElement(By.name("lastname")).sendKeys("Aravindh");
		driver.findElement(By.name("reg_email__")).sendKeys("6473214344");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Prath210715");
		
		//-----------entering dob--------------
		
		driver.findElement(By.name("birthday_month")).sendKeys("jul");
		driver.findElement(By.name("birthday_year")).sendKeys("2015");
		driver.findElement(By.name("birthday_day")).sendKeys("21");
		
		//---------------------------choosing radio button---------------------------------------------
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
	/*		
		List<WebElement> RadioButton = driver.findElements(By.name("sex"));
        // selecting the Radio buttons by Name

        int Size = RadioButton.size();                // finding the number of Radio buttons
        System.out.println("number of options in gender is "+Size);
        for(int i=0; i < Size; i++)                      // starts the loop from first Radio button to the last one
       { 
        	String val = RadioButton.get(i).getAttribute("value");
        	// Radio button name stored to the string variable, using 'Value' attribute
        	
        	

        	if (val.equalsIgnoreCase("2"))   // equalsIgnoreCase is ignore case(upper/lower)
              {                 // selecting the Radio button if its value is same as that we are looking for
        		RadioButton.get(i).click();
        		break;
              }
        }*/
		//-----click on submit------------
        
		driver.findElement(By.name("websubmit")).click();
		System.out.println("clicked on submit");

		
		
		
		
}
}
