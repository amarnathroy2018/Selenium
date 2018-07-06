package TestExecution;

import Browser.BrowserParameters;
import Browser.loginParameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {

        for(int i=0;i<=2;i++) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Project\\Installer_Eclipse\\GECKO\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();



            BrowserParameters browserParameters = new BrowserParameters(driver);
            browserParameters.progress();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            loginParameters loginparameters = new loginParameters(driver);
            loginparameters.defineParameters();

        }
    }

}
