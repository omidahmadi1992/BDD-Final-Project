@Smoke @Regression
Feature: Enter with valid username and password and then login to tek insurance app

  Background: Open browser and click on login button
    Given Open browser and navigate to Tek retail app
    When Click on login button

  @Positive_Test
  Scenario: Navigate to tek insurance app and login with valid user name and password
    Then Enter username "supervisor" and password "tek_supervisor"
    Then Click on sign in button
    Then Validate user navigate to Customer Service Portal
    Then Close browser

  @Negative_Test
  Scenario Outline: Navigate and login with invalid user name and password
    Then Enter username "<username>" and password "<password>"
    Then Click on sign in button
    Then Validate error message "<errorMessage>"
    Examples:
      | username        |  | password            |  | errorMessage |
      | wrongSupervisor |  | tek_supervisor      |  | ERROR        |
      | supervisor      |  | WrongTek_supervisor |  | ERROR        |