
public class Non_primitive {

    public static void main(String[] args) {
        //--------------String------------// 
        // String a = "My name ";
        // String b = "is Vaishnavi";
        // String c = " Kesherwani";
        // String d = " from Allahabad.";
        // replace
        // System.out.println(d.replace('a', '@'));
        // System.out.println("replace returns" + d.replaceFirst("a", "@"));
        // System.out.println("replace all" + d.replaceAll("a", "@"));
        // delimeter
        // System.out.println(String.join("$$", a, b, c, d));
        // System.out.println(String.join(" & ", "Vaishnavi", "Kesherwani"));
        // concatination
        // System.out.println(a + " " + b + " " + c + " " + d);
        // System.out.println(a.concat(b).concat(c).concat(d));
        // System.out.println(a.concat(b));
        // String x = a.concat(b);
        // System.out.println(x);
        // String y = x.concat(c);
        // System.err.println(y);
        // String z = y.concat(d);
        // System.out.println(z);

        // String a = "Hello, Vaishnavi";
        // System.out.println(a);
        // System.out.println(a.trim());
        // System.out.println(a.charAt(0));
        // System.out.println(a.endsWith("nam"));
        // // for find the length = .length()
        // System.out.println(a.length());
        // // for uppercase ABCD
        // System.out.println(a.toUpperCase());
        // // for lowercase abcd
        // System.out.println(a.toLowerCase());
        // // indexing
        // System.out.println(a.indexOf('a'));
        // System.out.println("if the character is not found " + a.indexOf('z'));
        // System.out.println();
        // Boolean x = true;
        // System.out.println(x);
//-----------------Array----------------//
        // int[] a = {4, 5, 6, 7, 8, ' '};
        // System.out.println(a.length);
        // System.out.println(a[4]);
        // System.out.println(a[5]);
        // String[] a = {"Damodar", "vaishnavi", "bhagwan", "Rahul"};
        // System.out.println(a.length);
        // System.out.println()
        // Declaration of array
        // int[] a = new int[10];
        // System.out.println("length: " + a.length);
        // System.out.println(a[0]);
        // System.out.println(a[3]);
        // a[0] = 8;
        // a[3] = 5;
        // a[6] = 9;
        // a[9] = 156532;
        // a[9] = 32;
// ---------- for loop----------//
        // int x = a.length;
        // for (int counter = 0; counter < x; counter++) {
        //     System.out.println(a[counter]);
        // }
        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // System.out.println(a[3]);
        // System.out.println(a[4]);
// -----------TWO-DIMENSIONAL ARRAY-----------//
        int[][] a = {{13, 14, 15}, {26, 27, 28}};
        {
            for (int x = 0; x < a.length; x++) {
                for (int y = 0; y < a[x].length; y++) {
                    System.out.println(a[x][y]);
                }
            }
        }
        // int[][] a = {{3, 4, 5}, {6, 7, 8}, {9, 10, 11}};
        // for (int i = 0; i < a.length; i++) {
        //     // System.out.println(a[i]);
        //     for (int j = 0; j < 3; j++) {
        //         System.out.println(a[i][j]);
        //     }
        // }
        // System.out.println(a[1][2]);
    }
}
