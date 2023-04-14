/*
 *  Create a phone book using Hashmap from the Collections
 * =======================================================
 * File Path     : HashMapX.java
 * Author        : Alister D'Souza
 * Date          : 14/04/2023
 *
 */

package CollectionFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapX {
    public static void main(String[] args) throws IOException {
        HashMap <String, Long> hm = new HashMap<>();

        String name, str;
        Long phoneNumber;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

        while (true) {
            System.out.println("1 Enter phone entries");
            System.out.println("2 Lookup in the book");
            System.out.println("3 Display Names from the book");
            System.out.println("4 Exit");
            System.out.println();

            System.out.print("Enter your choice : ");
            int n = Integer.parseInt(br.readLine());

            switch (n) {
                case 1:
                    System.out.println("Enter Name :");
                    name = br.readLine();
                    System.out.println("Enter phone number : ");
                    str = br.readLine();
                    phoneNumber = Long.valueOf(str);
                    hm.put(name, phoneNumber);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter name : ");
                    name = br.readLine();
                    name = name.trim();
                    phoneNumber = hm.get(name);
                    System.out.println("Phone number is " + phoneNumber);
                    System.out.println();
                    break;

                case 3:
                    Set<String> set = new HashSet<String>();
                    set = hm.keySet();
                    System.out.println(set);
                    System.out.println();
                    break;

                case 4:
                    break;
            }

        }
    }
}
