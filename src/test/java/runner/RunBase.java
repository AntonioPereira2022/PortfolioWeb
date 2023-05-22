package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunBase {
    static WebDriver driver;

    public enum Browser{CHROME, FIREFOX}         // enum, usa para tipos

    public static WebDriver getDriver() {
        if (driver == null) {                     /// se o driver estiver nulo
            return getDriver(Browser.CHROME);      // da um get driver passando por parametro o navegador desejado
        } else {
            return driver;
        }
    }
    public static WebDriver getDriver(Browser browser) {
        if (driver != null){
            driver.quit();
        }
        switch (browser){
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
        }
     return driver;
    }
}
