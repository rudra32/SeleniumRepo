package Week2_homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();// crmsfa
		
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastName");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
