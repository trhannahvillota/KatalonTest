#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@smoke
Feature: Login to Portal
  I want to use this template for my feature file

  @login
  Scenario Outline: Be able to Login on Portal
    Given I navigate to PIQ Portal <url>
    When I login valid <email> and <password>
    Then I should be navigated to PIQ Portal landing page

    Examples: 
      | url  | email | password  |
      | https://dev-piqstrataportal.tooltwist-project.com/login | vi.eliseo+newOwner@tooltwist.com | @access4VIANNE1 |