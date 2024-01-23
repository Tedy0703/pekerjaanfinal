package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;


import static helper.Utility.generateRandomEmail;

public class Models {

    private static RequestSpecification request;

    public static void setupHeaders(){
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer 196d8e304358d69efaa968214f24cc6c35fc8d79d49ec2ee9b994e58339f9824");
    }

    public static Response getListUsers(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }
    public static Response postCreateUsers(String endpoint) {
//System.out.println(endpoint);
        String name = "Tedy Nur Heryana";
        String gender = "male";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);

    }
}


