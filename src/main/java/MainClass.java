import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\dns\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().setSize(new Dimension(1280, 720));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://google.com/");

        WebElement fieldSearch = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        fieldSearch.sendKeys("Selenium Webdriver + Java");

        WebElement buttonSearch = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Поиск в Google']"));
        buttonSearch.submit();

        WebElement firtsTitleResultOfSearch = driver.findElement(By.xpath("//*[starts-with(text(), 'Selenium WebDriver - Selenium ')]"));
        firtsTitleResultOfSearch.click();

        driver.quit();
    }
}
