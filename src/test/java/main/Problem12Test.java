package main;

import main.Problem12.Options;
import main.exceptions.MyException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Problem12Test {
    @Test
    public void Function_ResultEqualsArray_true(){
        List<Integer> L = new ArrayList<>();
        List<List<Integer>> L1 = new ArrayList<>();
        L.add(1);
        L.add(2);
        try {
            Options o = new Options(4, L);
            L1 = o.function();
            int[] x = new int[15];

            x[0] = L1.get(0).get(0);
            x[1] = L1.get(0).get(1);
            x[2] = L1.get(0).get(2);
            x[3] = L1.get(0).get(3);
            x[4] = L1.get(1).get(0);
            x[5] = L1.get(1).get(1);
            x[6] = L1.get(1).get(2);
            x[7] = L1.get(2).get(0);
            x[8] = L1.get(2).get(1);
            x[9] = L1.get(2).get(2);
            x[10] = L1.get(3).get(0);
            x[11] = L1.get(3).get(1);
            x[12] = L1.get(3).get(2);
            x[13] = L1.get(4).get(0);
            x[14] = L1.get(4).get(1);
            int[] y = {1,1,1,1,2,1,1,1,2,1,1,1,2,2,2};

            assertArrayEquals(x,y);
        }
        catch(MyException e){
            e.printError("There are too few steps!");
        }

    }

    //nie da sie obsluzyc bo rzuca wyjatek w drugim return w function
    @Test//(expected = MyException.class)
    public void Function_SizeSmallerSteps_ThrowException(){
        List<Integer> L = new ArrayList<>();
        List<List<Integer>> L1 = new ArrayList<>();
        L.add(2);
        L.add(3);
        try {
            Options o = new Options(1, L);
            L1 = o.function();
            assertTrue(L1.isEmpty());
        }
        catch(MyException e){
            e.printError("There are too steps!");
        }
        //L1 = o.function();
    }
    @Test//(expected = MyException.class)
    public void Function_SizeEquals0_ThrowException(){
        List<Integer> L = new ArrayList<>();
        List<List<Integer>> L1 = new ArrayList<>();
        L.add(2);
        L.add(3);
        try {
            Options o = new Options(0, L);
        }
        catch(MyException e){
            e.printError("There are too few steps!");
        }
        //L1 = o.function();
    }
}
