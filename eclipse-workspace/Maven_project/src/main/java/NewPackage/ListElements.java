package NewPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListElements {
	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumDrivers\\chromedriver\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
      String appurl="https://adactinhotelapp.com/Register.php";
        driver.get("https://adactinhotelapp.com/Register.php");
        //WebElement txt_username = driver.findElement(By.xpath("//input[@id='username']").sendKeys("test1");
        
	}

}
