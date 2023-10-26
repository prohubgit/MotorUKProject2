Feature:  Search For Used Car Available For Sale
  As customer i want the ability to search for used cars availbe for sale
  so that i can know more about the car before i buy

  Scenario Outline: Customer can search for any used car available for sale
    Given I navigate to motors homepage
    When I enter "<postCode>" in the post code text box
    And I select "<Make>" from Make dropdown
    And I select "<Model>" from Model dropdown
    And I select "<MinPrice>" from Min price dropdown
    And I select "<MaxPrice>" from Max Price dropdown
    And I click on Search button
    Then A list of used cars for sale within that range are displayed

    Examples:
    |postCode|Make     |Model  |MinPrice     |MaxPrice|
    |b23 7Rx |Mercedes |E220   |£5000        |£15000  |
    |B10 0us |Audi     |A3     |£2000        |£13000  |
