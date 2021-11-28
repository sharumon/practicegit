Feature: user wants to login facebook

Scenario Outline:
Given user visit facbook home 
When user enter email"<email>"
When user put "<password>"
Then user should be able to login facebook

Examples:
|email                     |   password |
|sweetcutesimple@hotmail.com|@Sharu143|




