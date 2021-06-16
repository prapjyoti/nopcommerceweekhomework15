package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {


    By computerLink = By.linkText("Computers");
    By electronicsLink = By.linkText("Electronics");
    By apparelLink = By.linkText("Apparel");
    By digitalDownloadsLink = By.linkText("Digital downloads");
    By booksLink = By.linkText("Books");
    By jewelryLink = By.linkText("Jewelry");
    By giftcardsLink = By.linkText("Gift Cards");

    public void clickOnComputerLink() {
        Reporter.log("clicking on Computer link " + computerLink.toString() + "<br>");
        clickOnElement(computerLink);
    }

    public void clickOnElectroniceLink() {
        Reporter.log("clicking on Electronice link " + electronicsLink.toString() + "<br>");
        clickOnElement(electronicsLink);
    }

    public void clickOnApparelLink() {
        Reporter.log("clicking on Apparel link " + apparelLink.toString() + "<br>");
        clickOnElement(apparelLink);
    }

    public void clickOnDigitalDownloadLink() {
        Reporter.log("clicking on Digital downloads link " + digitalDownloadsLink.toString() + "<br>");
        clickOnElement(digitalDownloadsLink);
    }

    public void clickOnBooksLink() {
        Reporter.log("clicking on Books link " + booksLink.toString() + "<br>");
        clickOnElement(booksLink);
    }

    public void clickOnJewlryLink() {
        Reporter.log("clicking on Jewelry link " + jewelryLink.toString() + "<br>");
        clickOnElement(jewelryLink);
    }

    public void clickOnGiftCards() {
        Reporter.log("clicking on Gift cards link " + giftcardsLink.toString() + "<br>");
        clickOnElement(giftcardsLink);
    }

}




