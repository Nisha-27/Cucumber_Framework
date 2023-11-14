Feature: Login functionality check for Orange HRM page

Background: 
Given Go to orange HRM page 

Scenario: Login to Orange HRM page
When user enters the username in username field
And user enters password in password field
And user click Login button on login page
Then User should be on  page


Scenario: Login to Orange HRM page
When user enters the username as "Admin" in username field
And user enters password as "admin123" in password field
And user click Login button on login page
Then User should be on  page

@Regression
Scenario Outline: Login to Orange HRM page

When user enters the username as "<uname>" in username field
And user enters password as "<password>" in password field
And user click Login button on login page
Then User should be on  page

Examples:

|uname|password|
|abi|1234n|
|Admin|admin123|
|nisha|admin456|
