Feature: Doing operations between numbers with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to doing operations between numbers using a Calculator

  Background: Start with a Calculator
    Given I have a Calculator

  Scenario Outline: Add two numbers
    When I add <arg0> and <arg1>
    Then the sum should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | 1    | 2   |
      | 1    | -1   | 0   |
      | -5   | -6   | -11 |

  Scenario Outline: Subtract two numbers
    When I subtract <arg0> and <arg1>
    Then the difference should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | 1    | 0   |
      | 1    | -1   | 2   |
      | -5   | -6   | 1   |