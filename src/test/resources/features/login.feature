Feature: cucumber search google

Scenario: search cucumber 

Given google page is open 
When search with cucumber
	|version| date     |
	|6.9|   2021-11-11|
Then get result