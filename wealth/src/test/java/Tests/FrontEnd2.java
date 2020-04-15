package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class FrontEnd2 {

    @Test
    public void seletoresdinamicos(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeferson\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        //clicar botões.
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/a[3]")).click();

        //Clicar no edit.
        String  beforeEdit = "tr:nth-child(";
        String  AfterEdit = ") > td:nth-child(7) > a:nth-child(1)";
        for(int i=1; i<=10; i++){
            driver.findElement(By.cssSelector(beforeEdit+i+AfterEdit)).click();
            System.out.println(beforeEdit+i+AfterEdit);
        }

        //Clicar no delete.
        String  beforeDelete = "tr:nth-child(";
        String  AfterDelete = ") > td:nth-child(7) > a:nth-child(2)";
        for(int i=1; i<=10; i++){
            driver.findElement(By.cssSelector(beforeDelete+i+AfterDelete)).click();
            System.out.println(beforeDelete+i+AfterDelete);
        }
        assertEquals(1,1);
        driver.quit();
    }

}
