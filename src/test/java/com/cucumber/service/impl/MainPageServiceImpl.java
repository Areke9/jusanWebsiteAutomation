package com.cucumber.service.impl;

import com.codeborne.selenide.SelenideElement;
import com.cucumber.exception.ElementComparisonException;
import com.cucumber.page.MainPageElements;
import com.cucumber.service.CommonService;
import com.cucumber.service.MainPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainPageServiceImpl extends CommonService implements MainPageService{

    @Autowired
    private MainPageElements mainPageElements;

    @Override
    public void checkMainPageText(String text) {
        String mText = getText(mainPageElements, "mainPageText");

        if(mText.contains(text)){
            System.out.println("Main page top text: " + mText);
        }
        else {
            throw new ElementComparisonException();
        }
    }

    @Override
    public void switchCustomer(String customer) {
        clickElementFromList(mainPageElements.getElementsList(), "customerTypeMenu", customer);
    }
}
