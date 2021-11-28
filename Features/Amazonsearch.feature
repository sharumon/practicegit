Feature: user want to visit amazon web page and verify search 

in order   verify search 
as a register user 
i want to visit amazon web page and write a text in serch box then search 

@ama1
Scenario Outline:
Given user vist amazon home page 
And user search by "<productname>"
Then user click on search button


Examples:
|productname  |    
| iphone|