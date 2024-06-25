
@FunctionalInterface
interface A {

    int mathy(int a, int b, int c);

}

public class interfaceclass {

    public static void main(String[] args) {
        A obj = (a, b, c) -> a + b + c;
        // A obj1 = new A(){
        //     public int mathy(int a , int b, int c){
        //         return a+b+c; 
        //     }
        // }
        int result = obj.mathy(11, 22, 33);
        System.out.println(result);
    }
}
