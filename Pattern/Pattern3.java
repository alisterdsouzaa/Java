package com.Pattern;//////////////////////////////////////////////////////////////////////
// Problem Statement 3: Accept number from user and display pattern.
////////////////////////////////////////////////////////////////////////
// ip = 5
// op = 5  # 4 #  3 #  2 # 1
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value :");
        int iValue = input.nextInt();

        LogicXX obj = new LogicXX();
        obj.logicX(iValue);
    }
}

class LogicXX
{
    public void logicX(int iNo)
    {
        int iCnt;
        for(iCnt=iNo; iCnt>0; iCnt--)
        {
            System.out.print(iCnt+" "+"# ");
        }

    }
}

