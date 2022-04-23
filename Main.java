package com.company;

import java.util.Scanner;

import java.util.regex.Matcher;

import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This program will help Уou find a valid IP address. Enter something:");
        String ip = in.nextLine();  //cчитывание целого введенного пользователем слова или фразы с консоли

        Pattern pattern = Pattern.compile("(((25[0-5]\\.)|(2[0-4]\\d\\.)|(1\\d{2}\\.)|([1-9]\\d\\.)|(\\d\\.)){3})((25[0-5])|(2[0-4]\\d)|(1\\d{2})|([1-9]\\d)|(\\d))");
        Matcher match = pattern.matcher(ip); //хранение результата

        if (match.find()){
            System.out.println("Valid IP address: " + match.group());
        }
        else{
            System.out.println("No valid IP address found.");
        }
    }
}
