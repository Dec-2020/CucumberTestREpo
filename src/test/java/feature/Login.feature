@Login
Feature: This feature is use to design the login page of the application

  Background: Open the application
    Given I have opened the application in browser

  @Regression @Rapid
  Scenario: Validate the successful login
    When I click on the login link
    And I enter username
    And I enter password
    And I click on the login button
    Then I should be redirected to the home page

  @Regression
  Scenario: Validate the successful login using test data
    When I click on the login link
    And I enter username "iamneha30@gmail.com"
    And I enter password "Dec@2020"
    And I click on the login button
    Then I should be redirected to the home page

  Scenario Outline: Validate the successful login using multiple test data
    When I click on the login link
    And I enter username "<UserName>"
    And I enter password "<Password>"
    And I click on the login button
    Then I should be redirected to the home page

    Examples: 
      | UserName      | Password  |
      | lmn@gmail.com | lmn@gmail |
      | abc@gmail.com | adc@gmail |

  @Sanity
  Scenario: Validate the unsuccessful login using test data
    When I click on the login link
    And I enter username "iamneha30@gmail.com"
    And I enter password "Dec@@2020"
    And I click on the login button
    Then I should be getting error "The email or password you have entered is invalid."
