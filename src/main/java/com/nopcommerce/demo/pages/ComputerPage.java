package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

import java.util.List;

public class ComputerPage extends Utility {


    By desktopsLink = By.linkText("Desktops");
    By selectPosition = By.xpath("//select[@id='products-orderby']");
    By getListofproduct = By.xpath("//h2[@class='product-title']");


    public void clickondesktopslink() {
        Reporter.log("clicking on desktoplink " + desktopsLink.toString() + "<br>");
        clickOnElement(desktopsLink);
    }

    //parameterize method
    public void selectPositionFromdropdown(int value) {
        Reporter.log("selectPositionFromDrown " + selectPosition.toString() + "<br>");
        selectByIndexFromDropDown(selectPosition, value);
    }

    public List getListFromelements() {
        Reporter.log("getProductList" + getListofproduct.toString() + "<br>");
        return getListfromelements(getListofproduct);

    }


}
