package Pom.Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartClick implements IClick{
    @Override
    public void click(WebDriver driver) {
        driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
    }
}
