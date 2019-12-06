Feature: Verify the Creative All media type PositiveFlow Check

  @CreativeTypes
  Scenario: Verify navigation to creative Page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials
    Then User should see User Management module Home Page

  @CreativeTypes
  Scenario Outline: Verifying Video card - Transfering using Transfer icon and Video Creative save Functionality - Done Working
    1.Entering into Video creative page
    2.Entering Title and Description in the Video Creative creation page
    3.Verifing the Video Upload ToolTip Text in the Original Content
    4.Uploading Video in the video creative page
    5.Selecting the folder 
    6.Transfering the Video Card to Draft Review Page using transfer icon
    7.Transfering the Video Card to Translation Page using transfer icon
    8.Transfering the Video Card to Translation Review Page using transfer icon
    9.Transfering the Video Card to Approval Page using transfer icon
    10.Transfering the Video Card to Library Page using transfer icon
    11.Verifying the Save functionality
    12.Verifying the Save & Close Functionality
    13.Verifing the created card using the card name

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Video" creative from dropdown
    Then User should see "Video" video_creative page
    When User enters video creative title as "<Title>" Description as "<Description>" and "Send"
    When User uploads valid image to Video creative with name as "Video.mp4" and "English"
    When User clicks upload Video tooltip button for Video creative
    Then Video creative toop tip should display with correct text
      | Video format MP4.      |
      | Video size limit 10MB. |
    # Chinese or English
    #When User uploads valid image to Video creative with name as "Video.mp4" and "English"
    # Select folder using name
    When User select Folder name for Video from dropdown as "<ToselectfolderName>" and "Select"
    When User Clicks on "Save" button
    When User Clicks on "Save & Close" button
    #Pls use "Move to drafts review","Move to translation","Move to translation review","Move to approval","Move to library"
    When User Clicks "Move to drafts review" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    #Pls use "Drafts","Drafts Review","Translation","Translation Review","Approve"
    Then User Clicks on CreativeSubtabs "Drafts Review"
    When User Clicks "Move to translation" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    Then User Clicks on CreativeSubtabs "Translation"
    When User clicks edit button of Video creative
    When User enters video creative TransTitle as "<TransTitle>" TransDescription as "<TransDescription>"
    # Chinese or English
    When User uploads valid image to Video creative with name as "Video.mp4" and "Chinese"
    When User Clicks on "Save & Close" button
    When User Clicks "Move to translation review" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    Then User Clicks on CreativeSubtabs "Translation Review"
    When User Clicks "Move to approval" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    Then User Clicks on CreativeSubtabs "Approve"
    When User Clicks "Move to library" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    Then User Click Header CreativeAndLibrary "Library" in Header Tab
    Then Verify the card by cardName

    #Then User should navigate to creative page
    Examples: 
      | Title  | Description                                  | ToselectfolderName | TransTitle | TransDescription                                   |
      | Card14 | testing Video Creative Card - default folder | Default            | 1ard20     | 1esting Trans Video Creative Card - default folder |

  @CreativeTypes
  Scenario Outline: Verify Image card creation with valid datas
    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User click on mediatype subtab "Image"
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "IMAGE" creative from dropdown
    When User enters Image card title as "<imageTitle>" as "Normal"
    When User uploads Cover image to Image creative with name as "valid.png" and "Original"
    When User clicks on save Image_creative button "Save"
    When User Clicks on "Submit for Draft Review" button
    #Draft Review
    When User clicks edit button of imageCard
    When User Clicks on "Submit for Approval" button
    #Then Card should move to "Approval" page creative - Approval Page
    When User clicks on Image card View Button
    When User Clicks on "Approve & Send to Library" button
    #Library
    Then Check whether the created image card is available in the Library

    Examples: 
      | imageTitle      | emailid                         |
      | Image Card no : | adityaseshadri@tmgworldwide.com |

  @CreativeTypes
  Scenario Outline: Verify Text card creation with invalid and valid datas
    1.Text card creation
    2.Verified card transfer from Draft to Draft review
    3.Verified card transfer from Draft review to Translation
    4.Verified card transfer from Translation to Translation review
    5.Verified card transfer from Translation review to Approve
    6.Verified card transfer from Approve to Library

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User click on mediatype subtab "Text"
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    # When User selects "TEXT" creative from dropdown
    When User enters title as "<titlename>" Description as "<message>" and "Normal"
    When User selects smiley character "Original"
    #When User right clicks "Org" on the description field
    #When User enters link as "<validlink>" LinkText as "<linktext>" and "Original"
    #When User adds add tag to the redirection link "Original"
    #When User select tag by tagname as "dog" for textcard with click on adtag button
    When User clicks on save text_creative button
    #When User clicks on Preview
    #When User Searches and selects follower to send preview "Raghu"
    When User Clicks on "Submit for Draft Review" button
    #Draft Review
    When User clicks edit button of textcard
    When User Clicks on "Submit for Approval" button
    #Then Card should move to "Approval" page creative - Approval Page
    When User clicks on View Button
    When User Clicks on "Approve & Send to Library" button

    Examples: 
      | titlename         | message                               | TexttitleManErrorMsg    | TransTitleManErrorMsg     | lmtxtitlename                                                     | lmtxmessage                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | titlecharlimitexceed                    | titlecharlimitexceed_translate | TextDescManErrorMsg         | validlink              | linktext    | textDescLimit        | emailid                        |
      | 老人不位眼 - TextTitle | Text Card Description content - 老人不位眼 | This field is mandatory | The 标题 field is required. | Text Card Title content - 老人不位眼Text Card Tilte content - 老人不位眼 12 | Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼 12 | Title cannot be more than 64 characters | 标题不能为空且长度不能超过64字               | The text field is required. | https://www.google.com | Sample Link | Text limit exceeded. | tmgautomationtesting@gmail.com |

  @CreativeTypes
  Scenario Outline: Moving the audio card to Library using transfer button in the Edit Page
    1 ,Creating the audio card 
    2 ,Validating the Audio card
    3 ,Give valid data and save the audio card
    4 ,Transfer the audio card to draft review Page
    5 ,Transfer the audio card to the translation Page
    6 ,Enter translation data and save the following card
    7 ,Transfer the audio card to the translation Review page
    8 ,Transfer the audio card to the Approaval page
    9 ,Transfer the audio card to the Library Page
    10,Verify the audio card in available in the Library page or not

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Audio" creative from dropdown
    Then User should see "Audio" video_creative page
    When User Clicks on "Save" button
    Then Validation error should display for video/Audio creative title text as "<AudioTitleValidation>"
    Then Validation error should display for Invalid Audio Upload as "<AudioUploadValidation>"
    When USer enters Audio Creative "<Audio64Charc>" and "Send"
    When User uploads valid image to Audio creative with name as "Video.mp4" and "English"
    When User Clicks on "Save" button
    Then Validation error should display for video/Audio creative title text as "<AudioMaximumCharacValidation>"
    Then Validation error should display for Invalid Audio Upload as "<AudioUploadValidation>"
    When USer enters Audio Creative "<Title>" and "Send"
    When User uploads valid image to Audio creative with name as "Audio.mp3" and "English"
    When User Clicks on "Save" button
    When User Clicks on "Submit for Draft Review" button
    When User clicks edit button of Audio creative
    When USer enters Audio Creative "<Title>" and "Clear"
    When User Clicks on "Save" button
    Then Validation error should display for video/Audio creative title text as "<AudioTitleValidation>"
    When USer enters Audio Creative "<Audio64Charc>" and "Send"
    When User Clicks on "Save" button
    Then Validation error should display for video/Audio creative title text as "<AudioMaximumCharacValidation>"
    When USer enters Audio Creative "<Title>" and "Send"
    When User uploads valid image to Audio creative with name as "Audio.mp3" and "English"
    When User Clicks on "Save" button
    When User Clicks on "Submit for Translation" button
    When User clicks edit button of Audio creative
    When USer enters Audio TransCreative "<TransTitle>" and "Send"
    When User uploads valid image to Audio creative with name as "Audio.mp3" and "Chinese"
    When User Clicks on "Save" button
    When User Clicks on "Submit for Translation Review" button
    When User clicks edit button of Audio creative
    When User Clicks on "Submit for Approval" button
    When User clicks View button of Audio creative
    When User Clicks on "Approve & Send to Library" button
    Then Verify the Created Audio card is available or not

    Examples: 
      | Title | TransTitle | AudioTitleValidation    | Audio64Charc                                                           | AudioMaximumCharacValidation            | AudioUploadValidation |
      | Audio | TransTitle | This field is mandatory | 2234567890123456789012345678901234567890123456789012345678901234567890 | Title cannot be more than 64 characters | Please upload audio   |

@CreativeTypes
  Scenario Outline: TC-8619 Rich media content card - Reassign to Translation flow from Approval Page
     1. Create RTM Content creative
     2. Valid JPEG File
     3. With Use of Save and Save & Close
     4. Validate all the available navigation on different Pages
     5. Moving card from Translation Review To Translation
     6. Verifying succeful move of card from Translation Review To Translation
     7. Move card from Translation to Library using Move Icon on Respective list pages
     8. Finally Delete Created Rich Media Card

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default
    When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "valid.jpeg"
    When User select folder name from dropdown as "Default"
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save" button
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save & Close" button
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks edit button of rich media creative
    Then Create creative page should display for richmedia creative
    Then Page should have following Save and Navigation options
      | Notify to User          |
      | Save                    |
      | Save & Close            |
      | Submit for Draft Review |
    When User Clicks on "Submit for Draft Review" button
    Then Card should moved to DraftReview and user should moved to Draft review tab in "Default" folder
    When User clicks edit button of rich media creative
    Then Create page of draft review should display
    Then Page should have following Save and Navigation options
      | Notify to User         |
      | Save                   |
      | Save & Close           |
      | Submit for Approval    |
      | Submit for Translation |
    When User Clicks on "Submit for Translation" button
    Then Card should move to Transalation page creative in "Default" folder
    When User clicks edit button of rich media creative
    Then Rich media edit page should display with Orginal and Translated content
    Then Rich media edit translation page should have below fields as empty
      | title |
      |       |
    Then Rich media edit orginal fields should not be editable
    When User filles Rich media edit page Translated fields page with "<title>" , "<author>" , "<textlink>" and "<summary>"
    When User clicks on translation page Rich Media content Image icon
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    Then Page should have following Save and Navigation options
      | Notify to User                |
      | Save                          |
      | Save & Close                  |
      | Submit for Translation Review |
    When User Clicks on "Submit for Translation Review" button
    Then The following card should get transfered to the Translation Review in "Default" folder
    When User clicks edit button of rich media creative
    Then User should navigate to "Translation Review" page
    Then Page should have following Save and Navigation options
      | Notify to User      |
      | Save                |
      | Save & Close        |
      | Submit for Approval |
    When User clicks on Resassign button
    Then User should see Reassign to draft menu option
    Then User should see Reassign to Translation menu option
    When User clicks on Reassign to Translation menu option
    Then User should see the popup of "Please select user to notify" with email Id's which is registere in the user management module
    When User selects any of the email id
    Then Rich media creative should deleted succesfully from "Default" folder in any tab
    When User clicks on "Translation" creative tab
    Then Card should move to Transalation page creative in "Default" folder
    When User click on "Move to translation review" Icon Link on creative list page
    Then Model popup with below buttons should display
      | Notify to User |
    When User Clicks on OK Model button
    When User clicks on "Translation Review" creative tab
    Then The following card should get transfered to the Translation Review in "Default" folder
    When User click on "Move to approval" Icon Link on creative list page
    Then Model popup with below buttons should display
      | Notify to User |
    When User Clicks on OK Model button
    When User clicks on "Approve" creative tab
    Then Card should move to "Approve" page creative
    When User click on "Move to library" Icon Link on creative list page
    Then Model popup with below buttons should display
      | Notify to User |
    When User Clicks on OK Model button
    Then Card should move to Library of "Rich Media" in "Default" Folder
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder in any tab

    Examples: 
      | title             | author | textlink         | summary     |
      | richmedia-content | author | https://test.com | testSummary |      
