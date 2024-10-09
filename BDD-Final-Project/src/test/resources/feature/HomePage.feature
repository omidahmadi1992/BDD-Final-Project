@Smoke @Regression
Feature: Validate home page title is exist

  @Smoke
  @HomePageScenario_1
  Scenario: Validate home page title TEK Insurance UI and create Primary Account Button is exist
    Given Open browser and navigate to Tek retail app
    When Validate TEK Insurance UI title is exist
    Then Validate Primary Account Button is exist
    Then Close browser