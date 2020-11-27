package org.epita.exo1;

public class Fibonacci {
    public static int calcul(int nb){
        int fn =0;
        int fn_1 =1;
        int fn_2 =0;
        for (int n = 2; n <= nb; n++) {
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
        return fn;
    }
}
