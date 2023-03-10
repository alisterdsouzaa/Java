/////////////////////////////////////////////////////////////////////////////
// Problem Statement : Program which accepts num form user and returns the
//                      multiplication of its factors.
/////////////////////////////////////////////////////////////////////////////
package Java;

import java.util.Scanner;

public class MultiplicationOfFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you number : ");
        int iNum = input.nextInt();
        int Result = MultiplicationOfFactorss(iNum);
        System.out.println("Multiplication of factors of num "+ iNum +" is " +Result);
    }

    static int MultiplicationOfFactorss(int iNo) {
        int iCnt;
        int iFactor = 1;

        for (iCnt = 1; iCnt <=(iNo/2); iCnt++) {
            if ((iNo % iCnt) == 0) {
                iFactor = iFactor * iCnt;
            }
        }
        return iFactor;
    }
}
