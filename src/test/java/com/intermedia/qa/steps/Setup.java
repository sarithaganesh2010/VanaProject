/*
 * Copyright Intermedia Ltd.  All Rights Reserved.
 */
package com.intermedia.qa.steps;

import com.intermedia.qa.Context;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * This is a tad simple and dirty but does the job needed for this slimmed down skeleton project
 *
 * No Need to change this, just use it as it for this test
 *
 * Intermedia's auto testing frameworks a lot more sophisticated than this
 */
public class Setup {

    @Before
    public static void Before() {


        WebDriverManager.chromedriver().setup();
        ChromeOptions browserOptions = new ChromeOptions();
        Context.setDriver(new ChromeDriver(browserOptions));
    }

    @After
    public static void After() {

        if (Context.getDriver() != null) {
           Context.getDriver().quit();
        }
    }
}
