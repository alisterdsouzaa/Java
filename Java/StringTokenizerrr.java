/*
 * =========================================================================================
 * File Path         : StringTokenizer.java
 * Author            : Alister D'Souza
 * Date              : 11/04/2023
 * Problem Statement : To accept different types of I/P in a line from the keyboard.
 * =========================================================================================
 */
package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerrr {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        /* i/p separated by coma */
        System.out.println("Enter your Name, Age , Salary");
        String str = br.readLine();

        /*
                                    parameters ( String obj , delimiter );
         */
        StringTokenizer st = new StringTokenizer(str, " ");

        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();

        /* Trim the extra spaces */
        s1 = s1.trim();
        s2 = s2.trim();
        s3 = s3.trim();

        String name = s1;
        System.out.println("Name : "+name);

        int age = Integer.parseInt(s2);
        System.out.println("Age :"+ age);

        float salary = Float.parseFloat(s3);
        System.out.println("Salary is : "+salary);

    }
}
