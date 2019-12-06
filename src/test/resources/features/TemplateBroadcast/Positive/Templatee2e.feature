Feature: Verify Template Module feature Positive Flow

  @TempPos
  Scenario: Verify navigation to creative Page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials
    Then User should see User Management module Home Page

  @TempPos1
  Scenario: Verify template message navigation to Queue and log tabs
    1 Enter into Template Module
    2 Check whether the Create Sub Tab is in Active State
    3 Click on Add button
    4 Selecting the Random Template from the Template Master

    When User clicks on creative nav menu
    Then User should navigate to creative page
    Then User selects Module By ModuleName "template"
    When I read the message detail from file name as "templatee2e3.json"
    When User select Queue tab of template message
    Then Queue tab should not have message that delivered to user
    When User select Logs tab of template message
    Then Message should present in log tab of template that is delevered to user
    Then Message should also delivered to end user for template with file "templatee2e3.json"
