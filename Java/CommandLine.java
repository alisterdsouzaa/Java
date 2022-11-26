package com.Java;

public class CommandLine {
    public static void main(String[] args) {
        System.out.println("Length of arguments in command line is :"+args.length );
        System.out.println(args[0]);
        System.out.println(args[1]);
        
        // Addition using command line arguments
        int Ans = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println(Ans);

    }
}
