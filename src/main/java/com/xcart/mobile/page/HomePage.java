package com.xcart.mobile.page;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage extends Utility {

    By shippingtab = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]/span[1]");
    By shippingtext = By.id("page-title");
    By newarrivaltab = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]/a[1]/span[1]");
    By arrivaltext = By.xpath("//h1[text()='New arrivals']");
    By comingsoontab = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]/a[1]/span[1]");
    By comingsoontext = By.xpath("//h1[text()='Coming soon']");
    By contactustab = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[1]");
    By contactustext = By.xpath("//h1[text()='Contact us']");

    public void navigateToShippingPageSuccessfully() throws InterruptedException {
        Reporter.log("click on shipping tab" + shippingtab.toString() + "<br>");
        clickOnElement(shippingtab);
    }
    public String verifyShippingText()throws InterruptedException{
        Reporter.log("verify shoppingtext"+shippingtext.toString()+"<br>");
        Thread.sleep(3000);
       return getTextFromElement(shippingtext);
    }

    public void nagivateToNewPageSuccessfully() throws InterruptedException {
        Reporter.log("click on new arrival"+newarrivaltab.toString()+"<br>");
        clickOnElement(newarrivaltab);
    }
    public String verifyNewArrivalText() throws InterruptedException {
        Reporter.log("verify New Arrival Text"+arrivaltext.toString()+"<br>");
            Thread.sleep(3000);
           return getTextFromElement(arrivaltext);
    }
    public void navigateToComingsoonPageSucessfully() {
        Reporter.log("click on comingsoon tab"+comingsoontab+"<br>");
        clickOnElement(comingsoontab);
    }
    public String verifyComingSoonText(){
        Reporter.log("verify Comingsoon text"+comingsoontext.toString()+"<br>");
         return getTextFromElement(comingsoontext);
    }
    public void navigateToContactUsPageSucessfully()throws InterruptedException {
        Reporter.log("click on Contact us"+contactustab.toString()+"<br>");
        clickOnElement(contactustab);
    }
    public String verifyContactUsText()throws  InterruptedException{
        Reporter.log("verify shoppingtext"+contactustext.toString()+"<br>");
        Thread.sleep(2000);
        return getTextFromElement(contactustext);
    }
}
