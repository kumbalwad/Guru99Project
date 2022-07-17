Feature: Login Feature

  Background: 
    Given user launch the "edge" browser
    And user enters the url "https://www.demo.guru99.com/V4/"
    Then the title of page should be "Guru99 Bank Home Page"

  Scenario: Verify the user should able to login with valid Username and Password
    When user enters the valid username "mngr425323" and valid password "vyzAjyz"
    And user click on the login button
    Then the title of page should be "Guru99 Bank Manager HomePage"
    When user logout
    Then the title of page should be "Guru99 Bank Home Page"
    And user should close the browser

  Scenario: Verify the user should not able to login with invalid Username and Password
    When enters the valid username "mngr42532" and valid password "vyzAjy"
    And user click on the login button
    Then the title of page should be "Guru99 Bank Home Page" and message should appear as "User is not valid"
    And user should close the browser

  Scenario Outline: Verify with multiple valid user
    When enters the valid username "<username>" and valid password "<password>"
    And user click on the login button
    Then the title of page should be "Guru99 Bank Manager HomePage"
    When user logout
    Then the title of page should be "Guru99 Bank Home Page"
    And user should close the browser

    Examples: 
      | username   | password |
      | mngr425323 | vyzAjyz  |
      | mngr425386 | ugAnEnu  |
      | mngr425387 | gAveras  |
