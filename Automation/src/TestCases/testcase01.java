package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class testcase01 {
public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
		System.out.println("My first code with selenium library");
String projectPath=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/Browser/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		driver =new ChromeDriver(options);
		Thread.sleep(5000);
		driver.get("http://www.8849m.com/2023/01/html-form-automation.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Gunveet");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Arora");
		// label
		driver.findElement(By.xpath("//label[contains(text(),'Radio Button Automation:')]")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='female']")).click();

		driver.findElement(By.xpath("//input[@id='html']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='java']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='vbscript']")).click();
		driver.findElement(By.cssSelector("#vehicle2")).click();
		driver.findElement(By.xpath("//textarea")).sendKeys("My Text area Automation");
		
		Select drpCountry = new Select(driver.findElement(By.name("cars")));
		drpCountry.selectByVisibleText("Fiat");
		Thread.sleep(3000);
		drpCountry.selectByIndex(1);
		Thread.sleep(3000);
		drpCountry.selectByValue("audi");
		driver.getTitle();
		System.out.println(driver.getTitle());
}

}
