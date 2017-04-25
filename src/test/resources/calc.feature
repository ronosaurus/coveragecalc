Feature: Coverage Calculator
  This is needed to determine the coverage amount based on the coverage and limit selected. something 3

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

  Scenario: User asks for the coverage amount to be calculated but hasn't selected a coverage name

    Given the user asks for the coverage amount to be calculated
    And the user hasn't selected a coverage name of <coverageName>
    Then the user is told that a coverage name hasn't been selected


  Scenario: User asks for the coverage amount to be calculated but hasn't selected a coverage limit

    Given the user asks for the coverage amount to be calculated
    And the user hasn't selected a coverage limit of <coverageLimit>
    Then the user is told that a coverage limit hasn't been selected