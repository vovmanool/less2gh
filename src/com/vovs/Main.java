package com.vovs;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;


public class Main {

  /*  public static final void  test1(){
        return;
    }
    public static final void test2(int a, String s){
        System.out.println("a:"+a+" s:"+s);
    }
    public  static final void test3(){
        return;
    }

    //long a=1l;
*/
    public static String string,param1,param2,func;
    public static int paramint;

    public static void main(String[] args) {
	// write your code her
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку для обработки, или q - выход");
            string = scanner.nextLine();
            if ("q".equals(string)) {
                System.out.println("Пока");
                return;
            }
            System.out.println("Введите номер функции для обработки строки");
            System.out.println("1 - indexOf");
            System.out.println("2 - replace");
            System.out.println("3 - toLowerCase");
            System.out.println("4 - toUpperCase");
            System.out.println("5 - trim");
            System.out.println("6 - charAt");
            System.out.println("7 - substring");
            System.out.println("8 - toString");
            func = scanner.nextLine();

            switch (func) {
                case "1":
                    System.out.println("Введите искомую букву/слово");
                    param1 = scanner.nextLine();
                    System.out.println("Позиция '"+param1+"' в строке '"+string+"' "+string.indexOf(param1));
                break;
                case "2":
                    System.out.println("Введите искомую букву/слово");
                    param1 = scanner.nextLine();
                    System.out.println("Введите на что ее менять");
                    param2 = scanner.nextLine();
                    System.out.println("Новая строка '"+string.replace(param1,param2)+"'");

                break;
                case "3":
                    System.out.println("Введенная строка в нижнем регистре '"+string.toLowerCase()+"'");
                break;
                case "4":
                    System.out.println("Введенная строка в верхнем регистре '"+string.toUpperCase()+"'");
                break;
                case "5":
                    System.out.println("Введенная строка '"+string+"' без пробелов по бокам '"+string.trim()+"'");
                break;
                case "6":
                    System.out.println("Введите номер буквы");
                    paramint = scanner.nextInt();
                    System.out.println("Буква #'"+paramint+"' в строке '"+string+"' это "+string.charAt(paramint));

                break;
                case "7":
                    System.out.println("Последовательно введите позицию старта и окончания подстроки");
                    System.out.println("Подстрока строки '"+string+"' c введенными параметрами это '"+string.substring(scanner.nextInt(),scanner.nextInt()));
                break;
      /*          case "8":
                    System.out.println("Подстрока строки '"+string+"' c введенными параметрами это '"+string.toString(scanner.nextInt(),scanner.nextInt()));
                break;
*/
            }
            System.out.println();

            //test2(5,"ss3");


           // int count =Integer.valueOf(result);
            //for (int i = 1; i <= count ; i++) {
             //   System.out.println("Прыжок "+i);




        }
    }
}

