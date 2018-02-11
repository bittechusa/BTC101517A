Feature: Login


Background:
Given nevigate to url




Scenario:
Given nevigate to target.com
When i clicked menlink
And i clicked first men prod
And i click 
@smoke
Scenario:


When i verify the homepage title
Then i should get true result


@reg
Scenario Outline:

When i type userId <user>
And I type pass <password>
And i click login button

Examples:
|user|password|
|"abc"|"f124"|
|"vda"|"dfg546"|
|"fgh"|"dgf675"|