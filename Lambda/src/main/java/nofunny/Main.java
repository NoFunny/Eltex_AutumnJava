package nofunny;

import java.util.*;
import java.lang.Integer;
import java.util.stream.Collectors;

public class Main {
    private static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        for(int i = 0; i < 1000000; i++) {
            list.add((int) Math.round(Math.random() * 100));
        }
//        for(Integer lists : list)
//            System.out.println(lists);
        List<Integer> results = list.stream().filter(it -> (it != 1) && (it % 2 != 0) &&  (it % 3 != 0) && (it % 5 != 0) && (it % 7 != 0)).collect(Collectors.toList());
        List<Integer> result = results.stream().map(x -> x*x).sorted().collect(Collectors.toList());
        System.out.println("Size collection = " + result.size());
//        for(Integer res : result)
//            System.out.println(res);
    }
}
