package week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //syntax of css
        // 1. tagName[attributeName='Value']

        driver.get("https://kahoot.com/");
        WebElement flash = driver.findElement(By.cssSelector("div[class='large-12 columns']"));


        //2. second way of providing syntax, this one used only for id or className
        // tagName.classValue       or tagName#id
        // if you use class value, you have to replace the space(if there is) with.


        //

    }
}
