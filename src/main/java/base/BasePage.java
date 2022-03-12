package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import pageObjects.RegisterPage;



public class BasePage {

public static WebDriver driver;
    public static void SetUp()
    {
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.navigate().to("http://karehealth.menpaniproducts.com/admin/auth/login");
       driver.manage().window().maximize();

    }
}
