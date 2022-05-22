package com.cucumber.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;

@Getter
@Component
public class BasePage implements Page {



    private final Map<String, SelenideElement> elements = new HashMap<String, SelenideElement>() {{
        put("elemSearchFromBasePage", $(By.id("search-form-btn")));
        put("searchTextField", $(By.id("search-form-field")));

    }};

    @Override
    public Map<String, ElementsCollection> getElementsList() {
        return null;
    }
}
