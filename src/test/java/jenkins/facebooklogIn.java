package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class facebooklogIn {

    public static WebDriver driver;
@Parameters("Browser")
    @Test
    public  void fbLogin(String browserName){

    if (browserName.contains("Chrome")){
        driver = new ChromeDriver();
    }
    else{
        driver = new SafariDriver();
    }


        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("foy21");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
        driver.findElement(By.name("login")).click();

        driver.quit();

    }
}
