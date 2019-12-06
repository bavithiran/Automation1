Feature: Verfiy Databinding feature for positive scenario

  Scenario: Verify new user signup and check newly singned up user in Databinding list page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials
    Then User should see User Management module Home Page
    When Click on search icon in the Left corner 
	  Then It should open the search field 
    When User enter search by module name "DATA BINDING" 
	  Then User should automatically search the module name under list "DATA BINDING" 
	  When User clicks module name underlist  "DATA BINDING" 
	  Then User should automatically navigate to module name page "DATA BINDING"
	  When User search follower by name as "narottamgla"
	  When User deletes the follower from databinding list
	  When Register new user through signup process with username as "narottamgla" and mobile as "9978077098"
	  Then Newly signup user should available on data binding page with username as "narottamgla" and mobile as "9978077098"
	  Then Follower should display in data binding list with username as "narottamgla" and mobile as "9978077098"
	  When User deletes the follower from databinding list
	  Then Follower should be deleted from list with name as "narottamgla"
	   
  
  #@ignore
  Scenario: LogoutFrom to Wechatify
    When User perform logout from Wechatify
    Then User should see application login page
