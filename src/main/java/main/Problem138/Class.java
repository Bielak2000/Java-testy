package main.Problem138;

import main.exceptions.MyException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class {
    List<Integer> monets = new ArrayList<>();
    int x;

    public Class(int e, List<Integer> L) throws MyException{
            if(e<=0)
                throw new MyException();
            x = e;
            monets = L;
            Collections.sort(L, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return (-1*(Integer.compare(o1,o2)));
                }
                });
    }

    public int function1() {
        int d;
        int c;
        int temp1 = x;
        List<Integer> monets1 = new ArrayList<>();
      for(int i : monets){
          if(x>=i){
              //System.out.println("monets " + i);
              d = i;
              //System.out.println("d " + d);
              c = temp1/d;
              //System.out.println("c " + c);
              monets1.add(c);
              if(temp1%d == 0)
                break;
              temp1 = temp1 - (c*d);
          }
      }

      int temp=0;
      for(int i : monets1){
          temp+=i;
          //System.out.println(i);
      }
      return temp;
    }
}
