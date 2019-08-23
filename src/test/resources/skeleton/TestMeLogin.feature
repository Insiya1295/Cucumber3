Feature: Validation for testme app registration

  @Regression
  Scenario Outline: Registration for testme app
    Given User launches the Url
    When User enters valid details in form by clicking on Sign Up link
    Then User enters the valid username"<uname>"
    And User enters the valid firstname"<fname>"
    And User enters the valid lastname"<lname>"
    And User enters the valid password"<pword>"
    And User enters the valid confirm password"<cpword>"
    And User enters the valid gender
    And User enters the valid email"<email>"
    And User enters the valid mobile number"<mno>"
    And User choose the valid date of birth"<dob>"
    And User enters the valid address"<address>"
    And User enters the required security Question
    Then User choose the valid answer
    Then User clicks on register button

    Examples: 
      | uname            | fname   | lname    | pword       | cpword      | email               | mno        | dob        | address                    |
      | Gauri101Amte     | Gauri   | Amte     | gauri7864   | gauri7864   | gauri10@gmail.com   | 1234567890 | 03/10/1995 | Itwari bohra masjid,Nagpur |
      | Haritha161Nair   | Haritha | Nair     | haritha7864 | haritha7864 | haritha16@gmail.com | 2365478910 | 12/16/1995 | Itwari bohra masjid,Nagpur |
      | Achal161Gundawar | Achal   | Gundawar | achal7864   | achal7864   | achal16@gmail.com   | 7894561239 | 02/16/1995 | Itwari bohra masjid,Nagpur |

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
