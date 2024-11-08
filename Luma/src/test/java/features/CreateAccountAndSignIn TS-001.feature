Feature: Create Account functionality of luma
Scenario: Create Account with positive credientials
Given click on the create an account
And enter the first name
And enter the last name
And enter the email
And enter the password
And enter the confirm password
When click on the create an account button
Then My Account page to be displayed
And click on the my profile dropdown
And click on sign out
And click on the Sign in
And enter the user email
And enter the user password
When click on the sign in button
Then Home page to be displayed
