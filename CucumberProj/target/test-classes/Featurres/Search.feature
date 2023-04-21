Feature: Searching of various product cat should be possible along with product search 



Background: Visiting the website as a guest user
Given I visit the website as a guest user


Scenario: user should be able to search for the products under books categary 

When I select the books option from the search dropdown
And I click on search icon option 
Then I should see the page having heading as Amazon Best Reads is getting displayed 
But I should not see the other category products 

@Smoke
Scenario: user should be able to search for the products under baby categary 

When I select the baby option from the search dropdown
And I click on search icon option 
Then I should see the page having heading as Baby products is getting displayed 
But I should not see the other category products 