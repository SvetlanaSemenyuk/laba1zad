package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int x=2;
        System.out.print("введите степень числа n ");
        Scanner scanner = new Scanner (System.in);
        n= scanner.nextInt();


        for (int i=1;i<n+1;i++) {
        x=x*i;

        }


       System.out.print(x);
    }
}
