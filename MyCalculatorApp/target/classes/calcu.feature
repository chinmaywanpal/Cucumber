Feature: 
  In order to add two numbers 
  as a account 
  i need feature to add two numbers

  Scenario Outline: Addition of two numbers
    Given I enter "<num1>" and "<num2>"
    When I add them together
    Then the result is "<result>"

    Scenarios: for integers
      | num1 | num2 | result |
      | 6    | 8    | 14     |
      | 60   | 80   | 140    |
      | 16   | 8    | 24     |

    Scenarios: for float
      | num1 | num2 | result |
      | 6.0  | 8.0  | 14.0   |

  Scenario Outline: Subtraction of two numbers
    Given I enter "<num1>" and "<num2>"
    When I subtract numbers
    Then the result is "<result>"

    Scenarios: for integers
      | num1 | num2 | result |
      | 6    | 8    | -2     |

  Scenario Outline: Multiplication of two numbers
    Given I enter "<num1>" and "<num2>"
    When I multiply numbers
    Then the result is "<result>"

    Scenarios: for integers
      | num1 | num2 | result |
      | 2    | 3    | 6      |
      | 3    | 0    | 0      |
