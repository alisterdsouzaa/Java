package com.Java;

import java.util.Scanner;

public class DegreesToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Degrees = input.nextFloat();
        float result;

        DtoF obj = new DtoF(Degrees);
        result = obj.Conversion();
        System.out.println("Conversion of degree to F is :"+result);
    }
}

class DtoF
{
    public  float tempC;

    DtoF(float C)
    {
        this.tempC =C;
    }

    public float Conversion()
    {
        float tempFar = 0;
        tempFar = (tempC * 9/5)+ 32;
        return tempFar;
    }
}