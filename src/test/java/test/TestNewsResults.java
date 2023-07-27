package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNewsResults extends TestBase {
    //Ex. 2
    @Test
    public void shouldCompareNewsResultsCount() {
        int expectedResultsLinks = 9;
        int actualResultsLinks = 0;

        googleSearchPage.rejectAllCookies();
        googleSearchPage.search("Ferrari");
        googleResultsPage.navigateNews();
        actualResultsLinks = newsPage.countResultsLinks();

        Assertions.assertEquals(expectedResultsLinks, actualResultsLinks);
    }
}
