import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class test_lab_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/webdriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https:/www.ebay.com/");

        WebElement element = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        element.sendKeys("books" + Keys.ENTER);
        Thread.sleep(3000);

        if(driver.findElement(By.id("gh-logo")).isDisplayed())
            System.out.println("The header is displayed!");
        else System.out.println("The header is NOT displayed!");
    }
}