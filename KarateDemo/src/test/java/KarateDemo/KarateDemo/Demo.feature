
Feature: Fetch user details

Scenario:Get Call Test

Given url 'https://reqres.in/api/users?page=2'

When method GET

Then status 200