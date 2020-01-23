Feature: Feature to add a new pet to pet store and verify if the pet has been added

Background: Initialize Base URI and resorece path to add a pet

Scenario Outline: User wants to add a new pet to petstore

Given user wants to add a pet with pet ID <PetID> name "<PetName>" status "<PetStatus>"

And user builds the JSON

When user hits a "POST" request

Then user gets a response with status code "200"

And user verifies if the pet has been added successfully

Examples:
|PetID|PetName|PetStatus|
|01   |Henry  |Owned    |


 