#CreateUser2.feature
Feature: Create User

  Scenario: To Create a new User using the existing user account
    Given Chrome is opened & Login Page is dispalyed
    When user enters login details
    And Click on Login
    And Click on Administration
    And Click on Database Users
    And Click on Create
    And Enter New Username & new Password & Confirm Password
      | UserName | Pass        | cPass    |
      | Shruti         | shruti12    | shruti12 |
    And Clicked on create button
    Then Message Should be displayed that new user is created
