/**
 *    Check if input string are Anagram or Not
 * ============================================
 * File Path     : Anagram.java
 * Author        : Alister D'Souza
 * Date          : 24/04/2023
 *
 */
package Java;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        isAnagram("Alister", "Alister"); // Anagram
        isAnagram("SiLeNt CAT", "LisTen AcT"); //Anagram
        isAnagram("joy", "enjoy"); //NOT Anagram
    }

    private static void isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");

        boolean flag = true;

        if(s1.length() == s2.length()){
            char[] copyOfStr1 = s1.toLowerCase().toCharArray();
            char[] copyOfStr2 = s2.toLowerCase().toCharArray();

            Arrays.sort(copyOfStr1);
            Arrays.sort(copyOfStr2);

           flag = Arrays.equals(copyOfStr1, copyOfStr2);
           if(flag){
               System.out.println("String 1 : "+str1+" is anagram of String 2 : "+str2);
           }else {
               System.out.println("String 1 : "+str1+" is NOT an Anagram of String 2 : "+str2);
               return;
           }

        }else {
            System.out.println("String 1 : "+str1+" is NOT an Anagram of String 2 : "+str2);
        }
    }
}
