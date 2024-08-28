package Week2_homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		//Precondition: 
		
		driver.get("https://en-gb.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //Requirement
	    driver.findElement(By.xpath("//a[@role='button' and text()='Create new account']")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Rudra");
	    driver.findElement(By.name("lastname")).sendKeys("abhi");
	    driver.findElement(By.name("reg_email__")).sendKeys("Rudra.abhi@gmail.com");
	    driver.findElement(By.id("password_step_input")).sendKeys("password");
	    
	    
	    WebElement Dateweb = driver.findElement(By.id("day"));
		Select Datewebdd = new Select(Dateweb);
		Datewebdd.selectByIndex(3);
		
		WebElement Monthweb = driver.findElement(By.id("month"));
		Select Monthwebdd = new Select(Monthweb);
		Monthwebdd.selectByVisibleText("Jan");
	    
		WebElement Yearweb = driver.findElement(By.id("year"));
		Select Yearwebdd = new Select(Yearweb);
		Yearwebdd.selectByValue("1997");
	    
		driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value='2']")).click();
		
		driver.close();
		
	
	}

}
