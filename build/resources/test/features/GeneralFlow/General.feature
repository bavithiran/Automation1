Feature: Verify the Template and Autoresponder Positive Flow test

  @General
  Scenario: Verify navigation to creative Page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials
    Then User should see User Management module Home Page

  @General
  Scenario Outline: Creating a Template without activity Response with Content Type [Copy Flow] and Moving the Card upto Queue
    1,Enter into Template Module
    2,Check whether the Create Sub Tab is in Active State
    3,Click on Add button
    4,Selecting the Random Template from the Template Master
    5.Selecting the Content
    6.Creating the Template with Content Type
    7,Selecting a Tag 
    8,Enter datas in the Template Dynamic Field
    9,Selecting Group and Tag name 
    10,Selecting the Folder
    11,Creating the Template with the Content Type
    12,Editing the Particular Template
    13,Processing the Copy Flow
    14,Move the Card to Schedule Page
    15,Selecting the Date and Time in the Schedule Page
    16,Move the Card to approve Page.
    17,Click on View button for that particular Template
    18,Processing the Copy Flow
    19,Move the card to Queue Page
    20,Click on View button for the Particular Template 
    21,Processing the Copy Flow
    22,Move to Grid Page of Queue
    23,Do the Cancel functionality for that particular card
    24,Deleting the card in the Create Page

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
    #When User Clicks on Preview To follower for FollowerName as "messi" and option as "Preview"
    #Then User Clicks on Save or SaveAndClose "SaveAndClose"
    #Then User Clicks On Edit In the TemplateCard
    #Then User Clicks on Save or SaveAndClose "Save"
    When User clicks on CopyMessage as YesOrNo "Yes" with Ok Or Cancel "Ok"
    When User Clicks on Transfer Icon Schedule or SendForApproval or Approve "Schedule"
    Then The Template Schedule Page should be in Active state
    Then User Selects Date and Time as Min or Hour "Min" and upadtetime as "20"
    When User Clicks on Transfer Icon Schedule or SendForApproval or Approve "SendForApproval"
    #Then The Template Approve Page should be in Active state
    #Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "ReSchedule" In the TemplateCard
    #Then User Clicks on Option of Reschecule Calender such as Notify to user or Reschedule or Cancel as "Reschedule"
    Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "View" In the TemplateCard
    #When User Clicks on Preview To follower for FollowerName as "messi" and option as "Preview"
    When User clicks on CopyMessage as YesOrNo "Yes" with Ok Or Cancel "Ok"
    When User Clicks on Transfer Icon Schedule or SendForApproval or Approve "Approve"
    Then The Template Queue Page should be in Active state
    Then User Clicks On Edit or View or Cancel or Delete or ReSchedule as "View" In the TemplateCard
    #When User Clicks on Preview To follower for FollowerName as "messi" and option as "Preview"
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
    Then I Save the template message details as  "templatee2e1.json"

    Examples: 
      | ModuleName | ValidFolderName                   | BackOrSelectOpt | TemplateMessageName | CheckBoxOption | jumpExtLinkData        | ContentDesFieldData | ImageName | TemplateVideoUrl                         | TemplateStaticQr | MiniappNameData | MiniappPagePathData | MiniAppidData      | OkOrClose | ToselectfolderName | tagname | FolderName |
      | template   | WithoutActivityTemplateFolderName | Select          | TemplateMessageName | Content        | https://www.google.com | ContentDesFieldData | Valid.png | https://v.qq.com/x/page/d0542aie69t.html | automation       | 探索悉尼            | pages/splash/index  | wxb89c041cf28ae224 | Ok        | Automation         | dog     | Automation |

  @General
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>" 
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "Text" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "RichTextMessage" - card name "Automation Testing RTM response card" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "Message" - card name "Automation Testing RTM response card" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "Image" - card name "Automation Testing Response card" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "Audio" - card name "Audio1" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "Video" - card name "Automation Testing Response card" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User clicks on FAQ Action "Back to List" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Audio        |
