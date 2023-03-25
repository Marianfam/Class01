package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class launchBrowser {
    public static void main(String[] args) throws InterruptedException {
        // 1-tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //2-create an instance of webDriver
        WebDriver driver=new ChromeDriver();

        //3-open the website google.com
        driver.get("https://www.facebook.com/");

        //4-get the current url that is there in the browser
        String URL = driver.getCurrentUrl();

        //5-print out the url
        System.out.println(URL);

        //6-get the title of the webpage
        String title= driver. getTitle();
     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //7-print the title of the page
        System.out.println("the title of the page is "+title);

        driver.findElement(By.xpath("//input[@id='email']"))
                .sendKeys("hhdhdhdhd");

        driver.findElement(By.xpath("//input[@id='pass']"))
                .sendKeys("ggggggg");
        WebDriverWait wait = new WebDriverWait(driver, 3);
        Thread.sleep(3000);
      //  driver.findElement(By.xpath("//button[@id='loginbutton']"))

       // .click();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable
                        (By.xpath("//button[@id='loginbutton']")));
        element.click();


        //8-close the browser


        //driver.quit();


    }
}
