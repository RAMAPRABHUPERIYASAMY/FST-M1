import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activities_6 {

        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new FirefoxDriver();
            driver.get("http://alchemy.hguy.co/orangehrm");
            driver.manage().window().maximize();
            driver.findElement(By.id("txtUsername")).sendKeys("orange");
            driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
            driver.findElement(By.id("btnLogin")).click();
            Thread.sleep(5000);
           boolean visible =  driver.findElement(By.id("menu_directory_viewDirectory")).isDisplayed();
            boolean clickable =driver.findElement(By.id("menu_directory_viewDirectory")).isEnabled();
            if (visible == true && clickable == true) {
                driver.findElement(By.id("menu_directory_viewDirectory")).click();
                Thread.sleep(3000);
            }
            String searchDirectory = driver.findElement(By.xpath("//div[@class ='head']/h1")).getText();
            if (searchDirectory.equalsIgnoreCase("Search Directory")){
                System.out.println("Search Directory of the page matches :"+searchDirectory);
            }else
                System.out.println("Search Directory of the page doesn't matched");

            //close the browser
            driver.close();
        }

    }

