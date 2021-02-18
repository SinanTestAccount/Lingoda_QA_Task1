
  Feature: Step-1: Open Polymer Page

    Scenario: User should be able to open polymer page
      Given User should load to website
      When User should click "JavaScript" tab
      And User should select Polymer link
      Then User should see "Polymer" page

