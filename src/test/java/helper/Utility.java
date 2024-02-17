package helper;

import io.cucumber.core.filter.Options;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

public class Utility {

    public static WebDriver driver;
    public static File getJSONSchemaFile(String JSONFile) {
        return new File("src/test/java/helper/JSONSchemaData/" + JSONFile);
    }

    public static String generateRandomEmail() {
        String allowedChars = "abcdefghijklmnopqrstuwvxyz" + "1234567890" + "_-.";
        String email = "";
        String temp = RandomStringUtils.randomAlphanumeric(10); // panjang karakter untuk email
        email = temp + "@testdata.com";
        return email;
    }

    public static void startDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        driver.get("https://pintu.co.id");
//        Thread.sleep(5000);
//        driver.quit();
    }
    public static void quitDriver(){
        driver.quit();
    }
}



