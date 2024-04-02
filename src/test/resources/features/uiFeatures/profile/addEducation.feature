@UI
Feature: us_001

  Scenario: As a user, after entering valid information, I should be able to add education on the Profile Page

    Given User accesses the home page successfully
    Then User accesses the profile page successfully
    And User clicks add new education button
    Then User fills in the boxes School Name Department Start Date
      | KesifPlus | IT | 01/01/2024 |
    And User clicks save button
    Then User should see the added education under the education heading
