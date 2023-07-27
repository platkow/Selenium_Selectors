package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSendingRouteToPhone extends TestBase {
    //Ex. 4
    @Test
    public void shouldCheckSendingRouteToPhone() {
        googleSearchPage.rejectAllCookies();
        googleSearchPage.navigateGoogleAps();
        googleApsPage.navigateGoogleMaps();
        googleMapsSearchPage.search("Paris");
        googleMapsSearchResults.clickPlotRute();
        googleMapsPlotRutePage.setUpStartPoint("Wersal");
        googleMapsPlotRutePage.selectPublicTransport();

        Assertions.assertTrue(googleMapsPublicTransportPage.isSendRouteToPhoneBtnPresent());
    }
}
