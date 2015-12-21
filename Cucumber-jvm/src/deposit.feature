Feature: Depositing money in to a User account
 
Scenario: Depositing money in to an empty User's account should add money to the User's current balance
Given a User has no money in their account
When 100€ is deposited in to the account
Then the balance should be 100€

Scenario: Depositing money in to an account with money should add money to the User's current balance
Given a User has 100€ in their account
When 100€ is deposited in to the account
Then the balance should be 200€