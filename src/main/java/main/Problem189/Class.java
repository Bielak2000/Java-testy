package main.Problem189;

import java.util.ArrayList;
import java.util.List;

public class Class {
    List<Integer> L = new ArrayList<>();

    public Class(List<Integer> L1){
        L = L1;
    }

   public int function(){
        int temp = 0;
        boolean temp2 = true;
        List<Integer> temp1 = new ArrayList<>();
        for(int i : L){
            for(int j : temp1){
                if(j==i) {
                    temp2 = false;
                    break;
                }
            }
            if(temp2)
                temp1.add(i);
            else{
                if(temp<temp1.size())
                    temp = temp1.size();
                temp1.clear();
                temp1.add(i);
                temp2 = true;
            }
        }
       if(temp<temp1.size())
           temp = temp1.size();
        return temp;
    }
}
