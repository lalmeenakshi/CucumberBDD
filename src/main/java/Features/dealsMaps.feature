Feature: Free CRM create new deals
Scenario: create new deals

Given User is already on login page
When Title of login page is CRMPRO Log In Screen
Then User enters username and password
| username     | password |
| meenakshilal | passcrm1$ |
And User clicks on login button
Then User is on home page
Then User move to deals
Then User enters deals details
|title       | amount | probability| 
| test deal4 | 80     | 70         |
| test deal5 | 70     | 50         |
#Then User save the details
Then quit browser