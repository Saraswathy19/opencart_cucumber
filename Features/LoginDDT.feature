Feature: Login
#comment
#cntrl+shift+F-->to pretty align the cucumber feature file (to maintain intendation)

@sanity
Scenario: Login with valid credentials
  Given User Launch browser
  And opens url "http://tutorialsninja.com/demo/index.php?route=common/home"
  When User navigate to MyAccount menu
  And click on Login
  And user enters Email as "<email>" and Password as "<password>"
  And clicks on Login button
  Then User navigates to MyAccount Page
  
  
 Examples:
    | email                    | password    |
    |pavanoltraining@gmail.com | test@123    |
    |saravictory123@gmail.com  | sara@12     |