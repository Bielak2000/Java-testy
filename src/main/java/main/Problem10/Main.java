package main.Problem10;

import main.exceptions.MyException;

public class Main {
        public static void main(String[] args) {
                Functions f = new Functions();
                Solution s = new Solution(3000, f);
                try {
                        s.scheduler();
                }
                catch(MyException e){
                        e.printError("Time is too short...");
                }
                catch(InterruptedException e){
                        e.printStackTrace();
                }
        }
}
