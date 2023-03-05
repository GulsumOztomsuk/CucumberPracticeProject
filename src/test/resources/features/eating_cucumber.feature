
Feature: Eating too many cucumbers may not be good for you
  user story:Eating too muchof anything may not be good for you
@eating1
  Scenario: Eating a few is not problem
    Given John is hungry
    When he eats some cucumbers
    Then he will be full

  @eating2
  Scenario: Eating a few is not problem
    Given "John" is hungry
    When he eats 3 cucumbers
    Then he will be full