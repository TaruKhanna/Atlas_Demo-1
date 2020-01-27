@APITest
Feature: Login with valid user
  

  @demo @Dev
  Scenario: Login
     Given Post endpoint given for login
    When Enter Username and password
    Then Post the login  api
    And Get login response
