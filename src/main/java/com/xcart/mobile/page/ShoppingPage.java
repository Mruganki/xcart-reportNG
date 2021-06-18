package com.xcart.mobile.page;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ShoppingPage extends Utility {
    By HotDeals = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/span");
    By saleLInk = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[1]/a/span");
    By TextSale = By.xpath("//h1[@id='page-title']");
    By sortBy = By.xpath("//span[@class='sort-by-label']");
    By productAtoZ = By.xpath("//*[@id=\"XLite-Module-CDev-Sale-View-SalePage-sortby-1\"]/li[5]/a");
    By avengers = By.xpath("//img[@alt='Avengers: Fabrikations Plush [Related Products]']");
    By checkBox = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div[4]/div[3]/ul/li[2]/label/div/input[2]");
    By clickOnAddToCart = By.xpath( "//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/form[2]/div[2]/div[1]/div[3]/button[1]" );
    By verifyGreenBarText = By.xpath( "//li[text()='Product has been added to your cart']" );
    By clickOnClose = By.xpath( "//a[@class='close']" );
    By clickOnYourCart = By.xpath( "//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']" );
    By clickOnViewCart = By.xpath( "//a[@class='regular-button cart']" );
    By yourShoppingCartText = By.id( "page-title" );
    By clearQuantity = By.id( "amount16" );
    By clickOnQuantity = By.id( "amount16" );
    By addQuantity = By.id( "amount16" );
    By quantityIs2 = By.xpath( "//h1[text()='Your shopping cart - 2 items']" );
    By subtotal = By.xpath( "//span[@class='cart-subtotal']/parent::li/ancestor::ul" );
    By total = By.xpath( "//li[@class='total']" );
    By clickcheckOut = By.xpath( "//span[text()='Go to checkout']" );
    By loginPageText = By.xpath( "//h3[text()='Log in to your account']" );
    By emailField = By.id( "email" );
    By clickContinue = By.xpath( "//button[@class='btn  regular-button anonymous-continue-button submit']" );
    By secureText = By.xpath( "//h1[@class='title']" );
    By firstNameField = By.id( "shippingaddress-firstname" );
    By lastNameField = By.id( "shippingaddress-lastname" );
    By addressField = By.id( "shippingaddress-street" );
    By city = By.id( "shippingaddress-city" );
    By dropDownValueForCountry = By.id( "shippingaddress-country-code" );
    By stateValue = By.id( "shippingaddress-custom-state" );
    By postCodeValue = By.id( "shippingaddress-zipcode" );
    By selectcheckBox = By.id( "create_profile" );
    By passwordvalue = By.id( "password" );
    By shippingmethod = By.id("method128");
    By paymentMethod = By.id( "pmethod6" );
    By totalText = By.xpath("//div[@class='total clearfix']");
    By placeOrderButton = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]");
    By thankyouText = By.xpath("//h1[text()='Thank you for your order']");
    By clickOnBestSeller=By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[2]/a/span");
    By mouseHoverOnSortBy2=By.xpath("//span[@class='sort-by-label']");
    By selectAToZ=By.xpath("//*[@id=\"XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1\"]/li[4]/a");
    By hoverOnVinzProduct=By.xpath("//img[@alt='Vinyl Idolz: Ghostbusters']");
    By clickOnVinzProducts=By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']");
    By veryFyProductAddedMsg2=By.xpath("//li[text()='Product has been added to your cart']");
    By clickOnXSig2= By.xpath("//a[@class='close']");
    By clickOnYourCart2=By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']");
    By clickOnViewCart2=By.xpath("//a[@class='regular-button cart']");
    By veryFyoneItemMsg=By.id("page-title");
    By clickOnEmptyCart=By.xpath("//a[text()='Empty your cart']");
    By itemsDeletedFromCart=By.xpath("//li[text()='Item(s) deleted from your cart']");
    By lastMessage=By.xpath("//h1[text()='Your cart is empty']");
    By verifyBestSellerText=By.xpath("//h1[@id='page-title']");
    By productAtoZBestseller= By.xpath("//*[@id=\"XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1\"]/li[4]/a");



    public void MouseHoverOnHotDeals(){
    Reporter.log("Mouse Hover on HotDeals"+HotDeals.toString()+"<br>");
    mouseHoverToElement(HotDeals);
}
public void clickOnSale(){
    Reporter.log("click on Sales Link"+saleLInk.toString()+"<br>");
    clickOnElement(saleLInk);
}
public String verifySalesText(){
Reporter.log("Verify Sales text"+TextSale.toString()+"<br>");
return getTextFromElement(TextSale);
}
public void hoverOnSortBy(){
    Reporter.log("Hover on SortBy"+sortBy.toString()+"<br>");
    mouseHoverToElement(sortBy);
}
public void clickOnAtoZ(){
    Reporter.log("click on product AtoZ order"+productAtoZ.toString()+"<br>");
    clickOnElement(productAtoZ);
}
public void clickOnAvengers(){
    Reporter.log("click on product AtoZ order"+avengers.toString()+"<br>");
    clickOnElement(avengers);
}
public void getClickOnCheckBox(){
    Reporter.log("click on checkbox"+checkBox.toString()+"<br>");
    clickOnElement(checkBox);
}
    public void clickOnAddToCartOfproduct() {
        Reporter.log( "clicking On add to cart button" + clickOnAddToCart.toString() );
        clickOnElement( clickOnAddToCart );

    }

    public String verifyTextFromGreenbar() {
        Reporter.log( "Verifying Text From Green Bar " + verifyGreenBarText.toString() );
        return getTextFromElement( verifyGreenBarText );
    }

    public void clickToCloseBar() {
        Reporter.log( "click on close bar" + clickOnClose.toString() );
        clickOnElement( clickOnClose );
    }
    public void clickOnYourCartAndViewCart() {
        Reporter.log( "clicking on your cart and view cart " + clickOnYourCart.toString() + clickOnViewCart.toString() );
        clickOnElement( clickOnYourCart );
        clickOnElement( clickOnViewCart );
    }
    public String verifyYourShoppingcarttext() {
        Reporter.log( "Verifying Quantity " + yourShoppingCartText.toString() );
        return getTextFromElement( yourShoppingCartText );
    }
  public void modifyQuntity(){
    driver.findElement(clearQuantity).clear();
    driver.findElement(clickOnQuantity).click();
    sendTextToElement(addQuantity,"2");
  }
  public String verifyQuantityIsTwo() {
        Reporter.log( "Verifying Quantity after changing " + quantityIs2.toString() );
        return getTextFromElement( quantityIs2 );
    }
    public String verifySubTotal() {
        Reporter.log( "Verifying Subtotal " + subtotal.toString() );
        return getTextFromElement( subtotal );
    }
    public String verifyTotalFor() {
        Reporter.log("Verifying total " + total.toString());
        return getTextFromElement(total);
    }
    public void clickingOnCheckOut() {
        Reporter.log("clicking On checkout" + clickcheckOut);
        clickOnElement(clickcheckOut);
    }
    public String verifyLoginPage() {
        Reporter.log("Verifying login page text " + loginPageText.toString());
        return getTextFromElement(loginPageText);
    }
    public void enterEmailId(String email) {
        Reporter.log( "Enter email id  " + email + "to email field" + emailField.toString() + "<br>" );
        sendTextToElement( emailField, email );
    }

    public void clickOnContinueButton() {
        Reporter.log( "Click on Continue button" + clickContinue.toString() + "<br>" );
        clickOnElement( clickContinue );

    }

    public String verifysecurePagetext() {
        Reporter.log( "Verifying secure page text " + secureText.toString() );
        return getTextFromElement( secureText );

    }

    public void enterFirstName(String firstName) {
        Reporter.log( "Enter first name  " + firstName + "to firstname field" + firstNameField.toString() + "<br>" );
        sendTextToElement( firstNameField, firstName );
    }

    public void enterlastName(String lastName) {
        Reporter.log( "Enter email id  " + lastName + "to lastname field" + lastNameField.toString() + "<br>" );
        sendTextToElement( lastNameField, lastName );
    }

    public void enterAddress(String address) {
        Reporter.log( "Enter email id  " + address + "to address field" + addressField.toString() + "<br>" );
        sendTextToElement( addressField, address );
    }

    public void clearCityAndAddvalue(String ciTy) {
        Reporter.log( "Enter email id  " + ciTy + "to city" + city.toString() + "<br>" );
        driver.findElement( city ).clear();
        sendTextToElement( city, ciTy );
    }

    public void selectdropDownvalueForCountry(String country) {
        Reporter.log( "Enter email id  " + "to country" + dropDownValueForCountry.toString() + "<br>" );
        selectByvalueFromDropDown(dropDownValueForCountry,country);
    }

    public void enterState(String state) {
        Reporter.log( "Enter state " + state + "to state field" + stateValue.toString() + "<br>" );
        sendTextToElement( stateValue, state );

    }

    public void clearPostcodeAndAddValue(String postCode) {
        Reporter.log( "Enter post code " + postCode + "to postcode" + postCodeValue.toString() + "<br>" );
        driver.findElement( postCodeValue ).clear();
        sendTextToElement( postCodeValue, postCode );

    }
    public void clickOnCheckBoxField() {
        Reporter.log("click on checkbox" +selectcheckBox.toString());
        clickOnElement(selectcheckBox);
    }
    public void enterPassword(String password) {
        Reporter.log( "Enter password  " + password+ "to password field" + passwordvalue.toString() + "<br>" );
        sendTextToElement( passwordvalue,password);
    }
    public void selectLocalDelieveryMethod() {
        Reporter.log("mouse hover and click on delievery method" + shippingmethod.toString());
        mouseHoverToElement(shippingmethod);
        clickOnElement(shippingmethod);
    }
    public void selectPaymentMethod(){
        Reporter.log( "mouse hover and click on payment method" + paymentMethod.toString() );
        mouseHoverToElement(paymentMethod);
        clickOnElement( paymentMethod);
    }
    public  String verifyTotal(){
        Reporter.log( "Verifying total " +totalText .toString() );
        return getTextFromElement(totalText );

    }
    public void clickOnOrderButton(){
    Reporter.log("clicking on Place Order button"+placeOrderButton.toString()+"<br>");
    clickOnElement(placeOrderButton);
    }
    public String verifyThankYouText(){
    Reporter.log("Verifying Thankyou text"+thankyouText.toString()+"<br>");
    return getTextFromElement(thankyouText);
    }

// clearshoppingcart sucessfully()
    public void selectHotdealsBestSeller(){
        Reporter.log("Click on bestseller:" + clickOnBestSeller.toString() + "<br>");
        clickOnElement(clickOnBestSeller);
    }
    public String verifyBestSellerText(){
        Reporter.log("getting best seller message" + verifyBestSellerText.toString() + "<br>");
        return getTextFromElement(verifyBestSellerText);
    }
    public void clickOnAtoZfromSortBy() {
        Reporter.log("click on product AtoZ order" + productAtoZBestseller.toString() + "<br>");
        clickOnElement(productAtoZBestseller);
    }
    public void getVinzProducts(){
        Reporter.log("Click on Vinz products:" + clickOnVinzProducts.toString() + "<br>");
        mouseHoverToElement(clickOnVinzProducts);
        clickOnElement(clickOnVinzProducts);
    }
    public String getProductAddedMessage2() {
        Reporter.log("getting product added message" + veryFyProductAddedMsg2.toString() + "<br>");
        return getTextFromElement(veryFyProductAddedMsg2);
    }
    public void getXSign2() {
        Reporter.log("Click on X sign" + clickOnXSig2.toString() + "<br>");
        clickOnElement(clickOnXSig2);
    }
    public void getClickOnYourCart2(){
        Reporter.log("Click on your cart sign" + clickOnYourCart2.toString() + "<br>");
        clickOnElement(clickOnYourCart2);
    }
    public void getClickOnViewCart2(){
        Reporter.log("Click on view cart sign" + clickOnViewCart2.toString() + "<br>");
        clickOnElement(clickOnViewCart2);
    }
    public String getProductOneAddedMsg() {
        Reporter.log("Product added" + veryFyoneItemMsg.toString() + "<br>");
        return getTextFromElement(veryFyoneItemMsg);
    }
    public void getEmptyCart2(){
        Reporter.log("Click on empty cart sign" + clickOnEmptyCart.toString() + "<br>");
        clickOnElement(clickOnEmptyCart);
    }
    public String getDeletesMsg(){
        Reporter.log("Items deleted msg" + itemsDeletedFromCart.toString() + "<br>");
        return getTextFromElement(itemsDeletedFromCart);

    }
    public String getLastMessage() {
        Reporter.log("Last message" + lastMessage.toString() + "<br>");
        return getTextFromElement(lastMessage);
    }

}
