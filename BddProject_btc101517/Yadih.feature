Feature: login 

Scenario: 
Given nevigate to url
When i type my valid userId
And I type my valid password
And I click on login button
Then as a user i should be logged in

Scenario: 
Given nevigate to url
When verify title

Scenario: 
Given nevigate to url
When i type my invalid userId
And I type my invalid password
And I click on login button
Then as a user i should not be logged in