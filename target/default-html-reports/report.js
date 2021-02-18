$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/PolymerPage.feature");
formatter.feature({
  "name": "Step-2/3: Add Todo Items and Edit",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User should load to website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.HomePageStepDefinitions.user_should_load_to_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click \"JavaScript\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.HomePageStepDefinitions.user_should_click_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select Polymer link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HomePageStepDefinitions.user_should_select_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see \"Polymer\" page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.HomePageStepDefinitions.user_should_see_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As a user, I should able to add todo items",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "User should add two todo items",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.PloymerPageStepDefinition.user_should_add_two_todo_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to edit second item",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.PloymerPageStepDefinition.user_should_be_able_to_edit_second_item()"
});
formatter.result({
  "status": "passed"
});
});