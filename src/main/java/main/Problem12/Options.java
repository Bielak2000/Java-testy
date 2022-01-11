package main.Problem12;

import main.exceptions.MyException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Options {
    int steps;
    List<Integer> sizeSteps = new ArrayList<>();

    public Options(int s, List<Integer> s1) throws MyException {
            if(s <= 0)
                throw new MyException();
            steps = s;
            sizeSteps = s1;
    }

    public List<List<Integer>> function() throws MyException {
        List<List<Integer>> temp = new ArrayList<>();
        List<List<Integer>> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();

        if(steps< Collections.min(sizeSteps))
            return temp;

        for(int s : sizeSteps)
        {
            if(steps==s)
            {
                temp2.add(s);
                temp.add(new ArrayList<>(temp2));

            }
            else if(steps>s)
            {
                    Options o = new Options(steps-s, sizeSteps);
                    temp1 = o.function();
                    for(List<Integer> i : temp1)
                    {
                        i.add(s);
                        temp.add(i);
                    }
            }
            temp2.clear();
        }
        return temp;
    }
}
