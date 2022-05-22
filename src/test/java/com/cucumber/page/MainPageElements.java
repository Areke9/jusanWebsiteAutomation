package com.cucumber.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.sun.xml.bind.v2.model.core.EnumLeafInfo;
import lombok.Getter;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
@Component
public class MainPageElements implements Page{

    //SelenideElement
    @Value("${mainElement.mainTextPath}")
    private String mainPageTextPath;

    public MainPageElements() {}

    private Map<String, SelenideElement> mainPageElement;
    private Map<String, ElementsCollection> mainPageElementList;

    @Override
    public Map<String, SelenideElement> getElements() {
        return mainPageElement;
    }

    @Override
    public Map<String, ElementsCollection> getElementsList() {
        return mainPageElementList;
    }

    @PostConstruct
    public void init(){
        this.mainPageElement = new HashMap<>(){{
            put("mainPageText", $(By.xpath("//div[@class='body-padding']/div[1]/div[1]/div/div/div[1]/h1[1]")));
            put("forBusinessBtn", $(By.xpath("//a[@data-rb-event-key='business']")));
        }};

        this.mainPageElementList = new HashMap<>(){{
            put("customerTypeMenu", $$(By.xpath("//div[@class='no-collapse navbar-collapse collapse']/div[1]/div")));
        }};
    }
}
