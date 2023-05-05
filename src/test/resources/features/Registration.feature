#Author: your.email@your.domain.com
@tag
Feature: Registration page

  @tag1
  Scenario: I want to build a registration page so that I can collect users
    Given User open app
    When I complete registration page
    And I submit the app
    Then I should be registered
