package com.alphaSense.restAssured.petStoreApi.utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {
	
	public RequestSpecification requestSpecification(){
		return new RequestSpecBuilder().setBaseUri("http://petstore.swagger.io/v2").addQueryParam("key", "value").setContentType(ContentType.JSON).build();
	}
	
	

	

}
