Feature: Login Feature

  Background: 
    Given user launch the browser
    And user enters the url "https://www.demo.guru99.com/V4/"
    Then the title of page should be "Guru99 Bank Home Page"

  Scenario: Verify the user should able to login with valid Username and Password
    When enters the valid username "mngr425323" and valid password "vyzAjyz"
    And user click on the login button
    Then the title of page should be "Guru99 Bank Manager HomePage"
    When user logout
    Then the title of page should be "Guru99 Bank Home Page"
    And user should close the browser

  Scenario: Verify the user should not able to login with invalid Username and Password
    When enters the valid username "mngr425323" and valid password "vyzAjyz"
    And user click on the login button
    Then the title of page should be "Guru99 Bank Home Page" and message should appear as "User is not valid"
    And user should close the browser


