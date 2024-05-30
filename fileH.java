
import java.io.File;

public class fileH {

    public static void main(String[] args) {

        //  -----------for creating a files ----------//
        // in same path
        // File a = new File("a.txt");
        // in different path
        // // File a = new File("C:\\Users\\vaish\\OneDrive\\Desktop\\abc.txt");
        // try {
        //     if (a.createNewFile()) {
        //         System.out.println("Created Successfully");
        //     } else {
        //         System.out.println("File already exists");
        //     }
        //     // a.createNewFile();
        // } catch (Exception e) {
        //     System.out.println("file not created");
        // }
        // // ---------------*******for detailing 
        // File a = new File("C:\\Users\\vaish\\OneDrive\\Desktop\\topics.txt");
        // if (a.exists()) {
        //     // System.out.println("file found");
        //     System.out.println("File name is :" + a.getName());
        //     System.out.println("Path is : " + a.getAbsolutePath());
        //     System.out.println("Parent is: " + a.getParent());
        //     System.out.println("File size is :" + a.length() + "bytes");
        //     System.out.println("File is readable: " + a.canRead());
        //     System.out.println("File is Writable: " + a.canWrite());
        // } else {
        //     System.err.println("File not found");
        // }
        // // ********************write file 
        // try {
        //     FileWriter a = new FileWriter("abc.txt");
        //     a.write("written using Java");
        //     a.close();
        //     System.out.println("File written Successfully");
        // } catch (Exception i) {
        //     System.out.println("file cannot be written");
        // }
        // // ************READ FILE*************//
        // try {
        //     File a = new File("abc.txt");
        //     Scanner b = new Scanner(a);
        //     // String data = b.nextLine();
        //     // System.out.println(data);
        //     while (b.hasNextLine()) {
        //         String data = b.nextLine();
        //         System.out.println(data);
        //     }
        // } catch (Exception e) {
        // }
        //  *****************Delete File************//
        File a = new File("a.txt");
        if (a.exists()) {
            a.delete();
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Not Found ");
        }
    }

}
