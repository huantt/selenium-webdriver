import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        def browser = new Browser(driver: new ChromeDriver())

        browser.with {
            go("http://facebook.com")
        }
    }
}
