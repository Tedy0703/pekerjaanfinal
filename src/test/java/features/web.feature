Feature: Test Automation Web

  @web
  Scenario: Test login web normal
    Given open web login page
    And user input username"standard_user"
    And user input password"secret_sauce"
    And user click login button
   And user will see icon cart in homepage

  @web
  Scenario: Test login web with lock user
    Given open web login page
    And user input username"locked_out_user"
    And user input password"secret_sauce"
    And user click login button
    And user will see err message "user has been locked out"