Feature: In the Blibli website select the store fresh search for the product kiwi , add the product to cart checkout and make payment

  Background: The base URI  for the website
    Given The base URI "https://wwwuatb.gdn-app.com"

  @SelectStore
  Scenario Outline: select the Fresh store "<longitude>"
    When The user gives longitude and latitude "<longitude>","<latitude>"
    Then Validate the response

    Examples:
      | longitude   | latitude            |
      | 106.9412852 | -6.2345951999999993 |

  @SelectAproduct
  Scenario Outline: Search for the product "<productname>"
    When The user searches the product "<productname>" in the fresh store
    Then Validate whether the users request and response is same

    Examples:
      | productname |
      |  Kiwi       |

  @AddProductToCart
  Scenario Outline: Add the product to the cart "<cartid>"
    When The user clicks the add to cart button the products gets added to the cart "<quantity>","<cartid>","<source>","<instantpickup>","<latitude>","<longitude>"
    Then Validate whether the product is added to the cart

    Examples:
      | quantity | cartid           | source                   | instantpickup | latitude           | longitude   |
      | 1        | 5bcac0b9c11b4830 | grocery-search-BLIBLI_GO | false         | -6.181771901720053 | 106.9731458 |

  @CheckOut
  Scenario Outline: Move to the checkout page and complete the payment
     When The user gives longitude and latitude "<longitude>","<latitude>" for checkout
     Then The response is validated for checkout

     Examples:
       | longitude         | latitude            |
       | 106.9049820676446 | -6.1613085692376801 |

  @Payment
  Scenario Outline: The user proceeds to pay for the selected product
    When The user clicks of the payment button and pays the amount for the product "<productid>"
    Then validate the response for payment

    Examples:
      | productid                |
      | 668e25b8135a6f65270aab4b |

  @ThankYouMessage
  Scenario Outline: After placing the order the user will see a thank you message
    When The user completes the payment "<orderid>"
    Then Validate the thank you message
    Examples:
      | orderid     |
      | 27007780990 |


