Feature: Login
Scenario: Successful login with valid credentials
   Given User launch Chrome Browser
   When User opens the URL
   And User enter Email and Password
   And click on Login
   Then Verify the page Tittle
   When User click on Logout Link
   And close browser
