Feature: Validating the search bar

Scenario Outline: Validating the search bar with the iphone
Given User is on home page
When  User enters the "<mobiles>" in the search bar
Then  User is on the mobile page

Examples:
| mobiles|
| iphone | 
| redmi  |
| realme |
| samsung|


