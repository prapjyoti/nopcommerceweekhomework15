package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class TopMenuPage extends Utility {

    HomePage homePage = new HomePage();

    By verifyComputerPage = By.partialLinkText("Compute");
    By verifyElectronicsPage = By.partialLinkText("Electroni");
    By verifyApparelPage = By.partialLinkText("Appar");
    By verifyDigitalDowanloadPage = By.partialLinkText("Digital downloa");
    By verifyBooksPage = By.partialLinkText("Books");
    By verifyJewelryPage = By.partialLinkText("Jewel");
    By verifyGiftsCards = By.partialLinkText("Gift Car");

    public void selectMenu(String menu) throws InterruptedException {
        Thread.sleep(1000);
        if (menu == "Computers") {
            homePage.clickOnComputerLink();

        } else if (menu == "Electronics") {
            homePage.clickOnElectroniceLink();
        } else if (menu == "Apparel") {

            homePage.clickOnApparelLink();
        } else if (menu == "Digital downloads") {

            homePage.clickOnDigitalDownloadLink();
        } else if (menu == "Books") {

            homePage.clickOnBooksLink();

        } else if (menu == "Jewelry") {

            homePage.clickOnJewlryLink();
        } else if (menu == "Gift Cards") {
            homePage.clickOnGiftCards();
        }

    }

    public String verifyComputerPages() {
        Reporter.log("Verify user navigate to computer page successfully " + verifyComputerPage.toString() + "<br>");
        return getTextFromElement(verifyComputerPage);
    }

    public String verifyElectronicsPages() {
        Reporter.log("Verify user navigate to electronics page successfully " + verifyElectronicsPage.toString() + "<br>");
        return getTextFromElement(verifyElectronicsPage);
    }

    public String verifyAppearlPages() {
        Reporter.log("Verify user navigate to apparel page successfully " + verifyApparelPage.toString() + "<br>");
        return getTextFromElement(verifyApparelPage);
    }

    public String verifydigitalDowanload() {
        Reporter.log("Verify user navigate to digital downloads page successfully " + verifyDigitalDowanloadPage.toString() + "<br>");
        return getTextFromElement(verifyDigitalDowanloadPage);
    }

    public String verifyBooksPages() {
        Reporter.log("Verify user navigate to books page successfully " + verifyBooksPage.toString() + "<br>");
        return getTextFromElement(verifyBooksPage);
    }

    public String verifyJewlrypages() {
        Reporter.log("Verify user navigate to jewelry page successfully " + verifyJewelryPage.toString() + "<br>");
        return getTextFromElement(verifyJewelryPage);
    }

    public String verifyGiftcardsPages() {
        Reporter.log("Verify user navigate to giftcards page successfully " + verifyGiftsCards.toString() + "<br>");
        return getTextFromElement(verifyGiftsCards);
    }
}
