Feature: Work with different elements on Different Elements Page

  Scenario: Select checkboxes, radio and dropdown on Different Elements Page.
    Given I open JDI GitHub site
    And I login as user "Roman Iovlev"
    And I click on "Service" button in Header
    And I click 'Different Elements' through the header menu Service
    When I select checkboxes 'Water' and 'Wind' on Different Elements Page
    And I select radio 'Selen' on Different Elements Page
    And I select in dropdown 'Yellow' on Different Elements Page
    Then I check if 'checkbox, radio button, dropdown names' and theirs statuses are corresponding to selected
