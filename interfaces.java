// class A{
//     int age = 21;
//     String name = "Vaishu";
//     String location = "Allahabad";

//     public void display(){
//         System.out.println(name + " " + age + " "+ location);
//     }
//     public int add(int a, int b){
//         return a+b;
//     }
// }
// abstract
@FunctionalInterface
interface A {

    void display();
    // void show();
}

// concrete
// class B implements  A {
//     public void display() {
//         System.out.println("Hello");
//     }
// }
public class interfaces {

    public static void main(String[] args) {
        // B obj = new B();
        // obj.display();

        // A obj = new A() {
        //     public void display() {
        //         System.out.println("Hello");
        //     }
        // };
        A obj = () -> System.out.println("Lambda Function");
        obj.display();
        // lambda functionworks only with functional interfaces
    }
}
