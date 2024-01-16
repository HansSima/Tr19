package org.example;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTraining {

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

    @Test
    public void mujTest() {
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        driver.manage().window().setSize(new Dimension(1936, 1000));
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]")).click();
        driver.findElement(By.name("firstname")).sendKeys("Jan");
        driver.findElement(By.name("lastname")).sendKeys("Sima");
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/div/form/div/table/tbody/tr[3]/td[2]/input[2]")).click();
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/div/form/div/table/tbody/tr[4]/td[2]/span[3]/input")).click();
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/div/form/div/table/tbody/tr[5]/td[2]/input")).sendKeys("10.11.2022");
        driver.close();
    }


}
