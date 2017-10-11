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
            System.out.println("Введи Количество каллорий");
            String result = scanner.nextLine();
            if ("exit".equals(result)) {
                System.out.println("Пока");
                return;
            }
            int energy =Integer.valueOf(result);
            switch (energy){
                case 100:
                    System.out.println("Apple");
                    break;
                case 300:
                    System.out.println("Meat");
                    break;
                case 2000:
                    System.out.println("BIG Burger");
                    break;
                case -100:
                    System.out.println("Go Training");
                    break;
                default:
                    System.out.println("Diet");
                    break;
            }



        }
    }
}

