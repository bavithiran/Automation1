Feature: Verify Audio Type Creative feature Positive Flow

  @Audio
  Scenario: Verify navigation to creative Page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials
    When User clicks on follower and group management
    Then User should navigate to follower and group management
    And Follower and Management page should have following sections
      | WECHAT FOLLOWER  GROUP MANAGEMENT |
    And Follower and Management page should have following tabs
      | FOLLOWERS MANAGEMENT        |
      | GROUP MANAGEMENT      |
      | USER PREFERENCE SETTINGS        |
#    When User clicks Group Management tab
#    Then User should see "GROUP MANAGEMENT" group management

  @Audio
  Scenario Outline: User Enter the Group Management and Add Group "<Group>" positive case
    1 ,Click GroupManagement
    2 ,Click Add Group
    3 ,Give Valid Details and Save
    4 ,Verify Group has been Added
    5 ,Delete the added group
    
    When User clicks on follower and group management
    Then User should navigate to follower and group management
    And Follower and Management page should have following sections
      | WECHAT FOLLOWER  GROUP MANAGEMENT |
    And Follower and Management page should have following tabs
      | FOLLOWERS MANAGEMENT        |
      | GROUP MANAGEMENT      |
      | USER PREFERENCE SETTINGS        |
    When User clicks Group Management tab
    Then User should see "GROUP MANAGEMENT" group management
    Then User should click add group button
    Then User should see Add group popup page
    Then User should enter the groupname "<Group>" and click save button
    Then User should verify the details "GROUP MANAGEMENT"
    Then User should enter the global groupname created
    When User click search button result should come
    Then Verify the result group name with global group name  
    Then delete the group user name
    Then User should see delete popup page "Delete Group"
    Then User should click yes to delete groupname
    Then User should verify the details "GROUP MANAGEMENT"

    Examples: 
    | Group |
    | T1 |
    | T2 |
    | T3 |
    | T4 |
    
#  @Audio
#  Scenario Outline: User Enter the Group Management and Add Group "<Group>" then cancel the delete popup page
#    1 ,Click GroupManagement
#    2 ,Click Add Group
#    3 ,Give Valid Details and Save
#    4 ,Verify Group has been Added
#    5 ,Cancel the selete the added group popup page
#    
#    When User clicks on follower and group management
#    Then User should navigate to follower and group management
#    And Follower and Management page should have following sections
#      | WECHAT FOLLOWER  GROUP MANAGEMENT |
#    And Follower and Management page should have following tabs
#      | FOLLOWERS MANAGEMENT        |
#      | GROUP MANAGEMENT      |
#      | USER PREFERENCE SETTINGS        |
#    When User clicks Group Management tab
#    Then User should see "GROUP MANAGEMENT" group management
#    Then User should click add group button
#    Then User should see Add group popup page
#    Then User should enter the groupname "<Group>" and click save button
#    Then User should verify the details "GROUP MANAGEMENT"
#    Then User should enter the global groupname created
#    When User click search button result should come
#    Then Verify the result group name with global group name  
#    Then delete the group user name
#    Then User should see delete popup page "Delete Group"
#    Then User should click cancel to avoid delete groupname
#	 Then User should verify the details "GROUP MANAGEMENT"
#
#    Examples: 
#    | Group |
#    | Test1 |

#  @Audio
#  Scenario Outline: User Enter the Group Management and Add Group "<Group>" and cancel
#    1 ,Click GroupManagement
#    2 ,Click Add Group
#    3 ,Give Valid Details
#    4 ,Verify save data but cancel the popup
#    5 ,Verify user remains on same page
#    
#    When User clicks on follower and group management
#    Then User should navigate to follower and group management
#    And Follower and Management page should have following sections
#      | WECHAT FOLLOWER  GROUP MANAGEMENT |
#    And Follower and Management page should have following tabs
#      | FOLLOWERS MANAGEMENT        |
#      | GROUP MANAGEMENT      |
#      | USER PREFERENCE SETTINGS        |
#    When User clicks Group Management tab
#    Then User should see "GROUP MANAGEMENT" group management
#    Then User should click add group button
#    Then User should see Add group popup page
#    Then User should enter the groupname "<Group>"
#    When User clicks cancel button on add group page
#    Then User should see "GROUP MANAGEMENT" group management
#
#    Examples: 
#    | Group |
#    | Test12 |
    
    
#  @Audio
#  Scenario Outline: User Enter the Group Management and Add Group "<Group>" and click close
#    1 ,Click GroupManagement
#    2 ,Click Add Group
#    3 ,Give Valid Details and Cancel
#    4 ,Verify User landed back on old page
#    
#    When User clicks on follower and group management
#    Then User should navigate to follower and group management
#    And Follower and Management page should have following sections
#      | WECHAT FOLLOWER  GROUP MANAGEMENT |
#    And Follower and Management page should have following tabs
#      | FOLLOWERS MANAGEMENT        |
#      | GROUP MANAGEMENT      |
#      | USER PREFERENCE SETTINGS        |
#    When User clicks Group Management tab
#    Then User should see "GROUP MANAGEMENT" group management
#    Then User should click add group button
#    Then User should see Add group popup page
#	When User click close button
#	Then User should see "GROUP MANAGEMENT" group management
#
#    Examples: 
#    | Group |
#    | Test1 |

    
#  @Audio
#  Scenario Outline: User Enter the Follower Management and click search follower "<follower_name>" and save data
#    1 ,Click FollowerManagement, add follower name and search
#    2 ,Click Edit button
#    3 ,Pop up should come, then select groups
#    4 ,Add Remarks
#    5 ,Save the details
#    
#    When User clicks on follower and group management
#    Then User should navigate to follower and group management
#    And Follower and Management page should have following sections
#      | WECHAT FOLLOWER  GROUP MANAGEMENT |
#    And Follower and Management page should have following tabs
#      | FOLLOWERS MANAGEMENT        |
#      | GROUP MANAGEMENT      |
#      | USER PREFERENCE SETTINGS        |
#    When User clicks Follower Management tab
#    Then User should see "FOLLOWERS MANAGEMENT" follower management
#    When User clicks search follower button
#    Then User should enter follower name "<follower_name>" and search
#	Then User should see "<follower_name>" record and click edit
#	Then User should add group name and assign to user
#	Then User should enter remarks "<Remarks>" and click save
#	Then User Should verify success message "Follower's record updated successfully"
#
#    Examples: 
#    | follower_name | Remarks |
#    | Narottamgla |Remarks1|
#    
#    
#  @Audio
#  Scenario Outline: User Enter the Follower Management and enter follower name and search result and cancel
#    1 ,Click FollowerManagement, add follower name and search
#    2 ,Click Edit button
#    3 ,Pop up should come, then select groups
#    4 ,Add Remarks
#    5 ,Click Cancel
#    6 ,User should back to landing page
#    
#    When User clicks on follower and group management
#    Then User should navigate to follower and group management
#    And Follower and Management page should have following sections
#      | WECHAT FOLLOWER  GROUP MANAGEMENT |
#    And Follower and Management page should have following tabs
#      | FOLLOWERS MANAGEMENT        |
#      | GROUP MANAGEMENT      |
#      | USER PREFERENCE SETTINGS        |
#    When User clicks Follower Management tab
#    Then User should see "FOLLOWERS MANAGEMENT" follower management
#    When User clicks search follower button
#    Then User should enter follower name "<follower_name>" and search
#	Then User should see "<follower_name>" record and click edit
#	Then User should enter remarks "<Remarks>"
#    When User clicks cancel button while tagging user
#	Then User should see "FOLLOWERS MANAGEMENT" follower management
#
#    Examples: 
#    | follower_name | Remarks |
#    | Narottamgla |Remarks1|
