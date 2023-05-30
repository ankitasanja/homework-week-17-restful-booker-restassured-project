package com.restful.booker.utils;

import java.util.Random;

public class TestUtils {

    public static String getRandomValue(){
        Random random = new Random();
        int randomInt = random.nextInt(100000);
        return Integer.toString(randomInt);
    }
    /*public static String getRandomValue1(){
        Random random = new Random();
        String randomInt = random.nextInt(100000);
        return Integer.toString(randomInt);
    }*/
}
