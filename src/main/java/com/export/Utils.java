package com.export;

import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by Philip Kwadwo Appiah
 */
@Component
public class Utils {

    private Random random;

public Utils(){
    random = new Random();
}

    public String generateRandomChars(String pattern, int length) {
        StringBuilder sb = new StringBuilder();


       return random.ints(0, pattern.length())
                .mapToObj(i -> pattern.charAt(i))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    public Integer generateRandonInteger(Integer integer){
    return random.ints(integer, 80)
            .findAny()
            .getAsInt();
    }
}
