package com.nopcommerce.demo.testng;

import org.testng.annotations.Test;

public class TestNGGrouping {


    @Test(groups = {"smoke","sanity","regression"})
    public void verifyProductArrangeInAlphabaticalOrder(){
        System.out.println("Product Arrange In Alphabatical Order");
    }
    @Test(groups = {"sanity","regression"})
    public void verifyProductAddedToshoppingCartSuccessfully(){
        System.out.println("User add the product successfully in shopping cart");
    }
}
