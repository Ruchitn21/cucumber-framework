Feature: Search and Place the order for Products

  Scenario: Search Experience for product search in both home and Offers Page
    Given User is on GreenKart Landing Page
    When User searched with Shortname "Tom" and extracted actual name of Product
    Then User searched for "Tom" shortname in offers page
    And validate product name in Offers Page matches with Landing Page