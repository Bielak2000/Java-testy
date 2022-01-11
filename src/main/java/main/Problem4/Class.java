package main.Problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class {
    List<Integer> L = new ArrayList<>();

    public Class(List<Integer> L1){
        L =L1;
    }

    public int function(){
        int min = Collections.min(L);
        int max = Collections.max(L);
        int temp1 = min;

        do{
            temp1++;
            if(!(L.contains(temp1)) && temp1!=0){
                break;
            }
        }
        while(temp1<=max);

        return temp1;
    }
}
