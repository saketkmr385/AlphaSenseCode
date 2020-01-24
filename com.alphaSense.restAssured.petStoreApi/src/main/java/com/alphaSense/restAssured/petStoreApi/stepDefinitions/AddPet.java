package com.alphaSense.restAssured.petStoreApi.stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import com.alphaSense.restAssured.petStoreApi.utils.*;
import com.alphaSense.restAssured.petStoreApi.seriliazation.*;

public class AddPet {
	
	private SpecBuilders requestSpec =  new SpecBuilders();
	private RequestSpecification request;
	private int id;
	private String name;
	private String status;
	
	@Given("user wants to add a pet with pet ID {int} name {string} status {string}")
	public void user_wants_to_add_a_pet_with_pet_ID_name_status_Owned(int ID, String name, String status) {
		this.id = ID;
		this.name = name;
		this.status = status;
	    
	}

	@Given("user builds the JSON")
	public void user_builds_the_JSON() {
		
		Category category = new Category();
		category.setId(id);
		category.setName(name);
		
		ArrayList<String> photoURLs = new ArrayList<String>();
		photoURLs.add("URL1");
		photoURLs.add("URL2");
		
		Tag tag = new Tag();
		tag.setId(id);
		tag.setName(name);
		
		ArrayList<Tag> arrayOfTags = new ArrayList<Tag>();
		arrayOfTags.add(tag);
		
		ArrayList<String> tags = new ArrayList<String>();
		tags.add("HomeDog");
		tags.add(name);
				
		
		RequestSerilization req = new RequestSerilization();
		req.setId(id);
		req.setCategory(category);
		req.setName(name);
		req.setPhotoUrls(photoURLs);
		req.setTags(arrayOfTags);
		req.setStatus("Owned");		
				
		request = given().spec(requestSpec.requestSpecification()).body(req);
	}

	@When("user hits a {string} request")
	public void user_hits_a_request(String httpMethod) {
		
		request.log().all().when().post("/pet/").then().assertThat().statusCode(200);
	   	   
	         
	}

	@Then("user gets a response with status code {string}")
	public void user_gets_a_response_with_status_code(String string) {
	   
	}

	@Then("user verifies if the pet has been added successfully")
	public void user_verifies_if_the_pet_has_been_added_successfully() {
	    
	}

}
