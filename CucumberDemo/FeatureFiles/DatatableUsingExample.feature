Feature: Login Action
 
Scenario Outline: Successful Login with Valid Credentials
 Given User is on Home Page
 When User Navigate to LogIn Page
 And User enters "<username>" and "<password>"
 Then Message displayed Login Successfully
Examples:
    | username| password |
    | Admin | admin123 |
    | admin1216| 1216|