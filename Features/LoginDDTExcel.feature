Feature: Login Data Driven with Excel

@sanity
  Scenario Outline: Login Data Driven Excel
    Given User Launch browser
    And opens url "http://tutorialsninja.com/demo/index.php?route=common/home"
    When User navigate to MyAccount menu
    And click on Login
    Then check User navigates to MyAccount Page by passing Email and Password with excel row "<row_index>"

    Examples:
      |row_index|
      |1|
      |2|
      |3|
