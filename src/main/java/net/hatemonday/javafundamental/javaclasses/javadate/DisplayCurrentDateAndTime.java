package net.hatemonday.javafundamental.javaclasses.javadate;

import java.time.LocalDateTime;

public class DisplayCurrentDateAndTime {

    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);
    }
}
