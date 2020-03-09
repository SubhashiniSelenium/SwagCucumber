Feature: Sauce demo
@tc01_Login
Scenario:
Login to Sauce demo
Given user launches the chrome browser
When the user opens the sauce demo homepage
Then the user enters the username and password
And the user click the login button

@tc02_AddToCart
Scenario:
Add a product to the cart
Given the user launched the chrome browser
When user opens the Sauce demo homepage
Then user enters the username and password
Then the user clicks the login button
And the product is added to cart

@tc03_Search
Scenario:
Search A to Z products
Given user launched chrome browser
When user opens Sauce demo homepage
Then user enters username and password
Then user clicks login button
Then product is add to cart
And it serachs A to Z items


