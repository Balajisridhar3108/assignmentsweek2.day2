package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learnDropDown {
	public static void main(String[] args) {
		//webDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select se=new Select(dropDown1);
		//se.selectByIndex(2);
		//se.selectByVisibleText("Selenium");
		se.selectByValue("2");
		
		
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select se1=new Select(dropDown2);
		//se.selectByIndex(2);
		se1.selectByVisibleText("Selenium");
		//se1.selectByValue("2");
		
		

		WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
		Select se2=new Select(dropDown3);
		se2.selectByIndex(2);
		//se.selectByVisibleText("Selenium");
		//se2.selectByValue("2");
		
		
		
	}

}
