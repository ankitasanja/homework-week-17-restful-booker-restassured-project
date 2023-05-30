package com.restful.booker.bookinginfo;

import com.restful.booker.testbase.TestBaseBooking;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BookingDeleteRequest extends TestBaseBooking {

    @Test
    public void deleteBooking(){
        given().log().all()
                .contentType(ContentType.JSON)
                .header("Cookie", "token=4e488450edcdda1")
                .pathParam("bookingId", 6)
                .when()
                .delete("/{bookingId}")
                .then()
                .statusCode(201)
                .log().all();
    }
}
