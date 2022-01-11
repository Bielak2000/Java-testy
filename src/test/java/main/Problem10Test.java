package main;

import main.Problem10.Functions;
import main.Problem10.Solution;
import main.exceptions.MyException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem10Test {


    @Test
    public void Function_ResultEquals3_true(){
        Functions f = new Functions();
        Solution s = new Solution(3000, f);
        try {
            long start = System.currentTimeMillis();
            int x = s.scheduler();
            long stop = System.currentTimeMillis();
            long d = stop-start;
            boolean temp = false;
            if(d>=3 && d<=4)
                temp=true;
            assertTrue(temp);
        }
        catch(MyException e){
            e.printError("Time is too short...");
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void Function_ResultEqualsNULL_ThrowException(){
        Functions f = new Functions();
        Solution s = new Solution(0, f);
        try {
            int x = s.scheduler();
            assertEquals(0, x);
        }
        catch(MyException e){
            e.printError("Time is too short...");
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    //lub w taki sposob
    /*@Test(excepted = IllegalArgumentException.class)
    public void Function_ResultEqualsNULL_ThrowException(){
        Functions f = new Functions();
        Solution s = new Solution(0, f);
        }
    }*/

    //brak testu dal interreptedExceptions - koniec watku
}
