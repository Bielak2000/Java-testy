package main.Problem2;

import java.util.ArrayList;
import java.util.List;

public class Class {
    List<Integer> L = new ArrayList<>();

    public Class(List<Integer> L1){
        L=L1;
    }

    public List<Integer> function(){
        List<Integer> L1 = new ArrayList<>();
        int k = 1;
        for(int i : L)
            k = k*i;
        for(int i : L){
            L1.add(k/i);
        }
        return L1;
    }


}
