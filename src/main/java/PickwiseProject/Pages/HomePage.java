package PickwiseProject.Pages;

import PickwiseProject.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utils {

       private final By _Filter = By.xpath("//*[@aria-label=\"select\"]");
       private final By _ClickOnMenu = By.cssSelector("div:nth-of-type(5) > nav  span[role='img']");
       private final By _DownloadPickswiseApp = By.xpath("//div[@id='__next']//div[@class='MainMenu_mainMenu__1uWdR']/div[5]/div//a[@href='https://m.pickswise.com/app/site']//span[.='Download the Pickswise app']");
       private final By _AppleIcon = By.xpath("//body[@class='device-desktop']//div[@class='download_flexer']/a[@href='https://apps.apple.com/app/id1573774954']/img");
       private final By _GoogleIcon = By.xpath("//body[@class='device-desktop']//div[@class='download_flexer']/a[@href='https://play.google.com/store/apps/details?id=com.pickswise.mobile']/img");
    public void mainPage () {
        System.out.println(driver.getCurrentUrl());


    }

    public void clickFilter(){

        clickElement(_Filter);
    }

    public void verifyDropdown(){

        Select select = new Select(driver.findElement(By.xpath("//*[@aria-label=\"select\"]")));

       List actualDropdownValues = new ArrayList();
       for (WebElement element: select.getOptions()){
            System.out.println(element.getText());
           actualDropdownValues.add(element.getText());
       }

       List expectedDropdownValues = new ArrayList();
       expectedDropdownValues.add("All Sports");
       expectedDropdownValues.add("MLB");
       expectedDropdownValues.add("Soccer");
       expectedDropdownValues.add("NHL");
       expectedDropdownValues.add("NBA");

       for (int i=0; i<actualDropdownValues.size();i++){

           Assert.assertTrue(actualDropdownValues.get(i).equals(expectedDropdownValues));

       }


   }

   public void clickMenu(){
        clickElement(_ClickOnMenu);
   }

   public void selectDownloadPickwiseAppOption(){
        scrollIntoView(_DownloadPickswiseApp);
        clickElement(_DownloadPickswiseApp);
   }
}





