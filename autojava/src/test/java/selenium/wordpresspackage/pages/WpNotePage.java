package selenium.wordpresspackage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WpNotePage {
    private final WebDriver driver;

    public WpNotePage(WebDriver driver) {
        this.driver = driver;
    }

    public WpNotePage addComment(String comment, String author, String email) {
        //Todo: here you publish comment
        WebElement SubmitBox = driver.findElement(By.cssSelector("#submit"));
        SubmitBox.click();
        return new WpNotePage(driver);
    }

    public boolean commentExists(String comment, String author) {
        //Todo: here you check that comment is published
        return false;
    }
}
