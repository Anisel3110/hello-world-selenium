
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class day1 {

    WebDriver driver;
    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");
        caps.setPlatform(Platform.LINUX);
        driver = new RemoteWebDriver(new
                URL("http://seleniumhub:4444/wd/hub"), caps);
        driver.get("http://51.255.211.185:8090/webapp");
    }
    @Test
    public void searchString() {
        // find search box and enter search string
        WebElement searchBox = driver.findElement(By.xpath("//h2[contains(text()[2],'AFIP')]/following-sibling::*"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}