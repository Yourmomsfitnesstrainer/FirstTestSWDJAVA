package step_definitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class MyStepdefs {

    public static ChromeDriver driver;


    @Before
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1280, 720));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com/");


    }

    @Given("^User opened a browser$")
    public void userOpenedABrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\dns\\IdeaProjects\\FirstTestSWDJAVA\\drivers\\chromedriver73.exe");

//        WebDriver driver = new ChromeDriver();


//        driver.manage().window().setSize(new Dimension(1280, 720));
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @When("^User fills in the search bar$")
    public void userFillsInTheSearchBar() {
//        driver.get("https://google.com/");

    }

    @Then("^User is on google page$")
    public void userIsOnGooglePage() {
        WebElement fieldSearch = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        fieldSearch.sendKeys("Selenium Webdriver + Java");
    }

    @And("^User clicks on search button$")
    public void userClicksOnSearchButton() {
        WebElement buttonSearch = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Поиск в Google']"));
        buttonSearch.submit();
    }

    @Then("^User sees the first result$")
    public void userSeesTheFirstResult() {
        WebElement firtsTitleResultOfSearch = driver.findElement(By.xpath("//*[starts-with(text(), 'Selenium WebDriver - Selenium ')]"));
        firtsTitleResultOfSearch.click();
    }

    @And("^Close browser$")
    public void closeBrowser() {
        driver.quit();
    }

}


