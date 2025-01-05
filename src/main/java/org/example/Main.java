package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {

        // Create the WebDriver instance
        WebDriver driver = new ChromeDriver();
        WebDriver driver2 = new FirefoxDriver();

        // Open a webpage (e.g., Google)
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        // CSS Selector tag#id
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mac");

    }
}
