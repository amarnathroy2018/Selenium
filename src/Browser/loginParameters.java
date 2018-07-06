package Browser;

import org.openqa.selenium.WebDriver;

public class loginParameters {


    WebDriver driver;


    String userName = "developer@globalids.com";
    String passWord = "developer";

    public loginParameters(WebDriver driver) {
        this.driver = driver;
    }

    public void defineParameters() {

        LoginMethod loginmethod = new LoginMethod(driver);
        loginmethod.setUserName(userName);
        loginmethod.setPassWord(passWord);
        loginmethod.loginMethod();
    }

}
