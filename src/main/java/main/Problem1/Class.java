package main.Problem1;

import java.util.ArrayList;
import java.util.List;

public class Class {
    List<Integer> L = new ArrayList<>();
    int k;

    public Class(List<Integer> L1, int n){
        L = L1;
        k = n;
    }

    public boolean function(){
        List<Integer> temp = new ArrayList<>();
        temp.add(k);
        for(int n : L){
            for(int x : temp){
                if(n==x)
                    return true;
            }
            temp.add(k-n);
        }
        return false;
    }
}
