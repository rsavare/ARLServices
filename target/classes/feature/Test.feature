#Author: rahulsavare@gmail.com
@arlservice
Feature: Login to the ARL Parcel Services

  Scenario Outline: User will be able to login to ARL Parcel Services
    When User Enters the URL "https://www.arlparcelservice.com"
    And User enters the username as "<username>"
    And user enters the password as "<password>"
    Then click on the SignIn button
    And validate user is on Home page

    Examples: 
      | username | password   |
      | Admin    | 9876543210 |
