import io.github.bonigarcia.wdm.WebDriverManager;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


//import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


import java.util.concurrent.TimeUnit;

public class FirstTest {
    String SITE_URL = "https://www.google.ru/";
    public WebDriver driver = new ChromeDriver();
    public WebElement searchBox;


    @BeforeEach
    public void start(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    public void finish(){
        driver.quit();
    }

    @Test
    public void testSearchGoogle(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(false);
//        ChromeDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(SITE_URL);

        searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("youtube");
        searchBox.submit();





    }

}
