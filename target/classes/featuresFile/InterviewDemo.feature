@interviewdemo
Feature: Submitting a message through the contact form

  Scenario: Submitting a message successfully
  
    Given I navigate to automation exercice app
    When I click on Contact Us
    Then verify the page has changed and "GET IN TOUCH" is displayed
    And I fill out the form
      | Name     |asma |
      | Email    | benfrajasma@yahoo.com     |
      | Subject | test case            |
      | Your Message Here | i want to try testing |
    And I choose file
    And I click on Submit
    And verify the message "Success! Your details have been submitted successfully." is displayed
    