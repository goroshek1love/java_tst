Feature: Groups

  Scenario Outline: Group creation
    Given a set of groups
    When I create a new group with name <name>, header <header>, footer <footer>
    Then the new set of groups equal to the old set with added group

    Examples:
    | name      | header      | footer      |
    | test name | test header | test footer |