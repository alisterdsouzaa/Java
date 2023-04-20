/** ===========================================================================================================================================
 *  Problem Statement : Write a program to crete a class, 'GenericClass'. Store an object of any data type in the class.
 * ===========================================================================================================================================
 * File Path     : GenericClass.java
 * Author        : Alister D'Souza
 * Date          : 20/04/2023
 *
 */
package GenericTypes;

public class GenericClass<T> {
    T obj;

    GenericClass(T obj){
        this.obj = obj;
    }

    T getObj(){
        return obj;
    }
}
class Gen1{
    public static void main(String[] args) {
        Integer i = 12;
        GenericClass<Integer> obj = new GenericClass<>(i);
        System.out.println("Stored Integer is :"+ obj.getObj());

        String s = "Alister";
        GenericClass<String> st = new GenericClass<>(s);
        System.out.println("Stored String is :"+ st.getObj());
    }
}
