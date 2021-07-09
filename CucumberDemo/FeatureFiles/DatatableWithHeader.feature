#sending values through data table with header
Feature: This is  the login  feature for Orange HRM 
Scenario: This is the login scenario 
    Given Go to login page 
    When   enters the below credentials 
    |username|password|
    |Admin|admin123|
    And click login button 