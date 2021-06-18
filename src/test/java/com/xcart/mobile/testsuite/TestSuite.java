package com.xcart.mobile.testsuite;

import com.xcart.mobile.customlisteners.CustomListeners;
import com.xcart.mobile.page.HomePage;
import com.xcart.mobile.page.Hotdeals;
import com.xcart.mobile.page.ShoppingPage;
import com.xcart.mobile.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//@Listeners(CustomListeners.class)

public class TestSuite extends TestBase {
    SoftAssert softAssert = new SoftAssert();
    HomePage homepage = new HomePage();
    Hotdeals hotdeals = new Hotdeals();
    ShoppingPage shoppingPage = new ShoppingPage();


//Homepage Tests
    @Test(groups = {"sanity","smoke","regression"})
    public void navigateAndVerifyShippingPageToContactUSPage() throws InterruptedException {

        homepage.navigateToShippingPageSuccessfully();
        Thread.sleep(3000);
        String expectedShippingText = "Shipping";
        String actualShippingText = homepage.verifyShippingText();
        Assert.assertEquals(actualShippingText, expectedShippingText);
        softAssert.assertTrue(true);
    }
    @Test(groups = {"smoke","regression"})
    public void navigateToNewPageTest() throws InterruptedException{
        homepage.nagivateToNewPageSuccessfully();
        //homepage.verifyNewArrivalText();
        Thread.sleep(3000);
        String expectedNewarrivalText = "New arrivals";
        String actualNewarrivalText = homepage.verifyNewArrivalText();
        Assert.assertEquals(actualNewarrivalText, expectedNewarrivalText);
        softAssert.assertTrue(true);
    }
    @Test(groups = {"regression"})
    public void navigateToCommingSoonPageTest() {
        homepage.navigateToComingsoonPageSucessfully();
        String expectedComingSoonText = "Coming soon";
        String actualComingSoonText = homepage.verifyComingSoonText();
        Assert.assertEquals(actualComingSoonText, expectedComingSoonText);
        softAssert.assertTrue(true);
    }
    @Test(groups = {"regression"})
    public void navigateToContactUSPage()throws InterruptedException{
        homepage.navigateToContactUsPageSucessfully();
        Thread.sleep(2000);
        String expectedContactUs = "Contact me";
        String actualContactUs = homepage.verifyContactUsText();
        Assert.assertEquals(actualContactUs, expectedContactUs);
        softAssert.assertTrue(false);
        softAssert.assertAll();
    }
//HotDeal Test
    @Test(groups = {"sanity","smoke","regression"})
    public void  verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException{

        hotdeals.mouseHoverOnHotDeals();
        hotdeals.clickOnSales();
        Thread.sleep(2000);
        String saleMsg = "Sale";
        String actualSalesMsg = hotdeals.verifySalesText();
        Assert.assertEquals(actualSalesMsg, saleMsg, "User Is Not On Sales Page");
        softAssert.assertTrue(true);
        hotdeals.hoverOnSortBy();
        hotdeals.verifyProductNameAlphabeticalOrder();
        Thread.sleep(3000);
//        String expecteNameAlphabatically = "Sort by: Name A - Z";
//        String ActuallyNameAlphabatically = hotdeals.verifyProductNameAlphabeticalOrder();
//        Assert.assertEquals(ActuallyNameAlphabatically,expecteNameAlphabatically,"Product are not Arranged in Alphabatical order");
//        softAssert.assertTrue(true);
        // verify products arranged in 'A to Z'
        Thread.sleep( 2000 );
        List<WebElement>productList = driver.findElements( By.xpath( "//ul[@class='products-grid grid-list']/li/div/div/a/following::h5/child::a[@class='fn url next-previous-assigned']" ) );

        List<String> productName = new ArrayList<>();

        for (WebElement products1 : productList){
            productName.add(products1.getText());
        }

        List<String> tempList1 = new ArrayList<>();
        tempList1.addAll(productName);

        Collections.sort(tempList1);
        System.out.println(productName);
        System.out.println(tempList1);
        softAssert.assertEquals( productName, tempList1);
        softAssert.assertTrue( true );
        Thread.sleep( 1000 );
    }
    @Test(groups = {"smoke","regression"})
    public void  verifySaleProductsPriceArrangeLowToHigh()throws InterruptedException{
        hotdeals.mouseHoverOnHotDeals();
        hotdeals.clickOnSales();
        Thread.sleep(2000);
        String saleMsg = "Sale";
        String actualSalesMsg = hotdeals.verifySalesText();
        Assert.assertEquals(actualSalesMsg, saleMsg, "User Is Not On Sales Page");
        softAssert.assertTrue(true);
        hotdeals.hoverOnSortBy();
        hotdeals.selctPriceLowHigh();
        Thread.sleep(3000);
    String expectedPricetext = "Price Low - High";
//    String actualPriceText = hotdeals.verifyPriceLowToHigh();
//    Assert.assertEquals(actualPriceText, expectedPricetext, "Product price is not arranged as low to high");
//        softAssert.assertTrue(true);
        //verify products arranged in 'price Low to High'
        Thread.sleep( 2000 );
        List<WebElement> productListForPrice = driver.findElements( By.xpath( "//div[@class='product-price widget-fingerprint-product-price']/ul/li/child::span[@class='price product-price']" ) );

        List<String> productNameForPrice = new ArrayList<>();

        for (WebElement products2 : productListForPrice) {
            productNameForPrice.add( products2.getText() );
        }

        List<String> tempList2 = new ArrayList<>();
        tempList2.addAll( productNameForPrice );

        Collections.sort( tempList2);
        Collections.sort( productNameForPrice);

        System.out.println( productNameForPrice );
        System.out.println( tempList2 );
        softAssert.assertEquals(  productNameForPrice, tempList2 );
        softAssert.assertTrue( true );
        Thread.sleep( 1000 );

    }
    @Test(groups = {"smoke","regression"})
    public void vefirySalesProductsArrangedByRates() throws InterruptedException {
        hotdeals.mouseHoverOnHotDeals();
        hotdeals.clickOnSales();
         Thread.sleep(2000);
        String saleMsg = "Sale";
        String actualSalesMsg = hotdeals.verifySalesText();
        Assert.assertEquals(actualSalesMsg, saleMsg, "User Is Not On Sales Page");
        softAssert.assertTrue(true);
         hotdeals.hoveronSortByAndSelectRates();
         hotdeals.verifyRateText();
         Thread.sleep(3000);
//       String expectedSortByMsg = "Rates";
//       String actualSortByMsg = hotdeals.verifyRateText();
//       Assert.assertEquals(actualSortByMsg,expectedSortByMsg,"Products Are Not Sorted In Rates");
//        softAssert.assertTrue(true);
        List<WebElement>productListForRates = driver.findElements( By.xpath( "//h5[@class='product-name']/child::a[@class='fn url next-previous-assigned']" ) );

        List<String> productNameForRates = new ArrayList<>();

        for (WebElement products3 : productListForRates){
            productNameForRates.add(products3.getText());
        }

        List<String> tempList3 = new ArrayList<>();
        tempList3.addAll(productNameForRates);

        Collections.sort(tempList3);
        Collections.sort(productNameForRates);

        System.out.println(productNameForRates);
        System.out.println(tempList3);
        softAssert.assertEquals(productNameForRates, tempList3);
        softAssert.assertTrue( true );
        softAssert.assertAll();
    }

    @Test(groups = {"regression"})
    public void arrangeBestSellerProductZToA()throws InterruptedException{
        hotdeals.verifyBestSellerProductArrangeByZtoA();
        Thread.sleep(2000);
        String saleMsg = "Bestsellers";
        String actualSalesMsg = hotdeals.verifyBestSellerText();
        softAssert.assertTrue(true);
        Assert.assertEquals(actualSalesMsg,saleMsg,"User Is Not On Best Sellers Page" );
//        String expectedSortByMsg = "Name Z - A";
////        String actualSortByMsg = hotdeals.verifyTextZtoA();
//        Assert.assertEquals(actualSortByMsg,expectedSortByMsg,"Products Are Not Sorted In Z-A");
//        softAssert.assertTrue(true);
        //verify products arranged in 'Z to A'
        List<WebElement> productListForReverse = driver.findElements( By.xpath( "//a[@class='fn url next-previous-assigned']" ) );

        List<String> productNamebyZToA = new ArrayList<>();

        for (WebElement products4 : productListForReverse) {
            productNamebyZToA.add( products4.getText() );
        }

        List<String> tempList4 = new ArrayList<>();
        tempList4.addAll( productNamebyZToA );

        Collections.sort( tempList4 ,Collections.reverseOrder());
        Collections.sort( productNamebyZToA,Collections.reverseOrder() );
        System.out.println( productNamebyZToA );
        System.out.println( tempList4 );
        softAssert.assertEquals(  productNamebyZToA, tempList4 );
        softAssert.assertTrue( true );
        Thread.sleep( 3000 );
    }
    @Test(groups = {"regression"})
    public void arrnageBestSellerProductHighToLow() throws InterruptedException{
        hotdeals.verifyBestSellersProductsPriceArrangeHighToLow();
        Thread.sleep(2000);
        String saleMsg = "Bestsellers";
        String actualSalesMsg = hotdeals.verifyBestSellerText();
        Assert.assertEquals(actualSalesMsg,saleMsg,"User Is Not On Best Sellers Page" );
        softAssert.assertTrue(true);
        Thread.sleep(3000);
        List<WebElement> productListForHighTolow = driver.findElements( By.xpath( "//div[@class='product-price widget-fingerprint-product-price']/ul/li/child::span[@class='price product-price']" ) );
        List<String> productNameForPriceHighToLow = new ArrayList<>();
        Thread.sleep( 2000 );
        for (WebElement products5 : productListForHighTolow) {
            productNameForPriceHighToLow.add( products5.getText() );
        }

        List<String> tempList5 = new ArrayList<>();
        tempList5.addAll( productNameForPriceHighToLow );
        Thread.sleep( 3000 );
        Collections.sort( tempList5);
        Collections.sort( productNameForPriceHighToLow );

        System.out.println( productNameForPriceHighToLow );
        System.out.println( tempList5 );
        softAssert.assertEquals( productNameForPriceHighToLow, tempList5);
        softAssert.assertTrue( true );
        Thread.sleep( 1000 );
//

    }

    @Test(groups = {"regression"})
    public void arrangeBestSellerProductByRates()throws InterruptedException{
        hotdeals.verifyBestSellersProductsArrangeByRates();
        Thread.sleep(2000);
        String saleMsg = "Bestsellers";
        String actualSalesMsg = hotdeals.verifyBestSellerText();
        Assert.assertEquals(actualSalesMsg,saleMsg,"User Is Not On Best Sellers Page" );
        softAssert.assertTrue(true);
        Thread.sleep(3000);
//        String expectedRateMsg = "Rates";
//        String actualRateMsg = hotdeals.verifyTextbestSellerRates();
//        Assert.assertEquals(actualRateMsg, expectedRateMsg,"Product Rates is not arranged as expected" );
//        softAssert.assertTrue(true);
        List<WebElement>productListForRates1 = driver.findElements( By.xpath( "//h5[@class='product-name']/child::a[@class='fn url next-previous-assigned']" ) );

        List<String> productNameForRates1 = new ArrayList<>();

        for (WebElement products6 : productListForRates1){
            productNameForRates1.add(products6.getText());
        }

        List<String> tempList6 = new ArrayList<>();
        tempList6.addAll(productNameForRates1);

        Collections.sort(tempList6);
        Collections.sort(productNameForRates1);

        System.out.println(productNameForRates1);
        System.out.println(tempList6);
        softAssert.assertEquals(productNameForRates1, tempList6);
        softAssert.assertTrue( true );
        softAssert.assertAll();
    }

    //Shopping Tests
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyThatUserShouldPlaceOrderSuccessfullyForAvengersFabrikationPlush() throws InterruptedException{
        shoppingPage.MouseHoverOnHotDeals();
        shoppingPage.clickOnSale();
        String saleText = "Sale";
        String actualSalesText = hotdeals.verifySalesText();
        Assert.assertEquals( actualSalesText,saleText);
        softAssert.assertTrue(true);
        shoppingPage.hoverOnSortBy();
        shoppingPage.clickOnAtoZ();
        Thread.sleep(3000);
        shoppingPage.clickOnAvengers();
        shoppingPage.getClickOnCheckBox();
        shoppingPage.clickOnAddToCartOfproduct();
        shoppingPage.verifyTextFromGreenbar();
        shoppingPage.clickToCloseBar();
        shoppingPage.clickOnYourCartAndViewCart();
        String shopCarttext = "Your shopping cart - 1 item";
        String realShopCart = shoppingPage.verifyYourShoppingcarttext();
        Assert.assertEquals(realShopCart, shopCarttext);
        softAssert.assertTrue( true );
        shoppingPage.modifyQuntity();
        String shoppingCartText = "Your shopping cart - 2 items";    //verify 2 items in cart
        String shoppingcartReal = shoppingPage.verifyQuantityIsTwo();
        softAssert.assertEquals( shoppingCartText, shoppingcartReal);
        softAssert.assertTrue( true );
        String subTotalText = "Subtotal: $59.98";                 //verify subtotal
        String subTotalTextReal = shoppingPage.verifySubTotal();
        softAssert.assertEquals( subTotalText, subTotalTextReal);
        softAssert.assertTrue( true );
        Thread.sleep(2000);
        String totalText = "$67.59";                     //verify Total
        String totalTextActual = shoppingPage.verifyTotalFor();
        softAssert.assertEquals( totalText, totalTextActual);
        softAssert.assertTrue( true );
        shoppingPage.clickingOnCheckOut();
        String logText = "Log in to your account";                   //verify login account page
        String logTextReal = shoppingPage.verifyLoginPage();
        Assert.assertEquals( logText, logTextReal);
        softAssert.assertTrue( true );
        shoppingPage.enterEmailId("primetime21@gmail.com");
        shoppingPage.clickOnContinueButton();
        String secureText = "Secure Checkout";                            //verify secure checkout text
        String secureTextReal = shoppingPage.verifysecurePagetext();
        softAssert.assertEquals( secureText, secureTextReal);
        softAssert.assertTrue( true );
        shoppingPage.enterFirstName("Mark");
        shoppingPage.enterlastName("everyone");
        shoppingPage.enterAddress("34,Performnce bay");
        shoppingPage.clearCityAndAddvalue("London");
        shoppingPage.selectdropDownvalueForCountry("GB");
        shoppingPage.enterState("Harrow");
        shoppingPage.clearPostcodeAndAddValue("HA4 9JD");
        Thread.sleep(1000);
        shoppingPage.clickOnCheckBoxField();
        shoppingPage.enterPassword("myorder4");
        Thread.sleep(1000);
        shoppingPage.selectLocalDelieveryMethod();
        Thread.sleep(2000);
        shoppingPage.selectPaymentMethod();
        String expectedTotal = "$66.53";                  //verify total
        String actualTotal = shoppingPage.verifyTotal();
        softAssert.assertEquals( actualTotal,expectedTotal);
        softAssert.assertTrue( true );
        Thread.sleep( 3000 );
        shoppingPage.clickOnOrderButton();
        String thankyouText = "Thank you for your order";    //verifying thank you page
        String thankyouTextReal = shoppingPage.verifyThankYouText();
        softAssert.assertEquals( thankyouText, thankyouTextReal);
        softAssert.assertTrue( true );
        softAssert.assertAll();
    }
    @Test(groups = {"regression"})
    public void  verifyThatUserShouldClearShoppingCartSuccessfully()throws InterruptedException {
        shoppingPage.MouseHoverOnHotDeals();
        shoppingPage.selectHotdealsBestSeller();
        Thread.sleep(2000);
        String saleMsg = "Bestsellers";
        String actualSalesMsg = shoppingPage.verifyBestSellerText();
        Assert.assertEquals(actualSalesMsg,saleMsg,"User Is Not On Best Sellers Page" );
        softAssert.assertTrue(true);
        shoppingPage.hoverOnSortBy();
        shoppingPage.clickOnAtoZfromSortBy();
        Thread.sleep(2000);
        shoppingPage.getVinzProducts();
        String expectedCartMsg = "Product has been added to your cart";   //assert for add to cart
        String actualCartMsg = shoppingPage.getProductAddedMessage2();
        Assert.assertEquals(actualCartMsg,expectedCartMsg);
        softAssert.assertTrue(true);
        Thread.sleep(3000);
        shoppingPage.getXSign2();
        shoppingPage.getClickOnYourCart2();
        shoppingPage.getClickOnViewCart2();
        Thread.sleep(2000);
        String shopCartMsg = "Your shopping cart - 1 item";
        String realCartMsg = shoppingPage.getProductOneAddedMsg();
        Assert.assertEquals(realCartMsg,shopCartMsg);
        softAssert.assertTrue(true);
        shoppingPage.getEmptyCart2();
        String emptyCartMsg = "Are you sure you want to clear your cart?";
        String realEmptyCartMsg = driver.switchTo().alert().getText();//to get text which we can not inspect
        Assert.assertEquals(realEmptyCartMsg, emptyCartMsg);
        softAssert.assertTrue(true);
        driver.switchTo().alert().accept();//when ok is also not inspected
        String empryCartMsg = "Item(s) deleted from your cart";            //checking green bar message
        String actualEmptyCartMsgIs =shoppingPage.getDeletesMsg();
        Assert.assertEquals(actualEmptyCartMsgIs,empryCartMsg);
        softAssert.assertTrue(true);
        String lastEmptyCartMessage = "Your cart is empty";    //verifying your cart is empty text
        String actualLastEmptyCartMessage = shoppingPage.getLastMessage();
        Assert.assertEquals(actualLastEmptyCartMessage,lastEmptyCartMessage);
        softAssert.assertTrue(true);
    }
}

