package com.shaimeur;

import java.util.*;

public class MasterMind {

    static ArrayList<Integer>  masterCode  = new ArrayList<Integer>();
    static ArrayList<Integer>  breakerCode  = new ArrayList<Integer>();
    static int sizze = 4 ;
    static int m = 6 ;
    static final int round = 10 ;
    static  int count = 0;
    //static ArrayList<String > solution = new ArrayList<String >();

    public static void main(String[] args) {

        System.out.println("IAM THINKING ABOUT A CODE TRY TO GUESS IT !! ");

        botGuess();

        while (count < round){
            userInput();
            if (breakerCode.equals(masterCode) == true){
                System.out.println("#,#,#,#");
                System.out.println("YOU WINN!!");
                break;
                // find the numbers with order "#"
            }
            for (int z = 0; z < sizze ; z++ ){
                if (masterCode.get(z) == breakerCode.get(z)) {
                    breakerCode.set(z, 0);
                    System.out.println("# ");
                }

                for(int n : masterCode) {
                    if(breakerCode.get(z) == n ) {
                        System.out.println("O ");
                    }
                }

                //System.out.println(solution);

               // solution.clear();


            }
            breakerCode.clear();

            count++;

                            }

        }

         static void userInput(){
            breakerCode.clear();
            System.out.println("Enter your guess : ");
            Scanner scanner = new Scanner(System.in);

             for (int j = 0; j <sizze ; j++) {
                    int input = scanner.nextInt();
                    breakerCode.add(input);
             }
             System.out.println("Your  guess is :  " + breakerCode);
         }


            static void botGuess() {
                 Random rand = new Random() ;
                     for (int i = 0; i < sizze; i++) {
                             masterCode.add(rand.nextInt(m) + 1);
                          }
                     System.out.println("the Guess is : " + masterCode) ;

                }
    }


