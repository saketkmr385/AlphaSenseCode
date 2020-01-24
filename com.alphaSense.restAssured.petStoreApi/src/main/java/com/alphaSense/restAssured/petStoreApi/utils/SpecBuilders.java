package com.alphaSense.restAssured.petStoreApi.utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class SpecBuilders {
	
	public RequestSpecification requestSpecification(){
		return new RequestSpecBuilder().setBaseUri("https://petstore.swagger.io/v2").addHeader("Content-Type", "application/json").build();
	}
	
	

	

}
