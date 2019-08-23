Feature: Validation for testme app registration
  @Smoke
  Scenario Outline: Login for testme app
    Given User launch the site
    Then User enters  name "<usname>"
    And User enters  pas "<paswrd>"
    Then user clicks on login button

    Examples: 
      | usname  | paswrd      |
      | Lalitha | Password123 |

  @Smoke
  Scenario: Product search and purchase
    Given Product Search Engine
    Then User proceed towards adding product to cart
    Then User click on cart link
    Then User verifies the product is correctly added to the cart
    Then user clicks on checkout for payment
    Then User Review the product and click on proceed to pay
    Then User select the bank of his/her choice
    Then User clicks on continue for further details
    Then User give valid credentials according to selected bank
    Then User than give the required transaction password
    And User verifies for the order is confirmed

  @Smoke
  Scenario: User moves to cart without adding any item in it
    Given User registered in TestMeApp
    When User Search for product like headphones
    And try to proceed to payment without adding any item in the cart
    Then TestMe doesn't display the cart icon
