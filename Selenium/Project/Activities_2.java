import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activities_2 {
    public static void main(String[] args) throws InterruptedException {
        //Creating a driver object referencing WebDriver interface
        WebDriver driver;

        //Instantiating driver object and launching browser
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://alchemy.hguy.co/orangehrm");

        //Get the url of the header image
        String url = driver.findElement(By.xpath("//div[@id=\"divLogo\"]/img")).getAttribute("src");
        //Print the url to the console.
        System.out.println("url :"+url);
        Thread.sleep(3000);

        driver.close();

    }
}
