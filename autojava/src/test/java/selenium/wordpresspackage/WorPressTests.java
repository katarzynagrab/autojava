package selenium.wordpresspackage;

import org.junit.jupiter.api.Test;

public class WorPressTests extends BaseTest {

    @Test
    public void canAddCommentToFirstNote() {
        //open wordpress main page
        //open first note
        //add comment to the note
        //check that comment is added

        WpMainPage mainPage = new WpMainPage(driver);
        WpNotePage latestNote = mainPage.openLatestNote();
        WpNotePage latestNoteWithComment = latestNote.addComment(comment, author, email);

        assertions.assertTrue(latestNoteWithComment.commentExists(comment, author));



    }

}
