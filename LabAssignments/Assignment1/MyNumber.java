
 /** ===========================================================================================================================================
 *  Problem Statement : Define a class MyNumber, Having one private int data member. Write a default constructor to initialize it to 0
 *                      and another constructor to initialize it to value ( use this ). Write methods isNegative, isPositive, isZero,
 *                      isOdd, isEven. Create an object in main. Use command line arguments to pass a value to the object. ( HInt :
 *                      Use conversation method to convert string argument to integer ) and perform the above tests.
 *                      Provide javadoc comments for all constructors and methods and generate the html help file.
 * ===========================================================================================================================================
 * File Path     : MyNumber.java
 * Author        : Alister D'Souza
 * Date          : 17/04/2023
 *
 */
package LabAssignments.Assignment1;

/** Class MyClass */
 public class MyNumber {
    private int data;

    /** Default Constructor */
    MyNumber(){
        this.data = 0;
    }

    /** Parameterized Constructor */
    MyNumber(int data){
        this.data = data;
    }

    /** Method : returns true is value is negative */
    private boolean isNegative(){
       return data < 0;
    }

    /** Method isPositive : returns true is value is positive else returns false */
    private boolean isPositive() {
      return data > 0;
    }

    /** Method isEven: returns true is value is even else returns false */
    private boolean isEven() {
        return (data % 2) == 0;
    }

    /** Method isOdd : returns true is value is Odd else returns false */
    private boolean isOdd() {
        return (data % 2) != 0;
    }
    /** Method isZero : returns true is value is Zero else returns false */
    private boolean isZero(){
        return (data == 0);
    }

    /** Main routine */
    public static void main(String[] args) {
        var intData = Integer.parseInt(args[0]);
        MyNumber number = new MyNumber(intData);

       boolean iResult = number.isEven();
       if(iResult) System.out.println("Entered number "+intData+ " is Even");
       else System.out.println("Not even");

       iResult = number.isOdd();
       if(iResult) System.out.println("Entered number "+intData+ " is Odd");
       else System.out.println("Not Odd");

       iResult= number.isNegative();
        if(iResult) System.out.println("Entered number "+intData+ " is Negative number");
        else System.out.println("Not Negative");

        iResult = number.isPositive();
        if(iResult) System.out.println("Entered number "+intData+ " is Positive");
        else System.out.println("Not Positive");

        iResult = number.isZero();
        if(iResult) System.out.println("Entered number "+intData+ " is Zero");
        else System.out.println("Not Zero");

    }

}
