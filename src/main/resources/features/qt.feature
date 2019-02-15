Feature: Order products
    As a manager
    I want the inventory to be deducted accordingly
    So that I know if the order can be fulfilled

Background:
    Given a product Bread with price 20.50 and quantity 20 units in the inventory
    And a product Jam with price 80.00 and quantity 10 units in the inventory

Scenario: Order one product
    When the order Bread is made with quantity 5
    Then the amount of Bread in the inventory should be 15

Scenario: Order multiple products can made
    When the order Bread is made with quantity 4
    And the order Jam is made with quantity 3
    Then the amount of Bread in the inventory should be 16
    And the amount of Jam in the inventory should be 7

Scenario: Order multiple products can't made
    When the order Bread is made with quantity 200
    And the order Jam is made with quantity 50
    Then the amount of Bread in the inventory should be 20
    And the amount of Jam in the inventory should be 10

