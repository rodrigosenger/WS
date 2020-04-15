package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class ClickStart {

    @Test
    public void testclick() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeferson\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //driver.findElement(By.className("example")).findElement(By.linkText("Start")).click();
        String Message = driver.findElement(By.id("finish")).getText();
        System.out.println(Message);
        assertEquals("Hello World!",Message);
        driver.quit();
    }

}
