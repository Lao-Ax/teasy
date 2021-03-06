package com.wiley.autotest.selenium.elements.upgrade.conditions.element;

import com.wiley.autotest.selenium.elements.upgrade.TeasyElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

import javax.annotation.Nullable;

public class ElementHasAnyText implements ExpectedCondition<Boolean> {

    private final TeasyElement element;

    public ElementHasAnyText(TeasyElement element) {
        this.element = element;
    }

    @Nullable
    @Override
    public Boolean apply(@Nullable WebDriver driver) {
        return element.getText() != null && !element.getText().trim().equals("");
    }

    @Override
    public String toString() {
        return String.format("Element has no text,");
    }
}
