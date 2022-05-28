package com.cucumber.steps;

import com.cucumber.service.BasePageService;
import com.cucumber.service.MainPageService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;


public class MainPageStep {
    //main page steps

    @Autowired
    private BasePageService basePageService;

    @Autowired
    private MainPageService mainPageService;

    @Given("check website main page text '(.*)'")
    public void checkWebsiteMainPageText(String mainText){
        mainPageService.checkMainPageText(mainText);
    }

    @Given("input text in to search field {string}")
    public void inputTextInToSearchField(String text) {
        basePageService.searchArticle(text);
    }

    @Then("switch to customer type '(.*)'")
    public void switchToCustomerType(String customerType){
        mainPageService.switchCustomer(customerType);
    }
}

