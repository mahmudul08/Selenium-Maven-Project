package priyoshopRegistration;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllValidInformation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://priyoshop.com/register");
		
		driver.findElement(By.name("IsEmail")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("FirstName")).sendKeys("Tester");
		Thread.sleep(2000);
		
		driver.findElement(By.name("Email")).sendKeys("Testerre@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("Phone")).sendKeys("01323157429");
		Thread.sleep(2000);
		
		driver.findElement(By.name("Password")).sendKeys("T123456789#");
		Thread.sleep(2000);
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("T123456789#");
		Thread.sleep(2000);
		
		driver.findElement(By.name("StreetAddress")).sendKeys("Bogura,Banani");
		Thread.sleep(2000);
		
		Select country = new Select(driver.findElement(By.name("CountryId")));
		country.selectByVisibleText("Bangladesh");
		Thread.sleep(2000);
		
		List<WebElement> countryValues = country.getOptions();
		for(WebElement ele : countryValues)
		{
			System.out.println(ele.getText());
			
			if(ele.getText().equals("Bangladesh"))
			{
				System.out.println("Country is Available");
				break;
			}
		}
		Select district = new Select(driver.findElement(By.name("StateProvinceId")));
		district.selectByVisibleText("Bogra");
		Thread.sleep(2000);
		
		List<WebElement> districtValues = district.getOptions();
		for(WebElement ele : districtValues)
		{
			System.out.println(ele.getText());
			
			if(ele.getText().equals("Bogra"))
			{
				System.out.println("District is Available");
				break;
			}
		}
		Select station = new Select(driver.findElement(By.name("City")));
		station.selectByVisibleText("Shajahanpur");
		Thread.sleep(2000);
		
		List<WebElement> stationValues = station.getOptions();
		for(WebElement ele : stationValues)
		{
			System.out.println(ele.getText());
			
			if(ele.getText().equals("Shajahanpur"))
			{
				System.out.println("Police station is Available");
				break;
			}
		}
		
		
		driver.findElement(By.name("accept-privacy-policy")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("register-button")).click();
		
		
		
		driver.findElement(By.name("register-continue")).click();
		
		driver.quit();
		
		
		}
		

	}


