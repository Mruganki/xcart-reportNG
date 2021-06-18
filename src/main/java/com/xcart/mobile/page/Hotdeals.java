package com.xcart.mobile.page;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class Hotdeals extends Utility {

    By hotdealstab = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/span");
    By sales = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]");
    By salestext = By.xpath("//h1[@id='page-title']");
    By sortby = By.xpath("//span[@class='sort-by-label']");
    By productalphaorder = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");
    By namealphabatically = By.xpath("//div[@class='list-header']");
    By priceLowHigh = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    By textPriceLowToHigh = By.xpath("//span[text()='Price Low - High']");
    By rates = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]");
    By rateText = By.xpath("//span[text()='Rates");
    By bestsellser = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]");
    By bestsellerText = By.xpath("//h1[@id ='page-title']");
    By selectZToA = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");
    By textZToA = By.xpath("//span[text()='Name Z - A']");
    By priceHighToLow = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    By priceHightoLowText = By.xpath("//span[contains(text(),'Price High - Low')]");
    By bestsellerRates = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]");
    By textBestSellerRates = By.xpath("//span[text()='Rates ']");
    By selectAToZ = By.xpath("//span[contains(text(),'Name A - Z')]");
    public void mouseHoverOnHotDeals() {
        Reporter.log("mousehover on HotDeals Link" + hotdealstab.toString() + "<br>");
        mouseHoverToElement(hotdealstab);
    }

    public void clickOnSales() throws InterruptedException {
        Reporter.log("Mouse hover on sales link n clik" + sales.toString() + "<br>");
        Thread.sleep(3000);
        clickOnElement(sales);
    }

    public String verifySalesText() {
        Reporter.log("verify Sales Text on sales page" + salestext.toString() + "<br>");
        return getTextFromElement(salestext);
    }

    public void hoverOnSortBy() {
        Reporter.log("Mouse hover on SortBy" + sortby.toString() + "<br>");
        mouseHoverToElement(sortby);
        Reporter.log("click on Name: A to Z" + productalphaorder.toString() + "<br>");
        clickOnElement(productalphaorder);
    }

    public String verifyProductNameAlphabeticalOrder() {
        Reporter.log("verify Text Name: A to Z" + namealphabatically.toString() + "<br>");
        return getTextFromElement(namealphabatically);
    }

    public void selctPriceLowHigh() {
        Reporter.log("select Price Low-High" + sortby.toString() + priceLowHigh.toString() + "<br>");
        mouseHoverToElement(sortby);
        clickOnElement(priceLowHigh);
    }

    public String verifyPriceLowToHigh() {
        Reporter.log("verify Price Low To High" + textPriceLowToHigh.toString() + "<br>");
        return getTextFromElement(textPriceLowToHigh);
    }

    public void hoveronSortByAndSelectRates() {
        Reporter.log("mouse hover on sort by and click on rates" + sortby.toString() + "<br>");
        mouseHoverToElement(sortby);
        Reporter.log("mouse hover on sort by and click on rates" + rates.toString() + "<br>");
        clickOnElement(rates);

    }

    public String verifyRateText() {
        Reporter.log("verify Text for Rates" + rateText.toString() + "<br>");
        return getTextFromElement(rateText);
    }

    public void verifyBestSellerProductArrangeByZtoA() {
        Reporter.log("Hover on hotdeals" + hotdealstab.toString() + "<br>");
        mouseHoverToElement(hotdealstab);
        Reporter.log("click on Best seller" + bestsellser.toString() + "<br>");
        clickOnElement(bestsellser);
        Reporter.log("Hover on sortby" + sortby.toString() + "<br>");
        mouseHoverToElement(sortby);
        Reporter.log("Select Z To A" + selectZToA.toString() + "<br>");
        clickOnElement(selectZToA);
    }

    public String verifyBestSellerText() {
        Reporter.log("verify Text for BestSeller" + bestsellerText.toString() + "<br>");
        return getTextFromElement(bestsellerText);
    }

    public String verifyTextZtoA() {
        Reporter.log("verify Text for Name: ZtoA" + textZToA.toString() + "<br>");
        return getTextFromElement(textZToA);
    }

    public void verifyBestSellersProductsPriceArrangeHighToLow()throws InterruptedException {
        Reporter.log("Hover on hotdeals" + hotdealstab.toString() + "<br>");
        mouseHoverToElement(hotdealstab);
        Reporter.log("click on Best seller" + bestsellser.toString() + "<br>");
        clickOnElement(bestsellser);
        Reporter.log("Hover on sortby" + sortby.toString() + "<br>");
        Thread.sleep(3000);
        mouseHoverToElement(sortby);
        Reporter.log("click on Price High To Low" + bestsellser.toString() + "<br>");
        clickOnElement(priceHighToLow);
    }

    public String verifyTextPricHightoLow() {
        Reporter.log("verify Text for Name: ZtoA" + priceHightoLowText.toString() + "<br>");
        return getTextFromElement(priceHightoLowText);
    }

    public void verifyBestSellersProductsArrangeByRates() {
        Reporter.log("Hover on hotdeals" + hotdealstab.toString() + "<br>");
        mouseHoverToElement(hotdealstab);
        Reporter.log("click on Best seller" + bestsellser.toString() + "<br>");
        clickOnElement(bestsellser);
        Reporter.log("Hover on sortby" + sortby.toString() + "<br>");
        mouseHoverToElement(sortby);
        Reporter.log("click on Rates" + bestsellser.toString() + "<br>");
        clickOnElement(bestsellerRates);
    }

    public String verifyTextbestSellerRates() {
        Reporter.log("verify rates text on bestsellers page" + textBestSellerRates.toString() + "<br>");
        return getTextFromElement(textBestSellerRates);
    }
    public void verifyBestSellerProductArrangeByAtoZ() throws InterruptedException {
        Reporter.log("Hover on hotdeals" + hotdealstab.toString() + "<br>");
        mouseHoverToElement(hotdealstab);
        Reporter.log("click on Best seller" + bestsellser.toString() + "<br>");
        clickOnElement(bestsellser);
        Thread.sleep(2000);
        Reporter.log("Hover on sortby" + sortby.toString() + "<br>");
        mouseHoverToElement(sortby);
        Reporter.log("Select Z To A" + selectAToZ.toString() + "<br>");
        clickOnElement(selectAToZ);
    }

}






