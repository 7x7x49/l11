package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This program will help Уou find a valid IP address. Enter something:");
        String ip =in.nextLine();

        Pattern pattern = Pattern.compile("(((25[0-5]\\.)|(2[0-4]\\d\\.)|(1[0-9]{2}\\.)|([1-9][0-9]\\.)|([0-9]\\.)){3})((25[0-5])|(2[0-4]\\d)|(1[0-9]{2})|([1-9][0-9])|([0-9]))");
        Matcher match = pattern.matcher(ip);

        if (match.find()){
            System.out.println("Valid IP address: " + match.group());
        }
        else{
            System.out.println("No valid IP address found.");
        }
    }
}