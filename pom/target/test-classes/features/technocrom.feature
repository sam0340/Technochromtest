Feature: Technocrom Website Automation

  Scenario: Verify Homepage Elements
    Given the user is on the Technocrom homepage
    Then the user should see the header section
    And the user should see the latest articles section
    And the user should see the footer section

  Scenario: Navigate to About Us page from Company header on homepage
    Given the user is on the Technocrom homepage
    When the user clicks on the "Company" header
    Then the user should be navigated to the About Us page
    And the user should see the Company Profile section
    And the user should see the Our Journey section
    And the user should see the Mission Vision section
    And the user should see the "Why Technocrom" section
    And the user should see the "Life At Technocrom" section
    And the user should see the "How We Work" section
    And the user should see the footer section

  Scenario: Verify Resources Page
    Given the user is on the Technocrom homepage
    When the user clicks on the "Resources" link
    Then the user should be navigated to the Resources page


