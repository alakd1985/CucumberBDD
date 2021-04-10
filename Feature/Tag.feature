@FunctionalTest
Feature: ECommerce Application
 
@SmokeTest @RegressionTest
Scenario: Successful Login
Given This is a blank testone
 
@RegressionTest
Scenario: UnSuccessful Login
Given This is a blank testtwo
 
@SmokeTest 
Scenario: Add a product to bag
Given This is a blank testthree
 
Scenario: Add multiple product to bag
Given This is a blank testfour
 
@SmokeTest @RegressionTest
Scenario: Remove a product from bag
Given This is a blank testfive
 
@RegressionTest
Scenario: Remove all products from bag
Given This is a blank testsix
 
@SmokeTest
Scenario: Increase product quantity from bag page
Given This is a blank testseven
 
Scenario: Decrease product quantity from bag page
Given This is a blank testeight
 
@SmokeTest @End2End
Scenario: Buy a product with cash payment
Given This is a blank testnine
 
@SmokeTest @End2End
Scenario: Buy a product with CC payment
Given This is a blank testen
 
@End2End
Scenario Outline: Payment declined
Given This is a blank testeleven
Examples:
|PaymentMethod|
|CC Card|
|DD Card|
|Bank Transfer|
|PayPal|
|Cash|