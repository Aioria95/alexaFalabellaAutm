Feature: Close best offers popup

  Scenario: Close best offers popup
    Given Dave is on the main page
    When Accept best offers popup
    Then See confirmation notification best offers popup
    And Close confirmation notification best offers popup