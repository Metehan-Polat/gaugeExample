package Pom.Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsClick implements IClick{
    @Override
    public void click(WebDriver driver) {
        driver.findElement(By.xpath("//a[@href='/products']")).click();
    }
}
