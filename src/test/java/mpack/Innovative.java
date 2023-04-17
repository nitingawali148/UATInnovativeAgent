package mpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Innovative {
	WebDriver driver;

	@Test(priority = 1)

	public void login() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		// WebDriver driver=new ChromeDriver();

		// Open Chrome Browser with Login Window
		driver.get("https://uat.agent.innovativepartnerslp.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Enter Login Credentials
		driver.findElement(By.xpath("//input[@placeholder='Enter your Email / Agent ID']")).sendKeys("uattestnitin");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		Actions Firstact = new Actions(driver);
		WebElement desktop = driver.findElement(By.xpath("/html/body"));
		Firstact.moveToElement(desktop).perform();

		WebElement Ack = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		Firstact.moveToElement(Ack).click().build().perform();
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void AgentDashboard() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Work with Households']")).click();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void Addofprospect() throws InterruptedException {
		// Add Propsect
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='add']//span[@class='MuiFab-label']//*[name()='svg']"))
				.click();
		Thread.sleep(2000);
		Actions Secondact = new Actions(driver);
		WebElement addprospect = driver.findElement(By.xpath("/html/body"));
		Secondact.moveToElement(addprospect).perform();

		WebElement addprospectall = driver.findElement(By.xpath("//div[@class='modal-header']"));
		Secondact.moveToElement(addprospectall).click().build().perform();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("UATTest");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("UATtestJohn@yopmail.com");
		driver.findElement(By.xpath("//input[@id='filled-required']")).sendKeys("9284076601");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='ADD']")).click();

	}
	@Test(priority = 4)
	public void Prospectaddedsuccessfully() throws InterruptedException {
		Thread.sleep(2000);
		Actions Thirdact = new Actions(driver);
		WebElement Firstok = driver.findElement(By.xpath("/html/body"));
		Thirdact.moveToElement(Firstok).perform();

		WebElement okall = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		Thirdact.moveToElement(okall).click().build().perform();

	}
	@Test(priority = 5)
	public void ResumeEnrollment () throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[@id='MUIDataTableBodyRow-0']//span[@class='MuiIconButton-label']//*[name()='svg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"demo-popup-menu\"]/div[3]/ul/div/li[1]")).click();	
				
	}
	@Test(priority = 6)
	public void Enrollmentinstruction () throws InterruptedException {
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
				
		Thread.sleep(5000);
		Actions Fourthact = new Actions(driver);
		WebElement enrollment = driver.findElement(By.xpath("/html/body"));
		Fourthact.moveToElement(enrollment).perform();

		WebElement Ackenrollment = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		Fourthact.moveToElement(Ackenrollment).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		Thread.sleep(5000);
	}
	
	
	@Test(priority = 7)
	public void setupfamily() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@id=\"s\"]/div/div/input)[3]")).sendKeys("64012");
		
	}
	
	
	
	
	
	
	
	
	//public void tearDown() {
		//driver.quit();

	//}

}
