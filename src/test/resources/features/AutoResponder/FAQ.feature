Feature: QNA creation

  @faq
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @faq
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User clicks on FAQ Action "Back to List" Button
    When user performs "Edit" action in the respective FAQ
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseTypeE>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             |
      | Auto Responder | Auto New | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card |

  @all
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @all
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User clicks on FAQ Action "Back to List" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Audio        |

  @keyword
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @keyword
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User right clicks "Org" on the description field
    When User enters link as "<validlink>" LinkText as "<linktext>" and "Original"
    #When User adds add tag to the redirection link "Original"
    #When User select tag by tagname as "dog" for textcard with click on adtag button
    When User selects smiley character "Original"
    When User clicks on FAQ Action "Save" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype   | responseType | validlink             | linktext    |
      | Auto Responder | Auto New | Auto Answer | Keyword | Text         | http://www.google.com | GOogle Link |

  @qq
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @qq
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User right clicks "Org" on the description field
    When User enters link as "<validlink>" LinkText as "<linktext>" and "Original"
    #When User adds add tag to the redirection link "Original"
    #When User select tag by tagname as "dog" for textcard with click on adtag button
    When User selects smiley character "Original"
    When User clicks on FAQ Action "Save" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | validlink             | linktext    |
      | Auto Responder | Auto New | Auto Answer | Question | Text         | http://www.google.com | GOogle Link |

  @unit
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @unit
  Scenario Outline: QNA bulk data Creation through Excel sheet (Question : Answer - TEXT format only) without tags and membership cards mapped
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When Bulk data insert "<filePath>" and "<fileName>" and "<sheetName>"

    Examples: 
      | ModuleName     | Question | textmessage       | filePath | fileName                 | sheetName |
      | Auto Responder | auto new | 45612378954561231 | filepath | FAQ-AutomationSheet.xlsx | Sheet1    |

  @cre
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @cre
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Text         |

  @photoNewsResponse
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @photoNewsResponse
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType    | cardName |
      | Auto Responder | Auto New | Auto Answer | Question | RichTextMessage | menu 1   |

  @photoMessageResponse
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @photoMessageResponse
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Message      |

  @imageresponse
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @imageResponse
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Image        |

  @audioresponse
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @audioresponse
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Audio        |

  @videoResponse
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @videoResponse
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Video        |

  @tt
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @tt
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates and selects a new system tag "SysTag" and strength "2"
    When User selects an existing tag "Basic Flow"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Text         |

  @exist
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @exist
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User selects an existing tag "Basic Flow"
    When User clicks on FAQ Action "Save" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Text         |

  @publishALLunit
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @publishALLunit
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on FAQ Action "Publish All" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Text         |

  @count_unit
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @count_unit
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Text         |

  @delete_Unpublished
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @delete_Unpublished
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User clicks on FAQ Action "Back to List" Button
    When user performs "Delete" action in the respective FAQ
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             |
      | Auto Responder | Auto New | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card |

  @delete_Published
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @delete_Published
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User clicks on FAQ Action "Back to List" Button
    When user performs "Publish" action in the respective FAQ
    When user performs "Delete" action in the respective FAQ

    #When User creates Question as "<Question>" and Answer as "<Answer>" in "<qtype>" and "<responseTypeE>" - card name "<cardName>"
    #When User clicks on FAQ Action "Save" Button
    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             |
      | Auto Responder | Auto New | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card |

  @t_menu
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @t_menu
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    And Autoresponder page should have following sections
      | FAQ knowledge base |
      | FAQ Configuration  |
    When User clicks on the Add QNA button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             |
      | Auto Responder | Auto New | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card |

  @faq_Config_empty
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @faq_Config_empty
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "<responseType>" - card name "<cardName>"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "<responseType>" - card name "<cardName>"

    #When User clicks on "Save" FAQ configuration Button
    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card |

  @all_media_check
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @all_media_check
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Text" - card name "<cardName>"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Text" - card name "<cardName>"
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "RichTextMessage" - card name "Automation Testing RTM response card"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "RichTextMessage" - card name "Automation Testing RTM response card"
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Message" - card name "Automation Testing RTM response card"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Message" - card name "Automation Testing RTM response card"
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Image" - card name "Automation Testing Response card"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Image" - card name "Automation Testing Response card"
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Audio" - card name "Audio1"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Audio" - card name "Audio1"
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Video" - card name "Automation Testing Response card"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Video" - card name "Automation Testing Response card"
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"

    #When User clicks on "Save" FAQ configuration Button
    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card |

  @delete1_check
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @delete1_check
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    #When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    #Then Customer Support Transfer toggle should be in "Disabled"
    Then Customer Support Transfer toggle should be in "Enabled-OFF"
    #Then Customer Support Transfer toggle should be in "Enabled-ON"
    When User enter Customer Support Keyword "<csKeyword>"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             | csKeyword |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card | test      |

  @onlyWelcomeMessage
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @onlyWelcomeMessage
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Text" - card name "<cardName>"
    Then Customer Support Transfer toggle should be in "Disabled"
    When User clicks on "Save" FAQ configuration Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             | csKeyword |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card | test145   |

  @onlyGlobalFallbackMessage
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @onlyGlobalFallbackMessage
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Text" - card name "<cardName>"
    Then Customer Support Transfer toggle should be in "Enabled-OFF"
    When User clicks on "Save" FAQ configuration Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             | csKeyword |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card | test145   |

  @welcomeANDglobalfallbackMessage
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @welcomeANDglobalfallbackMessage
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Text" - card name "<cardName>"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Text" - card name "<cardName>"
    Then Customer Support Transfer toggle should be in "Enabled-OFF"
    When User clicks on "Save" FAQ configuration Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             | csKeyword |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card | test145   |

  @welcomeANDglobalfallbackMessageWITHcs
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @welcomeANDglobalfallbackMessageWITHcs
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "Welcome Message - to TMG Gallery" and "Text" - card name "<cardName>"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Text" - card name "<cardName>"
    Then Customer Support Transfer toggle should be in "Enabled-OFF"
    When User enter Customer Support Keyword "<csKeyword>"
    When User clicks on "Save" FAQ configuration Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             | csKeyword |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card | test145   |

  @limitq
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @limitq
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    #When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button

    Examples: 
      | ModuleName     | textmessage | qtype    | responseType | responseTypeE | cardName                             | Question                                                                                                                                                                                                                                                                                                                                                                                                          |
      | Auto Responder | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card | Auto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto New1 |

  @quesmandatory
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @quesmandatory
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User clicks on FAQ Action "Save" Button
    Then check for the FAQ "QuestionMandatory" error message as "Question field is required"
    When User creates Question as "<Question>" in "<qtype>"
    When User clicks on FAQ Action "Save" Button
    Then check for the FAQ "ResponseMandatory" error message as "This Field is required"

    Examples: 
      | ModuleName     | textmessage | qtype    | responseType | responseTypeE | cardName                             | Question | Question-limitexceed                                                                                                                                                                                                                                                                                                                                                                                              |
      | Auto Responder | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card |     2131 | Auto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto New1 |

  @limit
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @limit
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question-limitexceed>" in "<qtype>"
    When User clicks on FAQ Action "Save" Button
    Then check for the FAQ "QuestionTextLimt" error message as "Text limit exceeded."

    Examples: 
      | ModuleName     | textmessage | qtype    | responseType | responseTypeE | cardName                             | Question | Question-limitexceed                                                                                                                                                                                                                                                                                                                                                                                              |
      | Auto Responder | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card |     2131 | Auto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto New1 |
