package com.alphaSense.restAssured.petStoreApi.runner;

import io.cucumber.core.cli.Main;

public class MainRunner {
	
	public static final String features = "classpath:features/addNewPet.feature";
	
	public static void main(String[] args){
		
		Main.main(new String[] {features, "-g","com/alphaSense/restAssured/petStoreApi/globalHooks",
				   "-g","com/alphaSense/restAssured/petStoreApi/stepDefinitions"});
	}
	
	

}
