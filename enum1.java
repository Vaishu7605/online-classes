
// class nashit {
//     int age = 20;
//     int roll = 10;
//     String name = "Vaishu";
//     public void display() {
//         System.out.println(name + " " + age);
//     }
// }

enum alld {
    Anjali, Jyoti, Navi, Tanu;

    private alld() {
        System.out.println("Constructor classed");
    }
    public void stude(){
        System.out.println("Student Called");
    }
}

public class enum1 {

    public static void main(String[] args) {
        // nashit obj = new nashit();
        // obj.display();

        // alld obj = alld.values;
        // obj.stude();
        // System.out.println(obj[1]);
        // alld[] obj = alld.values();
        // System.out.println(obj);
        // for (int i = 0; i <= obj.length - 1; i++) {
        //     System.out.println(obj[i]);
        // }
        // for (alld a : alld.values()) {
        //     System.out.println(a);
        // }
        for(alld a : alld.values() ){
            System.out.println(a.ordinal()+ " "+ a.name());
        }
    }
}
