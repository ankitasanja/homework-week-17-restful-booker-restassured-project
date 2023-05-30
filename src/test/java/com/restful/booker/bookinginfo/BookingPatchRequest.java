package com.restful.booker.bookinginfo;

import com.restful.booker.model.BookingPojo;
import com.restful.booker.testbase.TestBaseBooking;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BookingPatchRequest extends TestBaseBooking {

    @Test
    public void updatePartialDetails(){

        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname("Name After");
        bookingPojo.setLastname("Patch");


        given().log().all()
                .contentType(ContentType.JSON)
                .header("Accept", "application/json")
                .header("cookie", "token=ad18040baafe03b")
                .body(bookingPojo)
                .pathParam("bookingId", 2)
                .when()
                .patch("/{bookingId}")
                .then()
                .statusCode(200)
                .log().all();

    }


}
