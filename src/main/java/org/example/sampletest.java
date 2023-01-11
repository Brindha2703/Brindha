package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class sampletest {
  @Test
           public void test(){
      Response response = RestAssured.get("https://reqres.in/api/users?page=2");
                System.out.println("reposne: "+response.asString());
            }
        }
