#Test data driven
Feature: Free CRM create new deals
Scenario: create new deals

Given User is already on login page
When Title of login page is CRMPRO Log In Screen
Then User enters username and password
| meenakshilal | passcrm1$ |
And User clicks on login button
Then User is on home page
Then User move to deals
Then User enters deals details
| test deal1 | 20 | 40 |
| test deal2 | 30 | 50 |
Then User save the details
Then quit browser