package Pom.Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApiTestingClick implements IClick{
    @Override
    public void click(WebDriver driver) {
        driver.findElement(By.xpath("//a[@href='/api_list']")).click();
    }
}
