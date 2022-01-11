package main.Problem12;

import main.exceptions.MyException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MyException {
        List<Integer> L = new ArrayList<>();
        List<List<Integer>> L1 = new ArrayList<>();
        L.add(1);
        L.add(2);
        //L.add(3);
        try {
            Options o = new Options(4, L);
            L1 = o.function();
            for (List<Integer> i : L1) {
                for (int j : i) {
                    System.out.print(j);
                }
                System.out.println();
            }
            System.out.println("Number of possibilities: " + L1.size());
        }
        catch(MyException e){
            e.printError("There are too few steps!");
        }
    }
}

