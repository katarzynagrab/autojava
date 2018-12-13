package selenium.wordpresspackage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WpMainPage {
    private final WebDriver driver;

    public WpMainPage(WebDriver driver) {
        this.driver = driver;
        //Todo: here you open wordpress page
        this.driver.get("https://automatyzacja.benedykt.net/");
    }

    public WpNotePage openLatestNote() {
        //Todo: here you find and open latest note (first note)
        WebElement LinkBox = driver.findElement(By.cssSelector(".entry-title > a"));
        LinkBox.click();
        return new WpNotePage(driver);
    }
}
