package com.vovs;
import java.util.Scanner;


public class Main {

    public static final void  test1(){
        return;
    }
    public static final void test2(int a, String s){
        System.out.println("a:"+a+" s:"+s);
    }
    public  static final void test3(){
        return;
    }

    //long a=1l;



    public static void main(String[] args) {
	// write your code her
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введи кол-во повторений");
            String result = scanner.nextLine();
            if ("exit".equals(result)) {
                System.out.println("Пока");
                return;
            }
            test2(5,"ss3");


           // int count =Integer.valueOf(result);
            //for (int i = 1; i <= count ; i++) {
             //   System.out.println("Прыжок "+i);




        }
    }
}

