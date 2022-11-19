package com.Java;

import java.io.*;
import java.lang.*;

public class BufferReaderPractice {
    public static void main(String[] args) throws IOException{
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter String : ");
        String str = bobj.readLine();

        System.out.println("Enter an Integer :");
        int iNo = Integer.parseInt(bobj.readLine());

        System.out.println("Entered String is : "+ str);
        System.out.println("Entered Integer is :"+iNo);

        System.out.println("Enter Double value :");
        double D = Double.parseDouble(bobj.readLine());
        System.out.println(D);

        System.out.println("Enter float value :");
        float f = Float.parseFloat(bobj.readLine());
        System.out.println(f);
    }

}
