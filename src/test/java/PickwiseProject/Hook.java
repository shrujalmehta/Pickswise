package PickwiseProject;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Hook extends BasePage {

    LoadProp loadProp = new LoadProp();
    BrowserSetup browserSetup = new BrowserSetup();

    @Before
    public void initializeTest(){

        browserSetup.selectBrowser();
        driver.get(loadProp.getProperty("url"));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @After
    public void screenshot(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            try {
                // Code to capture and embed images in test reports (if scenario fails) as well as stores it in a folder in the framework

                System.out.println("\"Scenario FAILED... screen shot taken");
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot,"image/png");

                final File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenShot, new File("src\\test\\Resources\\Screenshots\\" + System.currentTimeMillis()+"\\testfailed.png"));

            }catch (WebDriverException somePlatformsDontSupportScreenshots){
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());

            }

        }

        driver.quit();
    }

}

