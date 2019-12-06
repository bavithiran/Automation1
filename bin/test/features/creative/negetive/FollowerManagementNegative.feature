Feature: Verify Audio Type Creative feature Negative Flow

  @Audio
  Scenario: Verify navigation to creative Page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials
    When User clicks on follower and group management
    Then User should navigate to follower and group management
    And Follower and Management page should have following sections
      | WECHAT FOLLOWER  GROUP MANAGEMENT |
    And Follower and Management page should have following tabs
      | FOLLOWERS MANAGEMENT     |
      | GROUP MANAGEMENT         |
      | USER PREFERENCE SETTINGS |
    When User clicks Group Management tab
    Then User should see "GROUP MANAGEMENT" group management

  @Audio
  Scenario Outline: User Enter the Follower Management and click search follower "<follower_name>" edit and enters desciption more than 12 character
    1 ,Click FollowerManagement
    2 ,Click Edit button
    3 ,Pop up should come, then select groups
    4 ,Add Remarks greater than 12 characters
    5 ,Save the details
    6, User should see errors

    When User clicks on follower and group management
    Then User should navigate to follower and group management
    And Follower and Management page should have following sections
      | WECHAT FOLLOWER  GROUP MANAGEMENT |
    And Follower and Management page should have following tabs
      | FOLLOWERS MANAGEMENT     |
      | GROUP MANAGEMENT         |
      | USER PREFERENCE SETTINGS |
    When User clicks Follower Management tab
    Then User should see "FOLLOWERS MANAGEMENT" follower management
    When User clicks search follower button
    Then User should enter follower name "<follower_name>" and search
    Then User should see "<follower_name>" record and click edit
    Then User should add group name and assign to user
    Then User should enter remarks "<Remarks>"
    Then User Should verify error message "<Error_Message>"
    Then User clicks cancel button while tagging user

    Examples: 
      | follower_name | Remarks               | Error_Message                               |
      | messi   | test remarks 12345678 | Group Name should not exceed 12 characters! |

  @Audio
  Scenario Outline: User Enter the Follower Management and click cancel after enetring follower name
    1 ,Click FollowerManagement, enter follower name
    2 ,Click Cancel button
    3 ,User should back to landing page

    When User clicks on follower and group management
    Then User should navigate to follower and group management
    And Follower and Management page should have following sections
      | WECHAT FOLLOWER  GROUP MANAGEMENT |
    And Follower and Management page should have following tabs
      | FOLLOWERS MANAGEMENT     |
      | GROUP MANAGEMENT         |
      | USER PREFERENCE SETTINGS |
    When User clicks Follower Management tab
    Then User should see "FOLLOWERS MANAGEMENT" follower management
    When User clicks search follower button
    Then User should enter follower name "<follower_name>"
    When User clicks cancel button
    Then User should see "FOLLOWERS MANAGEMENT" follower management

    Examples: 
      | follower_name | Remarks  |
      | messi   | Remarks1 |
