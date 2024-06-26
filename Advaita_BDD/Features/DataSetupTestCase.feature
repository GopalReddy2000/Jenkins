Feature: Data SetUp

Background: Steps Commomn for all scenarios

          Given User Lunch Chrome Browser
          When User opens URL "https://app.transmonqa.in/en/myprofile/login/"
          And User Enters Name as "Manu" and Password as "Qwerty@123"
          And Click on Sign In Button
          Then Page URL Should be "https://app.transmonqa.in/en/myprofile/myprofile/"
          When User Click on Data SetUp Option
          Then Data SetUp Initial Page URL Should be "https://app.transmonqa.in/en/data_management/process/"
          And  Process, Data Set, Metadata, Data Upload Tab Should Display

Scenario: Add New Process Management Record
       
          Then Click on Create Button
          And Add Processes PupUp Should Display
          And Enter Process Name
          And Enter Process Description
          And Select the Status in Process Tab
          When Click On Save and Continue Button On Process Tab
          Then Sub Process Tab Should Diaplay
          And Select The Process From Select Process DropDown
          And Enter Sub Process Name in Sub Process Tab
          And Enter the Description in Sub Process Tab
          And Select the Status in Sub Process Tab
          When Click On Save and Continue Button On Sub Process Tab
          Then Sub Sub Process Tab Should be Diaplay
          And Select The Process From Select Process DropDown
          And Enter Sub Sub Process Name in Sub SUb Process Tab
          And Enter the Description in Sub Sub Process Tab
          And Select the Status in Sub Process Tab
          And Click On Save and Update Button On Sub Sub Process Tab
          Then Sucess Pup up Should Display
          And Collapse the DropDowns
          And Edit Process , Sub Process, Sub Sub Process
          Then Search the Created Record
          And Check the Pegination of Create Process Page
          And Check Total Number of Records in Process Tab
          Then Click on Data Set Tab
          And Check Data Set Tab Page URL
          And Click on Data Set Create
          Then Create DataSet Pop-Up Should be displayed
          And Enter Data Set Name in DataSet Name Field
          And Select Process , Sub Process , Sub Sub Process
          Then Enter Field Name , Label Name
          And Select Type and Enter Max Length
          And Select Mandetory Drop Down
          Then Add Three Row with All the Details
          And Delete One Row
          Then Click on Create Data Set Button
          And Close Browser
          
Examples:
|name|password|
|Manu|Qwerty@123|