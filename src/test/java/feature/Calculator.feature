Feature: This feature is a calculater for addition and substraction

  Background: Open the application
    Given I have a calculator

  Scenario: Test for addition
    When I add 4 and 5
    Then I should get the value as 9

  Scenario: Test for substraction
    When I substract 5 and 4
    Then I should get the value as 1

  Scenario Outline: Validate the results using multiple test data
    When I add <num1> and <num2>
    Then I should get the value as <result>

    Examples: 
      | num1 | num2 | result |
      |   10 |   20 |     30 |
      |    2 |    3 |      5 |

  Scenario Outline: Validate the results using multiple test data
    When I substract <num1> and <num2>
    Then I should get the value as <result>

    Examples: 
      | num1 | num2 | result |
      |   10 |   20 |    -10 |
      |    2 |    3 |     -1 |

  Scenario: Adding numbers using data table
    When I add
      | 1 |
      | 2 |
      | 3 |
      | 4 |
    Then I should get the value as 10

  Scenario: Adding numbers using data table
    When I add using list
      | 1 |
      | 2 |
      | 3 |
      | 4 |
      | 5 |
    Then I should get the value as 15

  Scenario: Calculate bill of order
    When I orderd
      | Coffee       | 20 |
      | Tea          | 10 |
      | French Fries | 50 |
    Then I should get the value as 80

  Scenario: Calculate bill of order
    When I orderd below item and quantity
      | Coffee       | 1 | 20 |
      | Tea          | 1 | 30 |
      | French Fries | 2 | 50 |
    Then I should get the value as 150
