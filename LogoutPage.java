package mypackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage {
	
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
		/*driver.findElement(By.id("")).sendKeys("Tamil");
		driver.findElement(By.id(actualurl)).sendKeys("abc@gmai.com");
		driver.findElement(By.id("")).sendKeys("9873365478");
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).click();*/
		
		driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/a[8]"));
		
		
		String expecturl = "https://jithya.sandboxtrial.com/login?&chkie=true";
		String actual = driver.getCurrentUrl();
		
		if(actual.equals(expecturl)) {
			System.out.println("Logoutsuccessfull");
			
		}else {
			
			System.out.println("Logoutfailed");
		
		
		}
	}

}
