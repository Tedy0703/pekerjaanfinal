Feature: Test Automation Rest Api final

  @api
  Scenario:1
    Given prepare url valid for "GET_LIST_USERS"
    And hit api get list users
    Then validation status coide is equals 200
    Then validation response body get list users
    Then validation response json with JSONSchema "get_list_users_normal.json"
#    And hit api get list data
#    Then verification status code should be 200
#    Then verification respone message should be succes
#    Then verification data list should be not null

  #@api
  #Scenario:2
   # Given prepare url valid for get list data
   # And hit api get list data
    #Then verification status code should be 200
    #Then verification respone message should be succes
    #Then verification data list should be not null

  #@api
  #Scenario:3
   # Given prepare url valid for get list data
   # And hit api get list data
    #Then verification status code should be 200
    #Then verification respone message should be succes
    #Then verification data list should be not null
