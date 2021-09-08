package com.company;

public class Main {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", "+ year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + ", " + date + " " + month + ", "+ year);
    }
    public static void main(String[] args) {

        String day = "wednesday";
        int date = 8;
        String month = "September";
        int year = 2021;

        printAmerican(day, date,month, year);
        printEuropean(day, date, month, year);
    }
}
