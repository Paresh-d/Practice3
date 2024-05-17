Feature: Login function test
Description:
Background:

Scenario: Login function test with valid credential

Given Open a browser
And go to application Url
When click signUp Btn
And put a valid User
And put a valid Password
And click Login Btn
And click dropDown Btn
Then Test will pass if logOut Btn found


