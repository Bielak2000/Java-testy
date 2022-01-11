package main.Problem10;

import static java.lang.Thread.sleep;
import main.exceptions.MyException;

public class Solution {
    int n;
    Functions f;

    public Solution(int n1, Functions f1){
        n = n1;
        f=f1;
    }

    public int scheduler() throws MyException, InterruptedException {
        int n1 = n/1000;
        if (n1 <= 0)
            throw new MyException();
        sleep(n1);
        f.exampleFunction();
        return n1;
    }
}
