package main.Problem2;


import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        L.add(1);
        L.add(2);
        L.add(3);
        L.add(4);
        L.add(5);
        List<Integer> L1 = new ArrayList<>();
        Class c = new Class(L);
        L1 = c.function();
        for(int i : L1)
            System.out.println(i);
    }
}
