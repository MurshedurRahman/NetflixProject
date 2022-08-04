Feature: login to my netflix account

Scenario Outline: simple login


Given I am on the netflix homepage
When I click on sign in
Then I put my "<username>" in the email address
And I put my "<password>"
And I click  sign in 
Then I access to my account

Examples:
| username              |   password |
|karimahmed159@yahoo.com|   miThu1*s |