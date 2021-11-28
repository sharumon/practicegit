Feature: Orange contact sales validation


@contactsales
Scenario Outline:
Given user land on orangehrm page
When user click on contact sales
When user enter name"<first name>" last name"<last name>" and"<company name>"
When user select dropdown No of Employees
And user enter job "<job title>" phone number"<phone number>" email"<email>"
And user select dropdown for County
Then user write" <message>"
Then user click on i am not a robot
And user click on submit button


Examples:
|first name|last name|company name|job title|phone number|email|message|
|monsur    |ahmed    | nextt ech | QA         |5188210274|nelson2013worker@gmail.com|hi|