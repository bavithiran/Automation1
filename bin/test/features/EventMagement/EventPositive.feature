Feature: Verify EventManagement Positive Scenarios 


@eventTest
    Scenario: Verify navigation to creative Page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials
    Then User should see User Management module Home Page

@eventTest 
    Scenario Outline: Creating a EventManagement normal flow
         
    When User enters Event Managament Module "<ModuleName>"
    Then User Reads Event name from ExcelFile "<filePath>" and "<fileName>" and "<sheetName>"
    # Then User Clicks On Add In eventManagement Module
    
     Examples:
       | ModuleName       | filePath | fileName              | sheetName | 
       | Event Management | filepath | Event-automation.xlsx | Sheet1    |

