package nofunny;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    private static   List<Integer> collection = new ArrayList<>();
    private static List<Integer> collection2 = new LinkedList<>();

//    public void setCollection(ArrayList<Integer> collection, Integer rand) {
//        collection.add(rand);
//    }
//
//    public void setCollection2(LinkedList<Integer> collection2) {
//        this.collection2 = collection2;
//    }

    public List<Integer> getCollection() {
        return collection;
    }

    public List<Integer> getCollection2() {
        return collection2;
    }

    public static void main(String[] args) {
        Integer[] integer = new Integer[100000];
        Random rand = new Random();
        long start;
        long end;
        long start2;
        long end2;
        start = System.nanoTime();
        for(int i = 0; i < integer.length; i++) {
            integer[i] = rand.nextInt(1000);
            collection.add(integer[i]);
        }
        collection.remove(integer[5]);
        end = System.nanoTime();
//        System.out.println(collection);
        System.out.println(end - start);

        start2 = System.nanoTime();
        for(int i = 0; i < integer.length; i++) {
            integer[i] = rand.nextInt(1000);
            collection2.add(integer[i]);
        }
        collection2.remove(integer[5]);
        end2 = System.nanoTime();
//        System.out.println(collection);
        System.out.println(end2 - start2);
    }
}
