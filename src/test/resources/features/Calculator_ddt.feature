Feature: Calculator should work for simple math

  As a user I  should be able to simple math

  @ddt_testing
  Scenario Outline: Should be able to add two numbers
    Given calculator is open
    When I add <firstNumber> with <secondNumber>
    Then I should get <finalNumber>

    # 1 scenario different datas
    Examples:
    | firstNumber | secondNumber | finalNumber |
    |   2         |    3         |    5        |
    |   8         |    8         |    17       |
    |  12         |    9         |    20       |
    |  15         |    10        |    25       |

