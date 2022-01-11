package main.Problem15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class {
    public List<Integer> L = new ArrayList<>();

    public Class(List<Integer> L1){
        L = L1;
    }

    public int Rand(){
        int max = L.size();
        int min = 0;
        int range = max - min;

        int rand = (int)(Math.random()*range);
        return L.get(rand);
    }
}
