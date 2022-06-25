@CartPage
Feature: Cart Page

  @BuyProduct
  Scenario Outline: Buy Product
    Given User is on HomePage
    When Click Categories
    Then See Category Page
    When Click Woman filter
    Then Click Women Wear filter
    When Swipe Down and Click Blouse
    Then Click filter icon
    Then Click color filter
    When Search "<color>" color
    Then Click black icon
    Then Click apply button
    Then Click list products
    When Select first product from list
    Then Click AddToCart Button
    Then See details and Select size
    Then Click AddToCart Button
    Examples:
      | color |
      | Siyah |


  @CheckProduct
  Scenario Outline: Check Product
    Given User is on HomePage
    When Click Categories
    Then See Category Page
    When Click Woman filter
    Then Click Women Wear filter
    When Swipe Down and Click Blouse
    Then Click filter icon
    Then Click color filter
    When Search "<color>" color
    Then Click black icon
    Then Click apply button
    Then Click list products
    When Select first product from list
    Then Click AddToCart Button
    Then See details and Select size
    Then Click AddToCart Button
    Then Click Close Icon
    When Click CartPage Icon
    Then Check CartPage
    Then should see "<size>" size text
    Then should see "<color>" color text
    Then should see "<model>" model text
    Examples:
      | size | color | model   |
      | M    | Siyah | W1JR68Z8-RQN |

  @PurchaseProduct
  Scenario Outline: Purchase Product
    Given User is on HomePage
    When Click Categories
    Then See Category Page
    When Click Woman filter
    Then Click Women Wear filter
    When Swipe Down and Click Blouse
    Then Click filter icon
    Then Click color filter
    When Search "<color>" color
    Then Click black icon
    Then Click apply button
    Then Click list products
    When Select first product from list
    Then Click AddToCart Button
    Then See details and Select size
    Then Click AddToCart Button
    Then Click Close Icon
    When Click CartPage Icon
    Then Check CartPage
    Then should see "<size>" size text
    Then should see "<color>" color text
    Then should see "<model>" model text
    Then Click Checkout Button
    Examples:
      | size | color | model   |
      | M    | Siyah | W1JR68Z8-RQN |
