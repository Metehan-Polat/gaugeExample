package Pom.LoginUserWithCorrectEmailandPassword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginUserWithCorrectEmailandPassword {

    public void verifyLoginToYourAccount(WebDriver driver, WebElement webElement)
    {
        String a="Login to your account";
        webElement=driver.findElement(By.xpath("//*[text()='Login to your account']"));
        String b=webElement.getText();
        Assert.assertEquals(a,b);

    }

    public void loginEmail(WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        element.sendKeys("alisarac@gmail.com");
    }

    public void loginPassword(WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        element.sendKeys("ali189...");
    }

    public void loginButton(WebDriver driver)
    {
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
    }
}
