Feature: Launch website using info from dataTable

  Scenario Outline: Launch Websites
    Given Go to '<URL>'
    
    Examples:
      | URL                           |
      | https://www.flipkart.com      |
      | https://www.amazon.com        |
      | https://demo.nopcommerce.com/ |
