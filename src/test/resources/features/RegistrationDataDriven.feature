@Regression
Feature: Data driven Registration page

  @DataDrivenReg
  Scenario Outline: Registration page for multiple users
    Given user open facebook homepage
    When user enter <firstName> and <lastName>
    And user enter <mobileNumber>
    And user enter <month> and <day> and <year>
    And user select gender
    And user click reg button
    Then I verify registration page is created

    Examples: 
      | firstName | lastName | mobileNumber | month | day  | year   |
      | "Tania1 " | "Khan1"  | "778809"     | "jan" | "12" | "2002" |
      | "Tania2 " | "Khan2"  | "778809"     | "jan" | "12" | "2002" |
      | "Tania3 " | "Khan3"  | "778809"     | "jan" | "12" | "2002" |
      | "Tania4 " | "Khan4"  | "778809"     | "jan" | "12" | "2002" |
