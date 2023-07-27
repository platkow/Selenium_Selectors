package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestResultsStatus extends TestBase {
    //Ex. 3
    @Test
    public void shouldCheckResultsStatus() {
        String expectedStatus = "Strona 10 z ";
        String actualStatus = "";

        googleSearchPage.rejectAllCookies();
        googleSearchPage.search("Lamborghini");
        googleResultsPage.navigateNews();
        newsPage.navigateTenthPage();
        actualStatus = newsPage.getResultsStatus();

        if (actualStatus.contains(expectedStatus)) {
            actualStatus = "Strona 10 z ";
        } else {
            actualStatus = actualStatus;
        }

        Assertions.assertEquals(expectedStatus, actualStatus);
    }
}
