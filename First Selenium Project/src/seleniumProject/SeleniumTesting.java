package seleniumProject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http:192.168.95.2/kuwait");
		
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.xpath("//input[@id='txtUser']")).sendKeys("mb13102");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='MRN']")).clear();
		driver.findElement(By.xpath("//input[@name='MRN']")).sendKeys("2019-11-87606");
		driver.findElement(By.xpath("//input[@value='Go to Patient']")).click();
		
		Thread.sleep(3000);
	
		
		//driver.findElement(By.xpath("//div[@class='divContents']//table//tbody//tr//td//a//img")).click();
		
			
		//sendKeys(Keys.);
	}

}
