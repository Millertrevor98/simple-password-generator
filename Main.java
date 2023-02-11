package com.generate;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Greetings");
        String uppercase= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase= "abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String specialchars= "<>/?!@#%&8";
        String combination=uppercase+lowercase+num+specialchars;
        int len= 8;
        char[] password=new char[len];
        Random r= new Random();
        for(int i=0;i<len;i++){
            password[i]=combination.charAt(r.nextInt(combination.length()));

        }
        System.out.println("Your password is "+new String(password));
    }
}
