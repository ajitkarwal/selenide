package com.codeborne.selenide.collections;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.function.Predicate;

public class AllMatch extends PredicateCollectionCondition {
  public AllMatch(String description, Predicate<WebElement> predicate) {
    super("all", description, predicate);
  }

  @Override
  public boolean test(List<WebElement> elements) {
    if (elements.isEmpty()) {
      return false;
    }
    return elements.stream().allMatch(predicate);
  }
}
