package Browser;

import org.openqa.selenium.WebDriver;

public class BrowserParameters {
    WebDriver driver;

    public BrowserParameters(WebDriver driver) {
        this.driver = driver;
    }

    String baseUrl = "http://192.168.33.89:45450/";
    String pageTitle = "Global IDs";

    public void progress() {
        BrowserMethods browserMethods = new BrowserMethods(driver);
        browserMethods.setBaseUrl(baseUrl);
        browserMethods.setPageTitle(pageTitle);
        browserMethods.openBrowser();

    }


}
