package week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //1. Open Chrome browser
        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon");

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();

        String title = driver.getTitle();

        if(title.equals("Wooden spoon - Etsy")){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed.");
        }

        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”





    }
}
