package main.Problem9;

import main.exceptions.MyException;

import java.util.ArrayList;
import java.util.List;

public class Class  {
    List<Integer> L = new ArrayList<>();

    public Class(List<Integer> L1) throws MyException{
        if(L1.size()<3) {
            throw new MyException();
        }
        L=L1;
    }


    public int function(){
        int temp = 0;
        int max = L.get(0)+L.get(2);
        int temp1 = 0;
        int temp2 = 0;
       for(int i : L){
           if((temp1+2)<L.size()) {
               for(int j : L)
               {
                   if((temp2-temp1)>=2){
                       temp = i + j;
                       if (temp > max)
                           max = temp;
                   }
                   temp2++;
               }
           }
           temp1++;
       }
        return max;
    }

}
