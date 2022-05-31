Feature: Leaftaps login functionality


Scenario Outline:  login with the positive credential

Given Enter the username as <username>
And Enter the password as <password>
When click the login button
Then homepage should diplayed
 
Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|
 
Scenario:  login with the  negative credential

Given Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When click the login button
But Error msg should be displayed




