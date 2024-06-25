
class thread1 extends Thread {

    public void display() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("thread1");
        }
    }
}

class thread2 extends Thread {

    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("thread2");
        



    []      }
    }
}

public class threa {

    public static void main(String[] args) {
        thread1 obj = new thread1();
        obj.start();
        thread2 obj1 = new thread2();
        obj1.start();
    }
}
