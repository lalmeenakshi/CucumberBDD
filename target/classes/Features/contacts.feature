Feature: Free CRM create new contacts
Scenario Outline: create new contacts

Given User is already on login page
When Title of login page is CRMPRO Log In Screen
Then User enters "<username>" and "<password>"
And User clicks on login button
Then User is on home page
Then User move to contacts
Then User enters contact details "<firstname>" and "<lastname>" and "<position>"
Then User save the details
Then close the browser

Examples:
| username     | password  | firstname | lastname | position |
| meenakshilal | passcrm1$ | Ross      | Gellar   | Doctor   |
| meenakshilal | passcrm1$ | Chandlar  | Bing     | Chef     |
| meenakshilal | passcrm1$ | Racheal   | Green    | Designer |
| meenakshilal | passcrm1$ | Joey      | Tribini  | Actor    |


