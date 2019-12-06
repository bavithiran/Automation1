Feature: Verify Template Module feature Negative Flow

  #Background:
  # When User confirms leave page popup
  #Given Close any model poup if displayed
  @TempNeg
  Scenario: Verify navigation to creative Page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials
    Then User should see User Management module Home Page

  @Done
  Scenario Outline: Write data in Excel
    When User clicks on creative nav menu
    Then User should navigate to creative page
    Then User selects Module By ModuleName "<ModuleName>"
    Then Get Text of the WebPage with sheetName as "<sheetName>" and ExcelName as "<ExcelName>" and Land as "<Lang>"

    Examples: 
      | ModuleName       | sheetName   | ExcelName        | Lang |
      | eventmanagement | Event Sheet | bothLocalization | EN   |

  @Done
  Scenario Outline: Edit check Flow and select all the types
    When User clicks on creative nav menu
    Then User should navigate to creative page
    Then User selects Module By ModuleName "<ModuleName>"
    #Then Get Fromm the Varibalr
    When User Clicks on Add button in Template module for create Template
    #Then User clicks on Pull template button
    Then Selecting a Random Template Master Card
    When User Clicks on BackToList or Select in Review Form of Template Master "<BackOrSelectOpt>"
    Then User Enter Template Message Name "<TemplateMessageName>" and "Send"
    When User selects JumpPage or Content or MiniApp or NoTypes "<CheckBoxOption>"
    Then Entering the create form details in the Template jumpExtLinkData "<jumpExtLinkData>" and ContentDesFieldData "<ContentDesFieldData>" and ImageName "<ImageName>" and TemplateVideoUrl "<TemplateVideoUrl>" and TemplateStaticQr "<TemplateStaticQr>" and MiniappNameData "<MiniappNameData>" and MiniappPagePathData "<MiniappPagePathData>" and MiniAppidData "<MiniAppidData>" and VideoOk/Close "<OkOrClose>"
    When User select tag by tagname as "<tagname>" for rich media with click on adtag button
    Then User Enters data in the available Template Fields
    Then User Clicks On TemplateActivity OnOrOff
    #When User selects Group name From the dropdown Template "rahul"
    When User select Folder name for Template from dropdown as "<ToselectfolderName>" and "Select"
    When User Clicks on Create Or BackToList as "Create"
    Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "Edit" In the TemplateCard
    When User selects JumpPage or Content or MiniApp or NoTypes "Content"
    Then Entering the create form details in the Template jumpExtLinkData "<jumpExtLinkData>" and ContentDesFieldData "<ContentDesFieldData>" and ImageName "<ImageName>" and TemplateVideoUrl "<TemplateVideoUrl>" and TemplateStaticQr "<TemplateStaticQr>" and MiniappNameData "<MiniappNameData>" and MiniappPagePathData "<MiniappPagePathData>" and MiniAppidData "<MiniAppidData>" and VideoOk/Close "<OkOrClose>"
    Then User Clicks on Save or SaveAndClose "SaveAndClose"
    Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "Edit" In the TemplateCard
    When User selects JumpPage or Content or MiniApp or NoTypes "MiniApp"
    Then Entering the create form details in the Template jumpExtLinkData "<jumpExtLinkData>" and ContentDesFieldData "<ContentDesFieldData>" and ImageName "<ImageName>" and TemplateVideoUrl "<TemplateVideoUrl>" and TemplateStaticQr "<TemplateStaticQr>" and MiniappNameData "<MiniappNameData>" and MiniappPagePathData "<MiniappPagePathData>" and MiniAppidData "<MiniAppidData>" and VideoOk/Close "<OkOrClose>"
    When User Checks the MiniApp is Valid or not and Send the Preview to follower to "messi" and "Preview"
    When User selects JumpPage or Content or MiniApp or NoTypes "MiniApp"
    Then User Clicks on Save or SaveAndClose "SaveAndClose"

    Examples: 
      | ModuleName | ValidFolderName                   | BackOrSelectOpt | TemplateMessageName | CheckBoxOption | jumpExtLinkData        | ContentDesFieldData | ImageName | TemplateVideoUrl                         | TemplateStaticQr | MiniappNameData | MiniappPagePathData | MiniAppidData      | OkOrClose | ToselectfolderName | tagname | FolderName |
      | template   | WithoutActivityTemplateFolderName | Select          | TemplateMessageName | JumpPage       | https://www.google.com | ContentDesFieldData | Valid.png | https://v.qq.com/x/page/d0542aie69t.html | automation       | 探索悉尼            | pages/splash/index  | wxb89c041cf28ae224 | Ok        | Automation         | dog     | Automation |

  @Done
  Scenario Outline: Checking the negative flow for MiniApp Template Creation and ValidMiniApp Check
    1,Create a MiniApp template
    2,Enter MiniAppData
    3,Enter Data in the Dynamic Template Field
    4,Send Preview to follower for checking ValidMiniApp
    5,Click on create Button

    When User clicks on creative nav menu
    Then User should navigate to creative page
    Then User selects Module By ModuleName "<ModuleName>"
    #When User clicks Template "Add New Folder" button
    #When Enter Folder Template name "<ValidFolderName>" and "date"
    #Then User Click on Template Submit in Folder Option
    Then The Template Create Page should be in Active state
    When User Clicks on Add button in Template module for create Template
    #Then User clicks on Pull template button
    Then Selecting a Random Template Master Card
    When User Clicks on BackToList or Select in Review Form of Template Master "<BackOrSelectOpt>"
    Then User Enter Template Message Name "<TemplateMessageName>" and "Send"
    When User selects JumpPage or Content or MiniApp or NoTypes "<CheckBoxOption>"
    Then Entering the create form details in the Template jumpExtLinkData "<jumpExtLinkData>" and ContentDesFieldData "<ContentDesFieldData>" and ImageName "<ImageName>" and TemplateVideoUrl "<TemplateVideoUrl>" and TemplateStaticQr "<TemplateStaticQr>" and MiniappNameData "<MiniappNameData>" and MiniappPagePathData "<MiniappPagePathData>" and MiniAppidData "<MiniAppidData>" and VideoOk/Close "<OkOrClose>"
    #When User select tag by tagname as "<tagname>" for rich media with click on adtag button
    Then User Enters data in the available Template Fields
    #Then User Clicks On TemplateActivity OnOrOff
    When User selects Group name From the dropdown Template "rahul"
    Then User selects Tag From the dropdown "AutomationTemplate"
    When User select Folder name for Template from dropdown as "<ToselectfolderName>" and "Select"
    #When User Checks the MiniApp is Valid or not and Send the Preview to follower to "messi" and "Preview"
    When User selects JumpPage or Content or MiniApp or NoTypes "MiniApp"
    When User Clicks on Create Or BackToList as "Create"

    #Then When User Clicks On Preview or Close btn MiniApp as "Preview"
    Examples: 
      | ModuleName | ValidFolderName                   | BackOrSelectOpt | TemplateMessageName | CheckBoxOption | jumpExtLinkData        | ContentDesFieldData | ImageName | TemplateVideoUrl                         | TemplateStaticQr | MiniappNameData | MiniappPagePathData | MiniAppidData      | OkOrClose | ToselectfolderName | tagname | FolderName |
      | template   | WithoutActivityTemplateFolderName | Select          | TemplateMessageName | MiniApp        | https://www.google.com | ContentDesFieldData | Valid.png | https://v.qq.com/x/page/d0542aie69t.html | automation       | 探索悉尼            | pages/splash/index  | wxb89c041cf28ae224 | Ok        | Automation         | dog     | Automation |

  @Done
  Scenario Outline: Verifing the Validation while creating the Template
    1,Choose a Template in the template Master
    2,Verify the Validation in the Create template Page.
    3,Create a template with the Valid data and also Copy Flow
    4,Move to schedule Page
    5,Move to approve Page after choosing the date and Schedule time
    6.Move to Queue Page and also the Copy flow
    7,Cancel the following card in the Queue Page
    8,Move to Draft Page
    9,Delete the following card in the Draft Page

    When User clicks on creative nav menu
    Then User should navigate to creative page
    Then User selects Module By ModuleName "<ModuleName>"
    When User Clicks on Add button in Template module for create Template
    #Then User clicks on Pull template button
    Then Selecting a Random Template Master Card
    When User Clicks on BackToList or Select in Review Form of Template Master "<BackOrSelectOpt>"
    When User Clicks on Create Or BackToList as "Create"
    When Valiation Error Should get displayed for the Template Title Field Mandatory "This Field is required"
    Then User Enter Template Message Name "<TemplateMessageNameMax>" and "Send"
    When User Clicks on Create Or BackToList as "Create"
    When Maximum char Validation Error should get displayed for the Template title "This field cannot be more than 120 characters"
    Then Verify Template dynamic field Mandatory validation check "This Field is required"
    When User Clicks on Create Or BackToList as "Create"
    Then User Enter Template Message Name "<TemplateMessageName>" and "Send"
    #When User select tag by tagname as "<tagname>" for rich media with click on adtag button
    Then User Enters data in the available Template Fields
    When User selects Group name From the dropdown Template "rahul"
    Then User selects Tag From the dropdown "AutomationTemplate"
    When User select Folder name for Template from dropdown as "<ToselectfolderName>" and "Select"
    When User selects JumpPage or Content or MiniApp or NoTypes "JumpPage"
    When User Clicks on Create Or BackToList as "Create"
    When Template JumpPage Validation Check "External URL link is required"
    Then Entering the create form details in the Template jumpExtLinkData "<LinkRequired>" and ContentDesFieldData "<ContentDesFieldData>" and ImageName "<ImageName>" and TemplateVideoUrl "<TemplateVideoUrl>" and TemplateStaticQr "<TemplateStaticQr>" and MiniappNameData "<MiniappNameData>" and MiniappPagePathData "<MiniappPagePathData>" and MiniAppidData "<MiniAppidData>" and VideoOk/Close "<OkOrClose>"
    When User Clicks on Create Or BackToList as "Create"
    When Template JumpPage Validation Check "Invalid url"
    When User selects JumpPage or Content or MiniApp or NoTypes "Content"
    When User Clicks on Create Or BackToList as "Create"
    Then Template Content Validation Check "This field is mandatory"
    When User selects JumpPage or Content or MiniApp or NoTypes "MiniApp"
    Then User Clicks on Templae CheckMiniApp Button Click
    Then Verifing the Template MiniApp Name Validatoin Text "Name is required"
    Then Verify Template MiniApp PagePath Validation Text "Pagepath is required"
    Then Verify Template Miniapp AppId Validation Text "AppId is required"
    When User selects JumpPage or Content or MiniApp or NoTypes "MiniApp"
    When User Clicks on Create Or BackToList as "Create"
    Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "Edit" In the TemplateCard
    #Then User Clicks on Save or SaveAndClose "SaveAndClose"
    #Then User Clicks On Edit In the TemplateCard
    #Then User Clicks on Save or SaveAndClose "Save"
    When User clicks on CopyMessage as YesOrNo "Yes" with Ok Or Cancel "Ok"
    When User Clicks on Transfer Icon Schedule or SendForApproval or Approve "Schedule"
    Then The Template Schedule Page should be in Active state
    Then User Selects Date and Time as Min or Hour "Min" and upadtetime as "20"
    When User Clicks on Transfer Icon Schedule or SendForApproval or Approve "SendForApproval"
    Then The Template Approve Page should be in Active state
    #Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "ReSchedule" In the TemplateCard
    Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "View" In the TemplateCard
    When User clicks on CopyMessage as YesOrNo "Yes" with Ok Or Cancel "Ok"
    When User Clicks on Transfer Icon Schedule or SendForApproval or Approve "Approve"
    Then The Template Queue Page should be in Active state
    Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "View" In the TemplateCard
    When User clicks on CopyMessage as YesOrNo "Yes" with Ok Or Cancel "Ok"
    Then User Clicks on SubTabs of Create Or Schedule Or Approve Or Queue Or Log Or SFMC Log as "Queue"
    Then User Selects Template folder By NAme "Automation"
    Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "Cancel" In the TemplateCard
    Then User Clicks On Ok or Cancel Btn "OK"
    Then User Clicks on SubTabs of Create Or Schedule Or Approve Or Queue Or Log Or SFMC Log as "Create"
    Then User Selects Template folder By NAme "Automation"
    #When User Clicks on "<FolderName>" Folder by name
    Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "Delete" In the TemplateCard
    Then User Clicks Ok or Cancel Btn in Template Card Delete Opt "Ok"

    Examples: 
      | ModuleName | BackOrSelectOpt | TemplateMessageNameMax                                                                                                    | TemplateMessageName | tagname | ToselectfolderName | CheckBoxOption | LinkRequired |
      | template   | Select          | 1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901 | TemplateMessageName | dog     | Automation         | JumpPage       | LinkRequired |

  @TempNeg
  Scenario Outline: Creating a Template without activity Response with JumpLinkType and checking the Reassign n [Copy Flow]
    1,Enter into Template Module
    2,Check whether the Create Sub Tab is in Active State
    3,Click on Add button
    4,Selecting the Random Template from the Template Master
    5.Selecting the JumpLink 
    6.Creating the Template with JumpLink 
    7,Selecting a Tag 
    8,Enter datas in the Template Dynamic Field
    9,Selecting Group and Tag name 
    10,Selecting the Folder
    11,Creating the Template with the Jumplink 
    12,Editing the Particular Template
    13,Processing the Copy Flow
    14,Move the Card to Schedule Page
    15,Selecting the Date and Time in the Schedule Page
    16,Move the Card to approve Page.
    17,Click on View button for that particular Template
    18,Processing the Copy Flow
    19,Move the card to Queue Page
    20,Click on View button for the Particular Template 
    21,Reassinging the Card to Draft Page.
    22,Moveing to Draft Page and That particular Folder
    23,Verify the Reassigned card is present or not in Draft Page.

    When User clicks on creative nav menu
    Then User should navigate to creative page
    Then User selects Module By ModuleName "<ModuleName>"
    #When User clicks Template "Add New Folder" button
    #When Enter Folder Template name "<ValidFolderName>" and "date"
    #Then User Click on Template Submit in Folder Option
    Then The Template Create Page should be in Active state
    When User Clicks on Add button in Template module for create Template
    #Then User clicks on Pull template button
    Then Selecting a Random Template Master Card
    When User Clicks on BackToList or Select in Review Form of Template Master "<BackOrSelectOpt>"
    Then User Enter Template Message Name "<TemplateMessageName>" and "Send"
    When User selects JumpPage or Content or MiniApp or NoTypes "<CheckBoxOption>"
    Then Entering the create form details in the Template jumpExtLinkData "<jumpExtLinkData>" and ContentDesFieldData "<ContentDesFieldData>" and ImageName "<ImageName>" and TemplateVideoUrl "<TemplateVideoUrl>" and TemplateStaticQr "<TemplateStaticQr>" and MiniappNameData "<MiniappNameData>" and MiniappPagePathData "<MiniappPagePathData>" and MiniAppidData "<MiniAppidData>" and VideoOk/Close "<OkOrClose>"
    When User select tag by tagname as "<tagname>" for rich media with click on adtag button
    Then User Enters data in the available Template Fields
    #Then User Clicks On TemplateActivity OnOrOff
    When User selects Group name From the dropdown Template "rahul"
    Then User selects Tag From the dropdown "AutomationTemplate"
    When User select Folder name for Template from dropdown as "<ToselectfolderName>" and "Select"
    When User Clicks on Create Or BackToList as "Create"
    Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "Edit" In the TemplateCard
    #Then User Clicks on Save or SaveAndClose "SaveAndClose"
    #Then User Clicks On Edit In the TemplateCard
    #Then User Clicks on Save or SaveAndClose "Save"
    When User clicks on CopyMessage as YesOrNo "Yes" with Ok Or Cancel "Ok"
    When User Clicks on Transfer Icon Schedule or SendForApproval or Approve "Schedule"
    Then The Template Schedule Page should be in Active state
    Then User Selects Date and Time as Min or Hour "Min" and upadtetime as "20"
    When User Clicks on Transfer Icon Schedule or SendForApproval or Approve "SendForApproval"
    Then The Template Approve Page should be in Active state
    #Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "ReSchedule" In the TemplateCard
    Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "View" In the TemplateCard
    #When User clicks on CopyMessage as YesOrNo "Yes" with Ok Or Cancel "Ok"
    When User Clicks on Reassign and Reassign to Create Flow
    Then User Clicks On Ok or Cancel Btn "OK"
    Then User Clicks on SubTabs of Create Or Schedule Or Approve Or Queue Or Log Or SFMC Log as "Create"
    Then User Selects Template folder By NAme "Automation"
    Then Check the Template Folder and TemplateCard REassign Icon

    Examples: 
      | ModuleName | ValidFolderName                   | BackOrSelectOpt | TemplateMessageName | CheckBoxOption | jumpExtLinkData        | ContentDesFieldData | ImageName | TemplateVideoUrl                         | TemplateStaticQr | MiniappNameData | MiniappPagePathData | MiniAppidData      | OkOrClose | ToselectfolderName | tagname | FolderName |
      | template   | WithoutActivityTemplateFolderName | Select          | TemplateMessageName | JumpPage       | https://www.google.com | ContentDesFieldData | Valid.png | https://v.qq.com/x/page/d0542aie69t.html | automation       | 探索悉尼            | pages/splash/index  | wxb89c041cf28ae224 | Ok        | Automation         | dog     | Automation |
