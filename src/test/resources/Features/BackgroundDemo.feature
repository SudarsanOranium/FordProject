Feature: search page functionality

Background:

Given User is on the amazon login page
When  User enters the username and password
Then 	User is on search page

Scenario: Validatig search page
Given User is on the search item page
When  User enters the item to search
Then  User adds the item to the cart

Scenario: Validatig cart page
Given User is on the cart item page
When  User clicks the proceed to checkout
Then  User is in the payment page