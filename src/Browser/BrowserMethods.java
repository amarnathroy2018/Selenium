package Browser;

import org.openqa.selenium.WebDriver;

public class BrowserMethods {
    WebDriver driver;

    public BrowserMethods(WebDriver driver) {
        this.driver=driver;
    }

    private String baseUrl;
    private String pageTitle;


    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;

    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;

    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public void openBrowser() {
        System.out.println("Launching FireFox");
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Project\\Installer_Eclipse\\GECKO\\chromedriver.exe");
        System.out.println("FireFox Launched");
        System.out.println("Getting Url.............");
        driver.get(baseUrl);
        System.out.println("Page opened in Firefox......Page verification started");
        String actualTitle = driver.getTitle();
        if (pageTitle.contentEquals(actualTitle)) {
            System.out.println("Page title verified");
            System.out.println("Test Passsed");
        } else {
            System.out.println("page title verification failed......");
            System.out.println("Test Failed");
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
