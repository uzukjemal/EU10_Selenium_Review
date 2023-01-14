package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        driver.get("https://www.cydeo.com");

        driver.navigate().back();// google or
        driver.navigate().forward();// cydeo
        driver.navigate().refresh();// cydeo again
        driver.navigate().to("https://www.ebay.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("https://www.abc.com");
        String actualTitle = driver.getTitle();
        String actualUrl = driver.getCurrentUrl();


        if(actualTitle.equals("ABC Home Page - ABC.com")){
            System.out.println("First test is PASSED!");
        }else{
            System.out.println("First test is FAILED!!!");
        }

        if(actualUrl.equals("https://www.abc.com")){
            System.out.println("Second test is PASSED!");
        }else{
            System.out.println("Second test is FAILED!!!");
        }
    driver.close();


    }



}
