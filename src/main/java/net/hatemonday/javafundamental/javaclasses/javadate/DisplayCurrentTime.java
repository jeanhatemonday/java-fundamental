package net.hatemonday.javafundamental.javaclasses.javadate;

import java.time.LocalTime;

public class DisplayCurrentTime {

    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
    }
}
