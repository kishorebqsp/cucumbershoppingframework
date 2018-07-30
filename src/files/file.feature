Feature: Loginpage

@validLogin
Scenario: Enter valid user crediatail and add product to cart 
Given  user should click on sign
When Enter valid "bharanigramesh28@gmail.com" and "bharani12345"
And click on login button
Then user should be succesfully login
When click on seaarch box and search for dress
Then user should navigate to dress page
When select the dress and add to cart
Then product should be add to cart and close the page
When user should be succesfully logout
Then logout page should be disaplyaed


@invalidlogin
Scenario: Enter invalid user crediatail and add product to cart 
Given  user should click on sign
When Enter valid "kishore" and "bharan"
And click on login button
Then user should be succesfully login


@check
Scenario: enter the product to cart
Given  user should click on sign
When Enter valid "bharanigramesh28@gmail.com" and "bharani12345"
And click on login button
Then user should be succesfully login
When click on seaarch box and search for dress


