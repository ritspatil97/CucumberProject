Feature: List of soft tester and his boss

@Smoke
Scenario: I am good ST and my boss loves me 
Given I am a "good" QA
When I go to work 
And I "involve" with it 
Then Boss "loves" me
@Sanity
Scenario: I am avg ST and my boss forgives me 
Given I am a "avg" QA
When I go to work 
And I "work" with it 
Then Boss "forgives" me

Scenario: I am bad ST and my boss hates me 
Given I am a "bad" QA
When I go to work 
And I "mess" with it 
Then Boss "hates" me

# hash is used for comment in feature file 