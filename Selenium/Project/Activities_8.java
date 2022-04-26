import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Activities_8 {
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
        driver.findElement(By.xpath("//span[text() ='Apply Leave']")).click();
        WebElement leave = driver.findElement(By.id("applyleave_txtLeaveType"));
        Select selLeave = new Select(leave);
        selLeave.selectByVisibleText("DayOff");
        WebElement fromDate = driver.findElement(By.id("applyleave_txtFromDate"));
        fromDate.clear();
        fromDate.sendKeys("2022-04-10");
        WebElement toDate=driver.findElement(By.id("applyleave_txtToDate"));
        toDate.clear();
        toDate.sendKeys("2022-04-11");
        driver.findElement(By.id("applyBtn")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
        Thread.sleep(5000);
        String approvalStatus = driver.findElement(By.xpath("//input[@id ='hdnLeaveRequestStatus_1']/preceding-sibling::a")).getText();
        System.out.println("Leave approval status:"+approvalStatus);
        driver.close();
    }
}
