package com.morse.java;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to cipher");
        System.out.println("1. Convert Letters to Morse Code");
        System.out.println("2. Convert Morse Code to Letters");
        int option = scan.nextInt();
        menu(option);
    }

    public static void menu(int option){
        switch (option){
            case 1:
                Scanner scan2 = new Scanner(System.in);
                System.out.println("Please the enter letters");
                String letters = scan2.nextLine();
                String result0 = Morse.letter2code(letters);
                assert letters.length() == result0.split(" ").length: "pass";
                System.out.println(result0);
                break;
            case 2:
                Scanner scan3 = new Scanner(System.in);
                System.out.println("Enter the morse code");
                System.out.println("NOTE: '/' represents whitespace");
                String morse = scan3.nextLine();
                String result = Morse.morseCodeToLetters(morse);
                assert morse.split(" ").length == result.length(): "pass";
                System.out.println(result);
                break;
            default:
                System.out.println("Try again");
                break;
        }
    }
}
