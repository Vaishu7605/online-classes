
class Addi extends Sub {

    public int add(int a, int b) {
        return a + b;
    }
}

class Sub extends Div {

    public int sub(int a, int b) {
        return a - b;
    }
}

class Div extends Multi {

    public int div(int a, int b) {
        return a / b;
    }
}

class Multi {

    public int multi(int a, int b) {
        return a / b;
    }
}

public class app {

    public static void main(String[] args) {
        Addi obj = new Addi();
        int res = obj.add(2, 4);
        int res1 = obj.sub(4, 3);
        int res2 = obj.div(4, 3);
        int res3 = obj.multi(6, 3);

        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        // System.out.println("Hello, World");
    }
}
