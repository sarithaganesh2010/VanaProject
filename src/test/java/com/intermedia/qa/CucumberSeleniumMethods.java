package com.intermedia.qa;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CucumberSeleniumMethods {
    public static String URL = "https://www.google.co.uk/";
    WebDriver driver = null;
    WebDriverWait wait;
    WebElement f, g, e, h;

    public void launchBrowser() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/Users/guddu/vproject/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5000);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.cssSelector(".gLFyf.gsfi")).clear();

    }

    public void searchTxt(String txt) throws Throwable {
        driver.navigate().refresh();
        driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(txt);
        e = driver.findElement(By.className("gNO89b"));
        e.click();
        Thread.sleep(2000);
    }

    public void foundUrl(String txt) throws Throwable {
        try {
        driver.navigate().refresh();
        f = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div[1]/a/div/cite"));
        Assert.assertTrue(f.getText().equals(txt));
        } finally {
        driver.close();
        driver.quit();
    }

    }

    public void foundUrlIntermedia(String txt) throws Throwable {
        driver.navigate().refresh();
        h = driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div.NJo7tc.Z26q7c.jGGQ5e > div > a > div > cite"));
        System.out.println("Hello----" + h.getText());
        System.out.println("hi-----" + txt);
        Assert.assertTrue(h.getText().equals(txt));
        System.out.println("Hello");

    }

    public void foundURLcouk(String txt) throws Throwable {
        List<WebElement> LIST = driver.findElements(By.xpath("//*[@id='rso']/div"));
        LIST.get(0).click();
        driver.getCurrentUrl();
        driver.navigate().refresh();
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.equals(txt));
        driver.navigate().back();
        driver.navigate().refresh();
    }

    public void foundURLCom(String txt) throws Throwable {
        try {
            driver.findElement(By.xpath("//*[@id='tsf']/div[1]/div[1]/div[2]/div[1]/button")).click();
            driver.navigate().refresh();
            driver.getCurrentUrl();
            List<WebElement> LIST = driver.findElements(By.xpath("//*[@id='rso']/div"));
            LIST.get(3).click();
            driver.navigate().refresh();
            String actualTitle = driver.getTitle();
            Assert.assertTrue(actualTitle.equals(txt));
        } finally {
            driver.close();
            driver.quit();
        }
    }

}
