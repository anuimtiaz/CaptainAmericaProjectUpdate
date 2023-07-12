package upskill.api.restassured;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import java.io.File;

public class RestApiActions {

	public void createPet() {
		given().
		body(new File(System.getProperty("user.dir")+
				"/src/test/resource/ApiRequestPayloads/CreatePetRequest.json")).
		when().
		header("Content-Type", "application/json").
		post("https://petstore.swagger.io/v2/pet").
		then().
		log().body().
		and().
		assertThat().statusCode(200).
		and().
		body(matchesJsonSchema(new File(System.getProperty("user.dir")+
				"/src/test/resource/ApiResponseSchemas/CreatePetResponse.json")));
	}

	public void getPet() {
		given().
		when().
		header("Content-Type", "application/json").
		get("https://petstore.swagger.io/v2/pet/33").
		then().
		log().body().
		and().
		assertThat().statusCode(200).
		and().
		body(matchesJsonSchema(new File(System.getProperty("user.dir")+
				"/src/test/resource/ApiResponseSchemas/GetResponse.json")));
	}

	public void updatePet() {
		given().
		body(new File(System.getProperty("user.dir")+
				"/src/test/resource/ApiRequestPayloads/UpdatePetRequest.json")).
		when().
		header("Content-Type", "application/json").
		put("https://petstore.swagger.io/v2/pet").
		then().
		log().body().
		and().
		assertThat().statusCode(200).
		and().
		body(matchesJsonSchema(new File(System.getProperty("user.dir")+
				"/src/test/resource/ApiResponseSchemas/UpdateResponse.json")));
	}

	public void deletePet() {
		given().
		when().
		header("Content-Type", "application/json").
	
		delete("https://petstore.swagger.io/v2/pet/33").
		then().
		log().body().
		and().
		assertThat().statusCode(200).
		and().
		body(matchesJsonSchema(new File(System.getProperty("user.dir")+
				"/src/test/resource/ApiResponseSchemas/DeletedResopnse.json")));
	}
	
	
	//abck

}
