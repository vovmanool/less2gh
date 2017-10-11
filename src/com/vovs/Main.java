package com.vovs;
import java.util.Scanner;


public class Main {

   /* public static  test1(){

    }
    public static  test2(int a, String s){
        System.out.println("a:"+a"; s:"+s);
    }
    public static  test3(){

    }*/
    long a=1l;



    public static void main(String[] args) {
	// write your code her
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введи почту");
            String result = scanner.nextLine();
            if ("exit".equals(result)) {
                System.out.println("Пока");
                return;
            }
            int indexOfAt= result.indexOf("@");
            //int value= Integer.valueOf("@");
            boolean isEmail = indexOfAt>=0;

            if (isEmail) {
                System.out.println("Is email");
            } else {
                System.out.println("Is text");
            }


         //   test2(13,"AAA");

        }
    }
}

