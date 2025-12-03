package mypackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jithya.sandboxtrial.com/login");
		driver.manage().window().maximize();
		System.out.println("Launch");
		driver.findElement(By.id("username")).sendKeys("gangasenthamil@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Balatamil@01");
		driver.findElement(By.id("signinbutton")).click();
		
		String expectedurl = "https://jithya.sandboxtrial.com/dashboard";
		String actualurl = driver.getCurrentUrl();
		
		if(actualurl.equals(expectedurl)) {
			System.out.println("Loginsuccessfull");
			
		}else {
			
			System.out.println("Loginfailed");
		}
		

		
	}

}
