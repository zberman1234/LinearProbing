public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Table tb = new Table();
        tb.insert(1);
        tb.insert(2);
        tb.insert(3); //same hash value as k=2
        tb.insert(4);
        tb.insert(5); // same hash value as k = 4
        tb.insert(20);

        tb.insert(4.1); //expect to see this key after k=5

        for(int i = 0; i < tb.table.length; i++) {
            System.out.print(tb.table[i] + ", ");
        }

        if(tb.search(4.1) != 5) System.out.println("\nError: Unexpected value");

    }
}
