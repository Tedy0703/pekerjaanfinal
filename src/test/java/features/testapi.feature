Feature: Test Automation Rest Api final

  @api
  Scenario:test get list users
    Given prepare url valid for "GET_LIST_USERS"
    And hit api get list users
    Then validation status coide is equals 200
    Then validation response body get list users
    Then validation response json with JSONSchema "get_list_users_normal.json"

  @api
  Scenario:test create list users
    Given prepare url valid for "CREATE_NEW_USERS"
    And hit api get create users
    Then validation status coide is equals 201
    Then validation response body post create new user
    Then validation response json with JSONSchema "post_create_new_user_normal.json"
#    Then validation status coide is equals 200
#    Then validation response body get list users
#    Then validation response json with JSONSchema "get_list_users_normal.json"

  @api
  Scenario:test delete list users
    Given prepare url valid for "CREATE_NEW_USERS"
    And hit api get create users
    Then validation status coide is equals 201
    Then validation response body post create new user
    And hit api delete now
    Then validation status coide is equals 204

  @api
  Scenario:test update list users
    Given prepare url valid for "CREATE_NEW_USERS"
    And hit api get create users
    Then validation status coide is equals 201
    Then validation response body post create new user
    And hit api update data
    Then validation status coide is equals 200
    Then validation response body update user