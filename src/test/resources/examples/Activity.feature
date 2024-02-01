Feature:
  Scenario: students go to School
    Given students prepare for the school
    When student "John" go to school
    When student "Alex" go to school
    When student "Mohammad" go to school
    Then they all take the bus and go to school
