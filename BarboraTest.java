import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BarboraTest {

    static WebDriver driver;

    /*Scenario 1:
New user registers
User searches for a random product from the pre-defined list (Apple, Chicken, Chips, Cola)
 */

    BarboraTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\IdeaProjects/chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    @Test
    public void register() {
        BarboraPage page = new BarboraPage();
        page.openBarboraPage(driver);
        page.openRegisterForm(driver);
        page.fillFormData(driver);

    }

    @Test
    public void searchForRandomProduct() {

    }

    @Test
    public void addBeerToCart() {

    }

    @Test
    public void selectDeliveryTime() {

    }

    @AfterAll
    public static void teardown() {
        driver.close();
        driver.quit();
    }
}
