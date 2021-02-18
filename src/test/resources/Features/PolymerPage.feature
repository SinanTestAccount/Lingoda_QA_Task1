Feature: Step-2/3: Add Todo Items and Edit

  Background:
    Given User should load to website
    When User should click "JavaScript" tab
    And User should select Polymer link
    And User should see "Polymer" page

  @wip
  Scenario: As a user, I should able to add todo items
    And User should add two todo items
    Then User should be able to edit second item
