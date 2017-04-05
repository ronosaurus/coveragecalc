Feature: Coverage Calculator
  This is needed to determine the coverage amount based on the coverage and limit selected.

  Scenario Outline: User selects a coverage and limit to get a coverage cost amount
    Given the user selects a coverage of <coverageName>
    And the user also selects a <coverageLimit>
    And the user asks for the coverage amount to be calculated
    Then the coverage amount is <coverageAmount>

    Examples:
      | coverageName        | coverageLimit | coverageAmount |
      | Bodily Injury       | 100000        | 500            |
      | Bodily Injury       | 200000        | 800            |
      | Uninsured Motorists | 100000        | 600            |
      | Uninsured Motorists | 250000        | 950            |