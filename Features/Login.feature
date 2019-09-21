Feature: DB Login

Scenario: To Check Login Functionality with valid user name and valid password

Given Chrome is opened & Login Page is dispalyed 
When user enters username & Password
And Click on Login
Then HomePage Should be displayed 