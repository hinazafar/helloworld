package XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(6000);
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        System.out.println(driver.getWindowHandles());

    }
}
