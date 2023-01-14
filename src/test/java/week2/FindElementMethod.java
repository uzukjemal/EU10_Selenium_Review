package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementMethod {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");
        // find element
        // this method is using locator to locate web element
        // we have 8 types of locator

        //1. id
        //WebElement foot = driver.findElement(By.id("page-footer"));
        //System.out.println(foot.getText());
        //System.out.println(foot.getTagName());
        //foot.click();

        //2. link text
        //WebElement brokenLink = driver.findElement(By.linkText("Broken Images"));
        //System.out.println(brokenLink.getText());
        //brokenLink.click();

        //3.partial link text
        //WebElement checkBox = driver.findElement(By.partialLinkText("Check"));
        //System.out.println(checkBox.getText());



        //WebElement dynamicLoading = driver.findElement(By.partialLinkText("Dynamic "));
        //System.out.println(dynamicLoading.getText());// dynamic loading


        //4. name

        //WebElement meta = driver.findElement(By.name("viewport"));
        //System.out.println(meta.getTagName());


        //5. class name
        //WebElement title = driver.findElement(By.className("h1"));
        //System.out.println(title.getText());

        //WebElement secondTitle = driver.findElement(By.className("h2"));
        //System.out.println(secondTitle.getText());


        //6.tagName
        WebElement tagTitle = driver.findElement(By.tagName("h1"));
        System.out.println(tagTitle.getText());
        System.out.println(tagTitle.getTagName());

        WebElement abLink = driver.findElement(By.linkText("A/B Testing"));
        System.out.println(abLink.getText());

        WebElement username = driver.findElement(By.name("username"));


        WebElement locateTable = driver.findElement(By.name("SampleTable"));

    }
}
