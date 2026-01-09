package SeleniumProject.Project1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;


import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "HI ,Hello World!!!" );
        WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.lambdatest.com/selenium-playground/");
       driver.manage().window().maximize();

       // Print title
       System.out.println("Page Title: " + driver.getTitle());

       driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]")).click();
       driver.findElement(By.xpath("(//input[@type='radio' and @value='Female'])[1]")).click();
       driver.findElement(By.id("buttoncheck")).click();
       String s=driver.findElement(By.xpath("//button[@id='buttoncheck']/following::p[1]")).getText();
       System.out.println(s);
       // Close browser
       driver.quit();

        
    }
}
