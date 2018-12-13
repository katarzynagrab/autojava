package selenium.pageobjects;

import org.junit.jupiter.api.Test;

public class GoogleTests extends BaseTest{

    @Test
    public void canFindScrumOrgGoogle()  {
        string pageUrl = "https://www.scrum.org/";
        string pageTitle = "Scrum.org: Homepage";

        //Open Google Main Page
        GoogleMainPage googlePage = new GoogleMainPage(driver);

        //Search for Scrum.org
        GoogleResultPage resultPage = googlePage.search("Scrum.org");

        //Assert Scrum.org page is found
        AssertTrue(resualtPagr.contains(pageUrl));
        Assertions.assertTrue(resultPage.containsResultWithTitle(pageUrl, pageTitle),
                "Scrum.org page has correct title");

    }




}
