Feature: Passing data in steps

  Scenario: Provide mulitple data for particular step
    Given user has multiple data
      | Oranium    |
      | Tech       |
      | velacherry |
      | Chennai    |
    Then data can be fectched

  Scenario: Provide mulitple datas for particular step
    Given user has multiple data in datatable
      | Oranium    |  2367 |
      | Tech       |  8974 |
      | velacherry | 89745 |
      | Chennai    | 12354 |
    Then data can be fectched

  Scenario: Provide the data with Heading
    Given user has values in form of Key and Value
      | Id   |      001 |
      | Name | Abinisha |
      | City | Chennai  |

  Scenario: Provide multiple data for one Heading
    Given user has multiple data for multiple heading
      | ID  | Name     | City      |
      | 001 | Abi      | Chennai   |
      | 002 | Shalini  | Bangalore |
      | 003 | Santhosh | Hyderbad  |
