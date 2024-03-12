Feature: Test Automation Web

  @web
  Scenario: Test buy goods
    Given open web login page
    And user input username"standard_user"
    And user input password"secret_sauce"
    And user click login button
    Then user chose filter goods
    Then chose filter high to low
    And user add item to cart
    And user will see icon cart in homepage
    And chose cart
    And checkout
    And user input firstname"standard_user"
    And user input lastname"secret_sauce"
    And user input zipcode"577221"
    And chose continue
    Then chose finish

    @web
  Scenario: user cancel checkout
    Given open web login page
    And user input username"standard_user"
    And user input password"secret_sauce"
    And user click login button
    Then user chose filter goods
    Then chose filter high to low
    And user add item to cart
    And user will see icon cart in homepage
    And chose cart
    And checkout
    And chose cancel
    And user remove item to cart
    Then user chose continue shopping

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

  @web
  Scenario: Test login web with username password invalid
    Given open web login page
    And user input username"locked_out_user"
    And user input password"secret_saucesss"
    And user click login button
   # And user will see err message "username password do not match"

  @web
  Scenario: Test login web add to cart
    Given open web login page
    And user input username"standard_user"
    And user input password"secret_sauce"
    And user click login button
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    Then verify cart item is match "2"


  @web
  Scenario: Test login web add to cart
    Given open web login page
    And user input username"standard_user"
    And user input password"secret_sauce"
    And user click login button
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    Then verify cart item is match "2"
    And user remove item to cart
    Then verify cart item is match "1"


