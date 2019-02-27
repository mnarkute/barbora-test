import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BarboraPage {


    public void openBarboraPage(WebDriver driver) {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.barbora.lt/");
    }

    public void openRegisterForm(WebDriver driver) {
        driver.findElement(By.className("b-login-register--register")).click();
    }

    public void fillFormData(WebDriver driver) {
        driver.switchTo().activeElement();
        driver.findElement(By.className("close")).click();
        driver.findElement(By.cssSelector("")).sendKeys(getEmail());

        driver.findElement(By.className("input[name='password']")).sendKeys(getPassword());
    }

    private String getPassword() {
        return "asdsdasd";
    }

    private String getEmail() {
        return "assa@asasdas.asd";
    }
}
