package stepDef;

import io.cucumber.core.filter.Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.AbstractDriverOptions;

import java.time.Duration;

import static io.cucumber.core.filter.Options.*;

public class testSelenium {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=x");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://pintu.co.id");
        Thread.sleep(5000);
        driver.quit();


    }
}
