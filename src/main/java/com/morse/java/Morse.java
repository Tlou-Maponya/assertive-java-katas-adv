package com.morse.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Morse {
    public static String letter2code(String letter) {
        
        letter = letter.toUpperCase();
        
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
                "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};
        
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<String> converted = new ArrayList<>();
        
        for(char i = 65; i < 91; i++){
            letters.add(i);
            if(i == 90){
                char b = 32;
                letters.add(b);
            }
        }
        int stringLength = letter.length();
        for(int a = 0; a<stringLength; a++){
            char c = letter.charAt(a);
            for(int b= 0; b<letters.size(); b++){
                if(letters.get(b) == c){
                    converted.add(morse[b]);
                }
            }
        }
        StringBuilder str0 = new StringBuilder();
        for (String i : converted) {
            str0.append(i + " ");
        }
        return str0.toString();
    }
    public static String morseCodeToLetters(String morseCode){
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
                "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> morseToLetters = new ArrayList<>();
        String[] input = morseCode.split(" ");
        for(char i = 65; i < 91; i++){
            letters.add(i);
            if(i == 90){
                char b = 32;
                letters.add(b);
            }
        }
        for(String a : input){
            for(int z = 0; z<morse.length; z++) {
                if(morse[z].equals(a)){
                    morseToLetters.add(letters.get(z));
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for(Character i : morseToLetters) {
            str.append(i);
        }
        return str.toString();
    }
}