Feature: fb sign up



@fbsignup
Scenario Outline:
Given user visit facebook url
When user clik on Create new account
When user put "<first name>" and "<last name>" also"<mobile number>" and "<password>"
Then user select dropdown Month and dropdown Day and dropdown Year
Then user click male as gender
Then user will be able to sign up successfully 

Examples:
|first name|last name|mobile number|password|Month|Day|Year|
|mon       |SUR      |+12314933489|@Sharu143|03   |20 |1993|