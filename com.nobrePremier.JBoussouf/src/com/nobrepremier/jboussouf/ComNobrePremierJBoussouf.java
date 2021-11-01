
package com.nobrepremier.jboussouf;

import java.util.Scanner;

public class ComNobrePremierJBoussouf {

    public static void main(String[] args) {
        int k = 0, n=3, cmp=0;
        System.out.println(" 2");
        do{
            for (int i = 1; i < n; i++) {
                if (n%i != 0 && i != 1) {
                    k=1;
                    
                } else if (n%i == 0 && i != 1) {
                    k=0;
                    break;
                }
            }
            if (k==1) {
                System.out.println(" "+n);
                cmp++;
            }
            n++;
        }while(cmp<19);
        
        
    }
}
