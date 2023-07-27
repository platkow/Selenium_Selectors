package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestImageSearch extends TestBase {
    //Ex.5
    @Test
    public void shouldSearchByImgLink() {
        String imgUrl = "https://a.allegroimg.com/original/11c9e5/922b6fa5466999dc45e9450abe66/Unique-Rave-Festival-Party-Strawberry-Sunglasses-E-Model-beierkang4";
        boolean expectedState = true;

        googleSearchPage.rejectAllCookies();
        googleSearchPage.navigateToSearchByImage();
        googleImgSearchPage.pasteImgLink(imgUrl);
        googleImgSearchPage.search();

        boolean actualState = googleImgResultsPage.elementIsDisplayed();

        Assertions.assertEquals(expectedState, actualState);
    }
}
