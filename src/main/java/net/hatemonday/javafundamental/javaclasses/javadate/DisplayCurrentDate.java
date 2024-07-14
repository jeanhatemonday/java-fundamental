package net.hatemonday.javafundamental.javaclasses.javadate;

import java.time.LocalDate;

public class DisplayCurrentDate {

    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);
    }
}
