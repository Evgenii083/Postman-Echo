import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    public void postmanEchoTest(){

        given()
                .baseUri("https://postman-echo.com")
                .body("Test message")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Test message"))
        ;
    }
}
