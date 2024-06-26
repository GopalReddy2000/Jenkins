Feature: Login

Scenario: Successful Login For Valid Credentials
          
          Given User Lunch Chrome Browser
          When User opens URL "https://app.transmonqa.in/en/myprofile/login/"
          And User Enters Name as "<name>" and Password as "<password>"
          And Click on Sign In Button
          Then Page Title Should be "https://app.transmonqa.in/en/myprofile/myprofile/"
          When User Click LogOut Button
          Then Page URL Should be "https://app.transmonqa.in/en/myprofile/login/"
          And Close Browser
          
Examples:
|name|password|
|Manu|Qwerty@123|