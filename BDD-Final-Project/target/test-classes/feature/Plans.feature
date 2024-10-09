@Smoke @Regression
Feature: Login with CSR Credentials and Validate Plans Page

  Background: Open browser and navigate to retail app and click on buttons
    Given Open browser and navigate to Tek retail app
    When Click on login button
    Then Enter username "supervisor" and password "tek_supervisor"
    Then Click on sign in button
    When Click on plans

  @Plans_Scenario_1
  Scenario: Navigate to Customer Service Portal with valid CSR credentials and navigate to Plans Page. Validate 4 row of data is present.
    Then Validate 4 row of the data is present
    Then Close browser

  @Plans_Scenario_2
  Scenario: Navigate to Customer Service Portal with valid CSR credentials and navigate to Plans Page. Then validate
  Create Date is today's date in (EST Time zone) and Date Expire is a day after (EST Time Zone)
    Then Validate create date is today's date EST Time Zone
    Then Validate expire date is day after EST Time Zone
    Then Close browser