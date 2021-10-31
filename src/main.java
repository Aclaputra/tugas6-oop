public class main {
    int x = 5;

    public static void main(String[] args) {
        main obj1 = new main();
        main obj2 = new main();

        second sc1 = new second();

        obj2.x += 5;

        System.out.println(obj1.x);
        System.out.println(obj2.x);

        System.out.println(sc1.kata1 + sc1.kata2);
        sc1.umurmu(20);
    }
}