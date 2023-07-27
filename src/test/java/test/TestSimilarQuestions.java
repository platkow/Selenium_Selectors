package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSimilarQuestions extends TestBase {
    //Ex. 1
    @Test
    public void shouldCheckSimilarQuestionsSection() {
        int expectedSimilarQuestionsCount = 4;
        int actualSimilarQuestionsCount = 0;

        googleSearchPage.rejectAllCookies();
        googleSearchPage.search("Elton John");

        if (googleResultsPage.checkIfSimilarQuestionsExist()) {
            actualSimilarQuestionsCount = googleResultsPage.countSimilarQuestions();
        } else {
            assert false;
        }

        Assertions.assertEquals(expectedSimilarQuestionsCount , actualSimilarQuestionsCount);
    }
}
