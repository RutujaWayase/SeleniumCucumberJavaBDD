# Author - '#' is used for comment
# Date
# Description

# @SmokeScenario
@SmokeFeature
Feature: feature to test login functionality

# @SmokeTest
@smoketest
  Scenario: Check login is successful with valid cresdentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  #Scenario Outline: Check login is successful with valid credentials
    #Given user is on login page
    #When user enters <username> and <password>
    #And clicks on login button
    #Then user is navigated to home page
#
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |

 # Shortcut for commenting multiple lines in feature file is: Ctrl + /
 