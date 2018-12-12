package selenium.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WordpressTests {

    private WebDriver driver;

    @BeforeEach
    public void StartDriver1() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    @Test
    public void WordPressAddComment() {

        driver.get("https://automatyzacja.benedykt.net/");

        WebElement LinkBox = driver.findElement(By.cssSelector(".entry-title > a"));
        LinkBox.click();

        WebElement CommentBox = driver.findElement(By.cssSelector("#comment"));
        CommentBox.sendKeys("My comment kasia");

        WebElement AuthorBox = driver.findElement(By.cssSelector("#author"));
        AuthorBox.sendKeys("Kasia");

        WebElement EmaileBox = driver.findElement(By.cssSelector("#email"));
        EmaileBox.sendKeys("kasia@wp.pl");

        WebElement UrlBox = driver.findElement(By.cssSelector("#url"));
        UrlBox.sendKeys("http://markowicz.pro/");

        WebElement SubmitBox =driver.findElement(By.cssSelector("#submit"));
        SubmitBox.submit();






    }




    @AfterEach
    public void CloseDriver1() {
          driver.quit ();
    }

}
