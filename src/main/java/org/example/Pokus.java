package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pokus {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanss\\Desktop\\sda\\Kody\\SeleniumTr19\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("Presmeruju se na stranku tutorialspoint")
    public void presmerujuSeNaStrankuTutorialspoint() {
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        driver.manage().window().setSize(new Dimension(1936, 1000));
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]")).click();
    }

    @When("Zadam krestni jmeno")
    public void zadamKrestniJmeno() {
        driver.findElement(By.name("firstname")).sendKeys("Jan");
    }

    @And("Zadam prijmeni")
    public void zadamPrijmeni() {
        driver.findElement(By.name("lastname")).sendKeys("Sima");
    }
}
