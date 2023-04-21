Feature: Login to HRM application 

@login
Scenario Outline: User should only be login with valid cred
Given I navigate to application URL 
When I enter valid "<someusername>" and "<somepassword>" 
And I click on login button
Then User should be able to login "<status>"
Examples:
|someusername		|somepassword|		status|
|admin					|Admin1		 	 |		Failure|
|Admin					|admin123		 |		Success|


