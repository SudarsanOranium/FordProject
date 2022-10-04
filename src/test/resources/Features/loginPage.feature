Feature: Validating the login page

Scenario: Validating with the valid credentials
Given User is on the facebook login page
When  User enters enter the valid username and password
| username      | password|
| abc@gmail.com | abc@123 | 
And   User clicks the login button
Then  User is on the home page






