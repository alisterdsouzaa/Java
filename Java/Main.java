package com.Java;

import java.util.Scanner;

// Printing number in decresing order until 1/0

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        ReverseLoop obj = new ReverseLoop(value);
        obj.reverseNum();
    }
}

class ReverseLoop
{
    public int x;

    ReverseLoop(int a)
    {
        x=a;
    }

    public void reverseNum()
    {
        for( int iCnt = x; iCnt>=1; iCnt--)
        {
            System.out.println(iCnt);

        }

    }
}
