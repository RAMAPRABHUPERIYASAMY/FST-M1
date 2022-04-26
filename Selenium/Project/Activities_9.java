import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Activities_9 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        WebDriver.Timeouts timeouts = driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text() ='Emergency Contacts']")).click();
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id ='emgcontact_list']/tbody/tr"));
        System.out.println("No of columns " + columns.size());
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id ='emgcontact_list']/tbody/tr/td[2]"));
        System.out.println("No of Rows " + rows.size());
        for (int j = 0; j < columns.size(); j++) {
            String celtext = columns.get(j).getText();
            System.out.println(celtext);
        }
    }
}