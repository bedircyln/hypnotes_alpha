
@US_017
Feature: Options functionality in Sign Up
  User Story: As a user I should be able to see different options in Sign Up

  Acceptance Criteria:
  If 'Sign up as a hypnotherapist?', 'Hypnotherapist Register' should be clicked
  After clicking "Hypnotherapist Register, 'https://qa-test.hypnotes.net/register ' page should be seen.
  If Already have an account? Login should be clickable
  After clicking 'Login', 'https://qa-test.hypnotes.net/login' page should be seen


  Background: User should be in Homepage
    Given User goes to homepage
    And Use is on Homepage


  @US_017-TC001
  Scenario:
    When User clicks the Sign Up button
    And User clicks the Therapist button
    Then Assert user on register page
    When User clicks the Sign Up button
    Then Therapist button should be selected



