package testNGporamdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginVerifing {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Testing softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String expectedtitle="Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		if(expectedtitle.equals(actualtitle)) {
		System.out.println(actualtitle);
		System.out.println("correct page");
		driver.findElement(By.id("Email")).sendKeys("sindu123@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("321321a");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
		}
		else {
		System.out.println("Incorrect page");
		System.out.println(actualtitle);
		driver.close();
		}
	}
}
			
	   
		
	


