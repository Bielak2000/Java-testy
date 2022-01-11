package main.Problem233;

import main.exceptions.MyException;

public class Class {
    int n;


    public Class(int x) throws MyException{
            if(x<=0)
                throw new MyException();
            n=x;
    }

    public int function(){
        int a = 0;
        int b = 1;
        int c = 0;

        if(n==1)
            return a;
        else if(n==2)
            return b;

        int i=0;
        while(i<(n-2)){
            c = a+b;
            a = b;
            b = c;
            i++;
        }

        return c;
    }
}
