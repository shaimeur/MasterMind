package com.shaimeur;

import java.util.Random;

public class MasterMind {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        int[] laCombinaison = new  int[4];
        int[] combinaison = new  int[6];

        int count = tirerCombinaison();

    }
    static int tirerCombinaison(int[] uneCombinaison,int m, int n){
        Random rand = new Random();

        return  rand.nextInt(m - n + 1);

    }
}
