
Feature: conduit CRUD functions
Background: login into app
Given user is on login page
When user provide "reachmeatnareshroyal@gmail.com" and "Royal@123"
Then user should be on homepage

Scenario: create new  article
Given user should be on new article page
When user enters article details
|title|Description|body|tags|
|Selenium11|Selenium tutorial by using java|selenium java,BDD cucumber,testng,maven|java and sql|
Then Article must be created
Scenario: view article
Given user should be on Gobal feed page
When user select an article"Artcle title"
Then Aricle must be displayed
Scenario: update article article
Given Article detail page must be displayed
When user update article detail
Then Article detail must be updated
Scenario: Delete an article
Given Article detail page must be displayed
When user delete article
Then Article must be deleted
