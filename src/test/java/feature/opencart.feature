Feature: adding iphone to cart

Scenario: User select the item
	Given User launch the application
	When User scroll down
	And User select iphone
	
Scenario: user viewing the product
	Given User viewing
	When User click full view
	And User close full view
	Then User first view
	And User close first view
	Then User second view
	And User close second view
	Then User third view
	And User close third view
	Then User fourth view
	And User close fourth view
	Then User fifth view
	And User close fifth view
	Then User viewing review
	And User swichback to description
	
Scenario: User added to cart
	Given User adding
	When User added qty
	And User scrolldown
	Then User click ATC