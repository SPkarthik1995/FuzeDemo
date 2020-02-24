

Feature: Performing demo functionality 

  Scenario Outline: Demo functionality of fuze
    Given User is in the home page
    And User click on the demo menu
    When User fill the following credentials "<FirstName>"  "<LastName>" and "<CompanyName>"  
   Then User click the Schedule a demo button

    Examples: 
      |FirstName   |LastName  |CompanyName|
      | Karthikeyan|Palanisamy| Aspire    |
    
