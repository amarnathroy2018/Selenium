package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginMethod {


    WebDriver driver;
    private String userName;
    private String passWord;


    public LoginMethod(WebDriver driver) {

        this.driver = driver;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }

    public void loginMethod() {



            System.out.println("providing username");
            driver.findElement(By.xpath("//input[@id='login_txt']")).sendKeys(userName);
            System.out.println("Username provided");
            System.out.println("providing password");
            driver.findElement(By.xpath("//input[@id='login_pwd']")).sendKeys(passWord);
            System.out.println("Password provided");
            System.out.println("Trying to log in.......");
            driver.findElement(By.xpath("//button[@id='login_btn']")).click();
            System.out.println("logged in");
            driver.close();
            System.out.println("logged out");


    }


}
