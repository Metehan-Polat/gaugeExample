package Pom.Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesClick implements IClick{
    @Override
    public void click(WebDriver driver) {
        driver.findElement(By.xpath("//*[text()='Test Cases']")).click();
    }
}
