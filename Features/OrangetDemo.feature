Feature: Get A Free Demo validation



@demo
Scenario Outline:
Given consumer explore to OrangHRM page
When consumer click on  a free demo
And consumer put"<first name>" and "<last name>" alos "<email>" phone"<phone>"
Then consumer select dropdown for country
Then consumer click on i am not robot
Then consumer click on get a free demo


Examples:
|first name|last name|email               |phone|
|mon       |sur      |a.agnhfgh@gmail.com|5188210274|
