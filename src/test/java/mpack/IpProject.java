package mpack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IpProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		// WebDriver driver=new ChromeDriver();

		// Open Chrome Browser with Login Window
		driver.get("https://uat.agent.innovativepartnerslp.com/login");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(2000);

		// Enter Login Credentials
		driver.findElement(By.xpath("//input[@placeholder='Enter your Email / Agent ID']")).sendKeys("uattestnitin");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Thread.sleep(2000);

		// Click on Acknowledgement
		Thread.sleep(5000);
		Actions Firstact = new Actions(driver);
		WebElement desktop = driver.findElement(By.xpath("/html/body"));
		Firstact.moveToElement(desktop).perform();

		WebElement Ack = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		Firstact.moveToElement(Ack).click().build().perform();

		// Agent Dashboard
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Work with Households']")).click();

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

		// Prospect added successfully!
		Thread.sleep(2000);
		Actions Thirdact = new Actions(driver);
		WebElement Firstok = driver.findElement(By.xpath("/html/body"));
		Thirdact.moveToElement(Firstok).perform();

		WebElement okall = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		Thirdact.moveToElement(okall).click().build().perform();

		// Action Start/Resume Enrollment
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//tr[@id='MUIDataTableBodyRow-0']//span[@class='MuiIconButton-label']//*[name()='svg']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"demo-popup-menu\"]/div[3]/ul/div/li[1]")).click();

		// Enrollment instruction
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		Thread.sleep(5000);
		Actions Fourthact = new Actions(driver);
		WebElement enrollment = driver.findElement(By.xpath("/html/body"));
		Fourthact.moveToElement(enrollment).perform();

		WebElement Ackenrollment = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		Fourthact.moveToElement(Ackenrollment).click().build().perform();

		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		Thread.sleep(4000);

		// SetupFamily

		driver.findElement(By.xpath("//div[@id='mui-component-select-Gender']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='MALE']")).click();
		driver.findElement(By.xpath("//input[@id='date-picker-dialog']")).sendKeys("01/01/1980");
		driver.findElement(By.xpath("//input[@name='postal_code']")).sendKeys("64012");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();

		Thread.sleep(5000);

		// span[@class='MuiButton-label']
	}

}
