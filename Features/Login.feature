Feature: Login
#comment
#cntrl+shift+F-->to pretty align the cucumber feature file (to maintain intendation)

@sanity  @regression
Scenario: Login with valid credentials
  Given User Launch browser
  And opens url "http://tutorialsninja.com/demo/index.php?route=common/home"
  When User navigate to MyAccount menu
  And click on Login
  And user enters Email as "pavanoltraining@gmail.com" and Password as "test@123"
  And clicks on Login button
  Then User navigates to MyAccount Page