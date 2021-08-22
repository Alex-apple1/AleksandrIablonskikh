Feature: Work with different elements on Different Elements Page

  Scenario: Work with checkboxes, radio and dropdown.
    Given I open Front Page
    And I perform login to User Account Front Page
    And I open 'Different Elements Page' through the header menu Service
    When I select checkboxes 'Water' and 'Wind' on Different Elements Page
    And I select radio 'Selen' on Different Elements Page
    And I select in dropdown 'Yellow' on Different Elements Page
    Then I check if 'checkbox, radio button, dropdown names' and theirs statuses are corresponding to selected
    