public class SwapNumber {
    public static void main(String[] args) {
        int A = 10, B =20;
        System.out.println("Before swapping values are..."+A+" "+B);
        swapMethodOne(A,B);
    }


    public static void swapMethodOne(int A, int B)
    {
        int iValue1 = A;
        int iValue2 = B;
        int C = 0;

        C = A;
        A = B;
        B = C;

        System.out.println("Values after swapping are..."+A+" "+B);
    }
}

