#Author: Faruq
#Keywords Summary :smoke tag is for smoke suites

@smoke
Feature: Login Feature

  @login
  Scenario: valid user name and password 
   Given user open browser and application
    When user enter userName
    And user enter password
    And user click on login button
    Then I validate the landing page

  @loginDataTable
 Scenario Outline: Title of your scenario outline
    Given <user> open browser and app
    When user enter valid <userName>
    And user enter valid <password>
    Then I validate the landing page

    Examples: 
      | user    | userName   | password   |
      | 'faruq' | 'faruq123' | 'faruq321' |
      | 'molla' | 'molla123' | 'molla321' |
