package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {


    By addtocart = By.xpath("//div[@class='item-box'][1]//button[text()='Add to cart']");
    By buildOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectProcesser = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.ByLinkText.xpath("//select[@id='product_attribute_2']");
    By hddRadio = By.xpath("//dd[@id='product_attribute_input_3']//label[text()='400 GB [+$100.00]']");
    By oSRadio = By.xpath("//input[@id='product_attribute_4_9']");
    By software = By.xpath("//input[@id='product_attribute_5_10']");
    By softwareclick = By.xpath("//input[@id='product_attribute_5_12' and @ name='product_attribute_5']");
    By verifyPrice = By.xpath("//span[@id='price-value-1']");
    By clickAddCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyShoppingCart = By.xpath("//p[text()='The product has been added to your ']");
    By clickonGreenBar = By.xpath("//span[@class='close']");


    public void addToCart() {
        Reporter.log("clicking on add to cart " + addtocart.toString() + "<br>");
        clickOnElement(addtocart);
    }

    public String buildyourownComputertext() {
        Reporter.log("Verify User Navigate to Build your own Computer text " + buildOwnComputerText.toString() + "<br>");
        return getTextFromElement(buildOwnComputerText);
    }

    public void setselectProcesserFromDropDownMenu(int value) {
        Reporter.log("select the processor from drop down " + selectProcesser.toString() + "<br>");
        selectByIndexFromDropDown(selectProcesser, value);
    }

    public void setSelectRam(int value) {
        Reporter.log("select the Ram from drop down " + selectRam.toString() + "<br>");
        selectByIndexFromDropDown(selectRam, value);
    }

    public void clickOnHdd(String HDD) {
        Reporter.log("click On Hdd  " + hddRadio.toString() + "<br>");
        clickOnElement(hddRadio);
    }

    public void clickOnOsRadio(String osRadio) {
        Reporter.log("clicking on Os Radio " + oSRadio.toString() + "<br>");
        clickOnElement(oSRadio);
    }

    public void clickMicrosoftoffice(String software1) {
        Reporter.log("clicking on Microsoftoffice " + software.toString() + "<br>");
        clickOnElement(software);
        clickOnElement(software);
    }

    public void clickOnSoftwareTotalCommander(String software2) {
        Reporter.log("clicking on Total Commander " + softwareclick.toString() + "<br>");
        clickOnElement(softwareclick);

    }

    public String setVerifyPrice() {
        Reporter.log("verify Price $1475.00 " + verifyPrice.toString() + "<br>");
        return getTextFromElement(verifyPrice);
    }

    public void setclickAddCartButton() {
        Reporter.log("click add to cart " + clickAddCart.toString() + "<br>");
        clickOnElement(clickAddCart);
    }

    public String verifyShoppingCartText() {
        Reporter.log("verify Shopping Cart Text " + verifyShoppingCart.toString() + "<br>");
        return getTextFromElement(verifyShoppingCart);
    }

    public void clickOnCrossGreenBar() {
        Reporter.log("Click on Cross On Green Bar " + clickonGreenBar.toString() + "<br>");

        clickOnElement(clickonGreenBar);
    }

}
