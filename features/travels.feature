Feature: travel from to a station

  Scenario: travel from Amsterdam to Utrecht
    Given NS app is started
    And I have clicked OK in time zone pop up
    And I travel from Amsterdam
#    And I travel to Utrecht



#    Then I find result

  And I close the app
