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
#    Then validation status coide is equals 200
#    Then validation response body get list users
#    Then validation response json with JSONSchema "get_list_users_normal.json"