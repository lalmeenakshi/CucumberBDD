$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Kumar/eclipse-workspace/CucumberBDDFramework/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM login Test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of login page is Cogmento CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters username",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enters password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginstepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 12118217604,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.title_of_login_page_is_Cogmento_CRM()"
});
formatter.result({
  "duration": 23416259,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_enters_username()"
});
formatter.result({
  "duration": 150218169,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_enters_password()"
});
formatter.result({
  "duration": 107422257,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 99220964,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 3015164471,
  "status": "passed"
});
});