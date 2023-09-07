package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {
	
	WebDriver driver;

	
	
	public LoginPage lunchBrowser() {
		driver=new ChromeDriver();
		return this;
	}
	public LoginPage openUrl(String url) {
		driver.get(url);
		return this;
	}
	public LoginPage enterUserName(String user) {
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(user);
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.xpath("//input[@value='admin']")).clear();
		driver.findElement(By.xpath("//input[@value='admin']")).sendKeys(pwd);
		return this;
	}
	
	public LoginPage clickLoginButton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return this;
	}
	
	public LoginPage pageTitle() {
		String act = driver.getTitle();
		System.out.println(act);
		return this;
	}
	
	
	public LoginPage clickLogout() {
		driver.findElement(By.xpath("(//ul[@class='navbar-nav ml-auto pl-2']//a)[2]")).click();
		return this;
	}
	public void closeBrowser() {
		driver.close();
		
	}
}
