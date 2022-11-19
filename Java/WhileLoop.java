package com.Java;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      int iCount = input.nextInt();
      while (iCount>0)
      {
          System.out.println(iCount);
          iCount--;
      }

      input.close();
    }

}
