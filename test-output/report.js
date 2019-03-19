$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Kumar/eclipse-workspace/CucumberBDDFramework/src/main/java/Features/taggedhooks.feature");
formatter.feature({
  "line": 1,
  "name": "Test Tagged Hooks",
  "description": "",
  "id": "test-tagged-hooks",
  "keyword": "Feature"
});
formatter.before({
  "duration": 271764,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "This is Second test",
  "description": "",
  "id": "test-tagged-hooks;this-is-second-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Second"
    },
    {
      "line": 8,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "this is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "this is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "this is the third step",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedHooksStepDefinition.this_is_the_first_step()"
});
formatter.result({
  "duration": 182539615,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefinition.this_is_the_second_step()"
});
formatter.result({
  "duration": 52547,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefinition.this_is_the_third_step()"
});
formatter.result({
  "duration": 53778,
  "status": "passed"
});
formatter.after({
  "duration": 46388,
  "status": "passed"
});
formatter.after({
  "duration": 49673,
  "status": "passed"
});
});