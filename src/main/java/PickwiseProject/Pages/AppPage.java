package PickwiseProject.Pages;

import PickwiseProject.Utils;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class AppPage extends Utils {

    private final By _AppleIcon = By.xpath("//body[@class='device-desktop']//div[@class='download_flexer']/a[@href='https://apps.apple.com/app/id1573774954']/img");
    private final By _GoogleIcon = By.xpath("//body[@class='device-desktop']//div[@class='download_flexer']/a[@href='https://play.google.com/store/apps/details?id=com.pickswise.mobile']/img");


    public void newWindow (){
        List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window((browserTabs.get(1)));
        driver.getTitle().equals("Download the free Pickswise app for iOS and Android");
        System.out.println("New Tab opened with Title -  " + driver.getTitle());
    }


    public void downloadPage () {
        System.out.println(driver.getCurrentUrl());


    }

    public void showGoogleIcon(){
        waitForElementToBeVisible(_GoogleIcon,2);

    }

    public void showAppleAppStore(){
        waitForElementToBeVisible(_AppleIcon,2);
    }
}
