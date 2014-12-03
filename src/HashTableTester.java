/**
 * HashTableTester.java
 *
 * Created by Calvin Wong on 11/24/14.
 *
 * Test HashTableChain and HashTableOpen methods
 */
public class HashTableTester {

    public static void main(String[] args) {

        HashTableChain<Integer, String> chainHash = new HashTableChain<>();
        HashTableOpen<Integer, String> openHash = new HashTableOpen<>();

        /**
         * HashTableChain Test
         */
        chainHash.put(1, "Calvin");
        chainHash.put(2, "Paul");
        chainHash.put(3, "Ian");
        chainHash.put(4, "Steve");
        chainHash.put(5, "Catherine");
        chainHash.put(6, "Brandon");
        chainHash.put(7, "John");
        chainHash.put(8, "Jason");
        chainHash.put(9, "Money");
        chainHash.put(10, "Aaron");

        //chainHash.put(2, "Dell");

        System.out.println("Value key at 1 >\t " + chainHash.get(1));
        System.out.println("Value key at 2 >\t " + chainHash.get(2));
        System.out.println("Value key at 3 >\t " + chainHash.get(3));
        System.out.println("Value key at 4 >\t " + chainHash.get(4));
        System.out.println("Value key at 5 >\t " + chainHash.get(5));
        System.out.println("Value key at 6 >\t " + chainHash.get(6));
        System.out.println("Value key at 7 >\t " + chainHash.get(7));
        System.out.println("Value key at 8 >\t " + chainHash.get(8));
        System.out.println("Value key at 9 >\t " + chainHash.get(9));
        System.out.println("Value key at 10 >\t " + chainHash.get(10));

        System.out.println();
        System.out.println("--Removed Value key at 1\n");
        chainHash.remove(1); /** remove value 1 */

        System.out.println("--Added Value key at 11\n");
        chainHash.put(11, "Jackson"); /** put new key value */

        chainHash.rehash();

        /**
         * After deleting key value 1, I am no longer able to retrieve it
         */
        System.out.println("--What is Value key at 1? > " + chainHash.get(1) + "\n");

        System.out.println("\n--HashTableChain > " + chainHash.toString());


        /**
         * HashTableOpen Test
         */
        openHash.put(1, "Mike");
        openHash.put(2, "Trevor");
        openHash.put(3, "Franklin");
        openHash.put(4, "Devin");
        openHash.put(5, "Amanda");

        System.out.println("--HashTableOpen: " + openHash.toString());
    }
} // end of class

