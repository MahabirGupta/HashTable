import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        create HashTable object
        Hashtable hashtable = new Hashtable<>(); // capacity is 11, load factors 0.75
        Hashtable hashtable1 = new Hashtable<>(30); // setting the initial capacity to 30
        Hashtable hashtable2 = new Hashtable<>(30,0.95f); // setting the initial capacity to 30 and loadFactor to 0.95
        Hashtable<Integer,String> hashtable3 = new Hashtable<>(); //specifying the dataTypes for the HashTable
        hashtable3.put(101,"Mahabir");
        hashtable3.put(102,"Anish");
        hashtable3.put(103,"Anishkaa");
        hashtable3.put(104,"Babita");
        hashtable3.put(105,"Family");
//        hashtable3.put(null,"We"); // key cannot be null
//        hashtable3.put(106,null);// value cannot be null
//      Print the key value pair in the HashTable
        System.out.println(hashtable3);

//        to get the value
        hashtable3.get(103);
        System.out.println(hashtable3.get(103));

//        to remove the value from the HashTable
        hashtable3.remove(105);
        System.out.println(hashtable3);

//        check whether the particular key is in the HashTable
        hashtable3.containsKey(102);
        System.out.println(hashtable3.containsKey(102));

        //        check whether the particular value is in the HashTable
        hashtable3.contains("Anish");
        System.out.println(hashtable3.contains("Anish"));
        System.out.println();

//        check whether HashTable is empty
        System.out.println(hashtable3.isEmpty());

//        to get all the keys from the HashTable
        System.out.println(hashtable3.keySet()); // will return all the keys as a Set

        //        to get all the values from the HashTable
        System.out.println(hashtable3.values()); // will return all the values as a Collection
        System.out.println();

//        to get individual keys and individual values
//        using for..each loop
//        for (Map.Entry<Integer, String> keyValues:hashtable3.entrySet()){
//            System.out.println(keyValues);
//
//        }

        for (int keyValues:hashtable3.keySet()){
            System.out.println(keyValues + " " + hashtable3.get(keyValues));

        }
//      Using Entry


    }
}
