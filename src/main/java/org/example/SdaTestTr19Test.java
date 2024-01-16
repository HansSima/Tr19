package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdaTestTr19Test {
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
  public void sdaTestTr19() {
    // Test name: SdaTestTr19
    // Step # | name | target | value

    // 1 | open | https://sdacademy.dev/ | 
    // Otevru stranku SDA
    driver.get("https://sdacademy.dev/");
    // 2 | setWindowSize | 1936x1000 | 
    driver.manage().window().setSize(new Dimension(1936, 1000));

    driver.findElement(By.id("cookiescript_accept")).click();

    // 3 | click | css=#menu-item-34381 > a |
    // Preklik na stranku kontakty
    driver.findElement(By.cssSelector("#menu-item-34381 > a")).click();
    // 4 | click | name=form-user-phone | 
    driver.findElement(By.name("form-user-phone")).click();
    // 5 | type | xpath=/html/body/section[1]/div/fieldset/div/form/div[3]/label[2]/span/input | 468746314383
    driver.findElement(By.xpath("/html/body/section[1]/div/fieldset/div/form/div[3]/label[2]/span/input")).sendKeys("468746314383");
    // 6 | click | name=form-user-name | 
    driver.findElement(By.name("form-user-name")).click();
    // 7 | type | name=form-user-name | Josef Novak
    driver.findElement(By.name("form-user-name")).sendKeys("Jan Sima");
    // 8 | click | name=form-user-prefix |
    driver.findElement(By.name("form-user-prefix")).click();
    // 9 | select | name=form-user-prefix | label=+45
    {
      WebElement dropdown = driver.findElement(By.name("form-user-prefix"));
      dropdown.findElement(By.xpath("//option[. = '+45']")).click();
    }
    // 10 | click | name=form-user-email | 
    driver.findElement(By.name("form-user-email")).click();
    // 11 | type | name=form-user-email | eujkbgvubaugbkkub@auogubhag.cz
    driver.findElement(By.name("form-user-email")).sendKeys("eujkbgvubaugbkkub@auogubhag.cz");
    // 12 | type | name=form-user-message | esgsegsegsegseg
    driver.findElement(By.name("form-user-message")).sendKeys("esgsegsegsegseg");
    // 13 | click | css=.sda-input-container:nth-child(6) .wpcf7-list-item-label | 
    driver.findElement(By.cssSelector(".sda-input-container:nth-child(6) .wpcf7-list-item-label")).click();

    Assert.assertEquals("Contact:", driver.findElement(By.xpath("/html/body/section[1]/div/aside/h4")).getText());

    // 15 | close |  |
    driver.close();
  }

}
