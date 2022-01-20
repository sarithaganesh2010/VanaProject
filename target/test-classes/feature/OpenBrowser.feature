Feature: Open Browser Example

  Scenario Outline: Chrome Browser URL searching
    Given Open the chromeBrowser and launch the googleUK
    When I search for the <term>
    Then I should see <URL>

    Examples:
      | term | URL |
      | ITV | https://www.itv.com |
      | BBC | https://www.bbc.co.uk |
      | Channel4 | https://www.channel4.com|

  Scenario Outline: Chrome Browser Intermedia
    Given Open the Browser and launch the googleUK
    When I searched for the <term>
    Then I should seen <title1>
    And I should also see <title2>


    Examples:
      | term | title1 | title2 |
      | intermedia | Cloud IT Application Provider - Intermedia |  All-In-One Cloud Communications Platform \| Intermedia  |
