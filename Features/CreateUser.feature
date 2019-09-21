Feature: Create User

  Scenario: To Create a new User using the existing user account
    Given Chrome is opened & Login Page is dispalyed
    When user enters "sys"  & "newuser123"
    
    And Click on Login
    And Click on Administration
    And Click on Database Users
    And Click on Create
    And Enter New Username & new Password & Confirm Password
    And Clicked on create button
    Then Message Should be displayed that new user is created
