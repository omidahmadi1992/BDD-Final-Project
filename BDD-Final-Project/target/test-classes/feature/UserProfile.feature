@Smoke @Regression
Feature: Navigate to Customer Service Portal and Validate the information's in Profile Side Drawer are correct.

  Background: User should be able to open browser and sign in with credentials
    Given Open browser and navigate to Tek retail app
    When Click on login button
    When Enter username "supervisor" and password "tek_supervisor"
    Then Click on sign in button
    Then Click on profile button

  @User_Profile_Scenario_2
  Scenario: Click on Logout button and make sure user logged out and navigate to home page
    Then click on Logout button
    Then Close browser