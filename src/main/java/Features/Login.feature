Feature: Free CRM login feature

#Scenario: Free CRM login Test scenario
#Given User is already on login page
#When Title of login page is CRMPRO Log In Screen
#Then User enters "meenakshilal" and "passcrm1$"
#And User clicks on login button
#Then User is on home page

Scenario Outline: Free CRM login Test scenario
Given User is already on login page
When Title of login page is CRMPRO Log In Screen
Then User enters "<username>" and "<password>"
And User clicks on login button
Then User is on home page

Examples:
         | username     | passsword |
         | meenakshilal | passcrm@1 |
         | Ross         | test1@    |

#Scenario: create new contact
#Given User already on home page
#When title of the page is CRMPRO
#Then mouse over to contact and click new contact
#Then User enter first name and last name
#Then User clicks on save