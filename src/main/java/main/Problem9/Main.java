package main.Problem9;

import main.exceptions.MyException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        L.add(2);
        L.add(4);
        L.add(6);
        L.add(8);
        try {
            Class c = new Class(L);
            int x = c.function();
            System.out.println(x);
        }
        catch (MyException e){
            e.printError("Too few elements!");
        }
    }
}
