package com.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Program to reverse string.

public class ReverseString {
    public static void main(String[] args) throws IOException {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        String str = bobj.readLine();
        char c;
        String nstr = "";

        for(int i = 0;i< str.length(); i++)
        {
            c = str.charAt(i);
            nstr = c+nstr;
        }

        System.out.println(nstr);

    }
}


