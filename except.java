
import java.util.Arrays;
import java.util.List;

public class except {

    public static void main(String[] args) {
        // ----------***exception***-----------//
        // ----- 1. Compile time error : compiler returns the error. live----//
        // ---- missing Semicolons
        // ----  Mismatch braces
        // ----file mismatch
        // ----Syntax error
        // -----pre-defined variables
        // ----Type Mismatch 
        // --- Case mismatch
        //  ------2. Runtime Error : execution time ------//
        // -------- i. logical error
        // -----------i. i. ArithmeticException
        // -----------i. ii. NullPointerException
        // ----------i. iii. Date exception
        // ----------i. iv. ArrayIndexOutOfBoundsException
        // ---------i. v. ArrayStoreException
        // --------- i. vi. Unsupported Operation
        // ----------i. vii. SQl
        // -----------i. viii. Tomcat
        // ------------i. ix. File Handling 
        // ------------i. x. Async buffer
        // print("Hello");
        System.out.println("Hello");
        // int a = 45;
        // int b = 0;
        // int c = a / b;
        // System.out.println(c);
        // String a = null;
        // System.out.println(a.length());
        // Date a = new Date();
        // System.err.println(a);
        // int[] a = {5, 6, 7, 8};
        // System.out.println(a[5]);
        // Number[] bigint = new BigInteger[5];
        // bigint[0] = Double.valueOf(123.47687956);
        Integer[] a = {3, 4, 5, 6, 7};
        List<Integer> b = Arrays.asList(a);
        // b.add(new int(0));
    }
}
