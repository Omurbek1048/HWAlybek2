package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        String name = "Alybek";
        int age = 30;
        int temperature = 24;

        if (20 < age && 45 > age) {
            if (-20 < temperature || 30 > temperature) {
                System.out.println("Можно идти гулять");
            } else {
                System.out.println("Оставайтесь дома");

            }

        }


        if (age < 20) {
            if (temperature >= 0 && temperature < 28) {
                System.out.println("Можно идти гулять");
            } else {
                System.out.println("Оставайтесь дома");
            }
        }


        if (age >= 45) {
            if (-10 <= temperature && 25 > temperature) {
                System.out.println("Можно идти гулять");
            } else {
                System.out.println("Оставайтесь дома ");


            }

        }


    }
}



