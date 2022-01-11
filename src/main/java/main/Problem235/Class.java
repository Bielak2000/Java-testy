package main.Problem235;

import java.util.ArrayList;
import java.util.List;

public class Class {
    List<Integer> L = new ArrayList<>();

    public Class(List<Integer> L1){
        L = L1;
    }

    public List<Integer> function(){
        List<Integer> L2 = new ArrayList<>();
        int min = L.get(0);
        int max = L.get(0);

        int i = 1;
        while(i!=L.size()){
            if(L.get(i)<min) {
                min = L.get(i);
                continue;
            }
            if(L.get(i)>max)
                max = L.get(i);
            i++;
        }

        L2.add(min);
        L2.add(max);
        return L2;
    }
}
