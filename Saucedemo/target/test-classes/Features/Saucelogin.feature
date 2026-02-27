@saucelogin
Feature:   saucedemo login
@smoktesting
Scenario: login to the application
Given user should enter the valid username
When user can enter the  valid password
And click on the login button
And user logged into the application successfully
#Select a product
And user select the product
#Add the product to the cart
And user add the product into cart
#Navigate to the cart
And user navigate to the cart
And user click on checkout button
#Complete the order process
And user can enter the first name
And user can enter the last name
And user can enter the zip/postal code
And user can click on continue button
And user can click on cancel button
And user can complete the order process
#Repeat cancelling the order, removing the added product from cart etc
And user can click on cart container
And user can remove the added product successfully 
Then  user can clcik on continue the shopping button navigates to home page