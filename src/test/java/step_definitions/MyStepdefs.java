package step_definitions;

import cucumber.api.PendingException;
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

import java.util.List;
import java.util.concurrent.TimeUnit;


public class MyStepdefs {

    public static ChromeDriver driver;
    
// Comments

    @Before
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1280, 720));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\dns\\IdeaProjects\\FirstTestSWDJAVA\\drivers\\chromedriver73.exe");
//        driver.get("https://google.com/");


    }


    @When("^User go to \"([^\"]*)\"$")
    public void userGoTo(String url) {
        if (url.equals("google.com")) {
            driver.get("https://www.google.com");
        } else {
            System.out.println("Тю Тю");
        }

    }

    @Then("^User fills in the search bar$")
    public void userFillsInTheSearchBar() {
        WebElement fieldSearch = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        fieldSearch.sendKeys("Selenium Webdriver + Java");
    }

    @And("^User clicks on search button$")
    public void userClicksOnSearchButton() {
        WebElement buttonSearch = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Поиск в Google']"));
        buttonSearch.submit();
    }


    /*public static class ListElementsOnPage {
        List<WebElement> HeadersForQueryResults = driver.findElements(By.xpath("//a//h3"));


    }*/


    @Then("^The user writes the query results to the collection$")
    public static List<WebElement> theUserWritesTheQueryResultsToTheCollection() {
//        ListElementsOnPage ListElementsOfGooglePage = new ListElementsOnPage();
        List<WebElement> HeadersForQueryResults = driver.findElements(By.xpath("//a//h3"));


        for (WebElement TextOfHeaders : HeadersForQueryResults) {

            String strTextOfHeaders = TextOfHeaders.getText();
            System.out.println(strTextOfHeaders);

        }
        return HeadersForQueryResults;
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


