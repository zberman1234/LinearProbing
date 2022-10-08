import java.util.Arrays;

public class Table {
    double[] table;
    

    /**
     * Default Table constructor, initializes Table with a size of 100
     */
    public Table() {
        table = new double[100];
        Arrays.fill(table, -1);
    }

    /**
     * Creates a table with a specified size
     * @param size the size to create the table with
     */
    public Table(int size) {
        table = new double[size];
        Arrays.fill(table, -1);
    }

    public double[] getTable() {return table;}

    /**
     * Inserts a key into the table using linear probing
     * @param k the key to be inserted
     * @return the index where k is inserted, or -1 if the table is full
     */
    public int insert(double k) {
        int i = 0;
        while(i < table.length) {
            int q = ((int) k)/2 + i; //hash function is integer division by 2
            if(table[q] == -1) {
                table[q] = k;
                return q;
            } else {
                i++;
            }
        }
        System.out.println("hash table overflow");
        return -1;
    }

    /**
     * searches for a key in the table
     * @param k the key to locate
     * @return the index where k is stored, or -1 if k is not in the table
     */
    public double search(double k) {
        int i = 0;
        while(i < table.length) {
            int q = ((int) k)/2 + i;
            if(table[q] == -1) return -1;
            if(table[q] == k) {
                return q;
            } else {
                i++;
            }
        }
        return -1;
    }

    public void delete(int k) {
        return;
    }
}
