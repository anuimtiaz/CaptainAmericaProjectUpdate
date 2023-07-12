import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ABCD {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.upskillconsultancy.com/student-portal");

		driver.findElement(By.xpath("//a[contains(text(),'UPSKILL CONSULTANCY')]")).click();

		WebElement iiiframe = driver.findElement(By.xpath("//*[@id=\"comp-kz7t58y1\"]/iframe"));

		driver.switchTo().frame(iiiframe);

		driver.findElement(By.xpath(""
				+ "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div/textarea"))
		.sendKeys("Hi");	
	}
}



